# Kursovní lístek
## Základní popis
Moje první aplikace v bootstrapu. Slouží k zobrazení/načtení kursů měn z různých
zdrojů.

Po spuštění je uživatelovi přístupná v prohlížeči stránka s kursy měn na url: [http://localhost:8080](http://localhost:8080).

Na této stránce jsou kurzy ze 3 zdrojů dat: 
* Přímo z restové služby banky (https://api.kb.cz/openapi/v1/exchange-rates)
* Z vlastní restové služby z dat z db (http://localhost:8080/api/kurs)
* Z vlastní restové služby z dat, která jsou načtena z banky (http://localhost:8080/api/kursKb)

## Konfigurace
Provádí se před kompilací editací souborů src/main/resources/application.properties a to těchto parametrů připojení do databáze:
* spring.datasource.url=jdbc:mysql://localhost:3306/kursovnilistek
* spring.datasource.username=taskpool
* spring.datasource.password=taskpool

**Databáze musí existovat a db uživatel k ní musí mít přístup.** 

## Kompilace
Pro kompilaci je potřeba mít nainstalovaný maven a jdk nejméně verze 1.8.

Samotná kompilace se spustí příkazem:

```bash
mvn clean package
```
V případě problémů s testem zakažte testy při kompilaci:

```bash
mvn clean package -DskipTests
```

Po úspěšném kompilace ja ve složce target javovský spustitelný balík: **kursovnilistek-0.0.1-SNAPSHOT.jar**
## Spuštění

```bash
java -jar kursovnilistek-0.0.1-SNAPSHOT.jar
```
 
A poté v prohlížečí zadejte url: [http://localhost:8080](http://localhost:8080)

## Autor
Jan Pavlík (pavlikj3@seznam.cz)
