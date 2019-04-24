/**
 * 
 */
package com.test.country.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * @author home
 *
 */
@Resource
public class CountryCardCollection {

	Map<String,List<CountryCard>> countryCardCollection;

	public Map<String, List<CountryCard>> getCountryCardCollection() {
		return countryCardCollection;
	}

	public void setCountryCardCollection(Map<String, List<CountryCard>> countryCardCollection) {
		this.countryCardCollection = countryCardCollection;
	}
	
}
