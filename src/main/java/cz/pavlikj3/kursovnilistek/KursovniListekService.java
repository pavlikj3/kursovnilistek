package cz.pavlikj3.kursovnilistek;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cz.pavlikj3.kursovnilistek.kb.KursovniListekKb;

@Service
public class KursovniListekService {

	public List<KursovniListek> loadFromKb()
	{
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "https://api.kb.cz/openapi/v1/exchange-rates";
		ResponseEntity<KursovniListekKb[]> response
		  = restTemplate.getForEntity(fooResourceUrl, KursovniListekKb[].class);
		return response.getBody()[0].getExchangeRates();
	}
}
