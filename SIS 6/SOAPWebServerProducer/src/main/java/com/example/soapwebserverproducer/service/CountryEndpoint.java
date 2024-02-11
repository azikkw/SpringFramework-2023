package com.example.soapwebserverproducer.service;

import com.example.soapwebserverproducer.repository.CountryRepository;
import io.spring.guides.gs_producing_web_service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryByCapitalRequest")
    @ResponsePayload
    public GetCountryByCapitalResponse getCountryByCapital(@RequestPayload GetCountryByCapitalRequest request) {
        GetCountryByCapitalResponse response = new GetCountryByCapitalResponse();
        response.setCountry(countryRepository.findCountryByCapital(request.getCapital()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryByCurrencyRequest")
    @ResponsePayload
    public GetCountryByCurrencyResponse getCountryByCurrency(@RequestPayload GetCountryByCurrencyRequest request) {
        GetCountryByCurrencyResponse response = new GetCountryByCurrencyResponse();
        response.setCountry(countryRepository.findCountryByCurrency(request.getCurrency()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryByPopulationRequest")
    @ResponsePayload
    public GetCountryByPopulationResponse getCountryByPopulation(@RequestPayload GetCountryByPopulationRequest request) {
        GetCountryByPopulationResponse response = new GetCountryByPopulationResponse();
        response.setCountry(countryRepository.findCountryByPopulation(request.getPopulation()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMostPopulatedCountryRequest")
    @ResponsePayload
    public GetMostPopulatedCountryResponse getMostPopulatedCountry(@RequestPayload GetMostPopulatedCountryRequest request) {
        GetMostPopulatedCountryResponse response = new GetMostPopulatedCountryResponse();
        response.setCountry(countryRepository.findTheMostPopulatedCountry());

        return response;
    }

}