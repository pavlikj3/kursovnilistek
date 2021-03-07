package cz.pavlikj3.kursovnilistek.kb;

import java.util.List;

import cz.pavlikj3.kursovnilistek.KursovniListek;

public class KursovniListekKb {
	private List<KursovniListek> exchangeRates;

	public List<KursovniListek> getExchangeRates() {
		return exchangeRates;
	}

	public void setExchangeRates(List<KursovniListek> exchangeRates) {
		this.exchangeRates = exchangeRates;
	}	
}
