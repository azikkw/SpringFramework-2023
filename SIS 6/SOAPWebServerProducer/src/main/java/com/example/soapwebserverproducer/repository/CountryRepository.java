package com.example.soapwebserverproducer.repository;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);

        Country ru = new Country();
        ru.setName("Russia");
        ru.setCapital("Moscow");
        ru.setCurrency(Currency.RUB);
        ru.setPopulation(143000000);

        countries.put(ru.getName(), ru);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }

    public Country findCountryByCapital(String capital) {
        return countries.values().stream().filter(country -> country.getCapital().equals(capital)).findFirst().orElse(null);
    }

    public Country findCountryByCurrency(Currency currency) {
        return countries.values().stream().filter(country -> country.getCurrency().equals(currency)).findFirst().orElse(null);
    }

    public Country findCountryByPopulation(int population) {
        return countries.values().stream().filter(country -> country.getPopulation() == population).findFirst().orElse(null);
    }

    public Country findTheMostPopulatedCountry() {
        int max = countries.values().stream().mapToInt(Country::getPopulation).filter(country -> country >= 0).max().orElse(0);
        return countries.values().stream().filter(country -> country.getPopulation() == max).findFirst().orElse(null);
    }

}