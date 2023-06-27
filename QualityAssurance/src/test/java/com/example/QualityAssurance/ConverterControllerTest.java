package com.example.QualityAssurance;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration
@SpringBootTest
class ConverterControllerTest {

    @Mock
    private ConverterController converterController;
    @Mock
    private static CurrencyRepository currencyRepository ;


    @BeforeEach
    public void setup() {
        // Initialize the mock objects
        MockitoAnnotations.openMocks(this);

        // Create an instance of the converterController
        converterController = new ConverterController();

        // Set the mocked repository in the controller
        converterController.currencyRepository = currencyRepository;
    }
    @Test
    public void convert() {
        when(currencyRepository.getAllCurrencies()).thenReturn(new ArrayList<Currency>());
        var modelAndView =  converterController.Convert();
        Assertions.assertEquals("converter.html",modelAndView.getViewName());
        Assertions.assertNotNull(modelAndView.getModel());
    }
    @Test
    void testMyValidation_InvalidFromCurrency() {
        fromToRequest request = new fromToRequest();
        request.fromCurrency = "";
        request.toCurrency = "USD";
        request.amount = 100;
        boolean result = converterController.MyValidation(request);
        Assertions.assertFalse(result);
    }

    @Test
    void testMyValidation_InvalidToCurrency() {
        fromToRequest request = new fromToRequest();
        request.fromCurrency = "EUR";
        request.toCurrency = "";
        request.amount = 100;
        boolean result = converterController.MyValidation(request);
        Assertions.assertFalse(result);
    }

    @Test
    void testMyValidation_InvalidAmount() {
        fromToRequest request = new fromToRequest();
        request.fromCurrency = "EUR";
        request.toCurrency = "USD";
        request.amount = -100;
        boolean result = converterController.MyValidation(request);
        Assertions.assertFalse(result);
    }

    @Test
    void testMyValidation_CurrencyNotFound() {
        fromToRequest request = new fromToRequest();
        request.fromCurrency = "EUR";
        request.toCurrency = "PPP";
        request.amount = 100;
        when(currencyRepository.hasCurrency(anyString())).thenReturn(false);
        boolean result = converterController.MyValidation(request);
        Assertions.assertFalse(result);
    }

    @Test
    void testMyValidation_ValidRequest() {
        fromToRequest request = new fromToRequest();
        request.fromCurrency = "EUR";
        request.toCurrency = "USD";
        request.amount = 100;
        when(currencyRepository.hasCurrency(anyString())).thenReturn(true);
        boolean result = converterController.MyValidation(request);
        Assertions.assertTrue(result);
    }
    @Test
    void testFailureResponse() {
        // Create the request object
        fromToRequest request = new fromToRequest();
        request.fromCurrency = "EUR";
        request.toCurrency = "USD";

        // Call the failureResponse method
        ExchangeRateResponse result = converterController.failureResponse(request);

        // Perform assertions
        Assertions.assertEquals("failure", result.getResult());
        Assertions.assertEquals(0.0, result.getConversion_rate());
        Assertions.assertEquals(0.0, result.getConversion_result());
        Assertions.assertEquals("EUR", result.getBase_code());
        Assertions.assertEquals("USD", result.getTarget_code());
    }
    @Test
    void testSuccessResponse() {
        // Create the request object
        fromToRequest request = new fromToRequest();
        request.fromCurrency = "EUR";
        request.toCurrency = "USD";
        request.amount = 100;

        // Set the rate value
        double rate = 1.5;

        // Call the SuccessResponse method
        ExchangeRateResponse result = converterController.SuccessResponse(request, rate);

        // Perform assertions
        Assertions.assertEquals(rate, result.getConversion_rate());
        Assertions.assertEquals("success", result.getResult());
        Assertions.assertEquals("EUR", result.getBase_code());
        Assertions.assertEquals("USD", result.getTarget_code());
        Assertions.assertEquals(rate * request.amount, result.getConversion_result());
    }


}