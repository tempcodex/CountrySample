/**
 * 
 */
package com.test.country.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.country.model.CountryCard;
import com.test.country.model.CountryCardCollection;

/**
 * @author home
 *
 */
@Service
public class CountryServiceImpl implements CountryService{

//	@Autowired
//	public Map<String,List<CountryCard>> countryCardCollection;
	@Resource
	public CountryCardCollection countryCardCollection;
	
	public List<CountryCard> getCountryCards(String countryName) {
		
		Map<String,List<CountryCard>> countryCardCollectionMap = countryCardCollection.getCountryCardCollection();
		
		List<CountryCard> countryCards = countryCardCollectionMap.get(countryName);
		
		if(null!=countryCards&&countryCards.size()>0) {
			return countryCards;
		}else {
			return null;
		}
		
	}

}
