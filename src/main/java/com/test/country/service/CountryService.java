/**
 * 
 */
package com.test.country.service;

import java.util.List;

import com.test.country.model.CountryCard;

/**
 * @author home
 *
 */
public interface CountryService {

	List<CountryCard> getCountryCards(String countryName);

}
