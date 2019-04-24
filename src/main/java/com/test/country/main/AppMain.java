package com.test.country.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.country.model.CountryCard;
import com.test.country.model.CountryCardCollection;
import com.test.country.service.CountryService;

public class AppMain {
	
	@Autowired
	CountryService countryService;

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-web-servlet.xml");
		
//		CountryService countrySerivce = (CountryService) applicationContext.getBean("CountryService");
		/*
		 * AppMain main = new AppMain(); main.callService();
		 */
		
		CountryCardCollection countryCards = (CountryCardCollection) applicationContext.getBean("countryCardCollection");
		//System.out.println(countryCards.getCountryCardCollection());
		Map<String,List<CountryCard>> countryCardsMap = countryCards.getCountryCardCollection();
		for(String country:countryCardsMap.keySet()) {
			System.out.println(countryCardsMap.get(country).toString());
		}
		
	}

	private void callService() {

		List<CountryCard> countryCards = countryService.getCountryCards("Albania");
		
		for(CountryCard countryCard:countryCards) {
			System.out.println(countryCard.toString());
		}
	}

}
