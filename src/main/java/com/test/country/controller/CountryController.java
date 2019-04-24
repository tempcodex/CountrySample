/**
 * 
 */
package com.test.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.country.model.CountryCard;
import com.test.country.service.CountryService;

/**
 * @author home
 *
 */

@RestController
public class CountryController {
	
	@Autowired
	CountryService countryService;

	@RequestMapping("/{countryName}")
	public List<CountryCard> getCountryCards(@PathVariable String countryName){
		return countryService.getCountryCards(countryName);
	}
	
}
