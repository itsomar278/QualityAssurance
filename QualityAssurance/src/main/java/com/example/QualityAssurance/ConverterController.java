package com.example.QualityAssurance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@RestController
public class ConverterController {
    @Autowired
    public CurrencyRepository currencyRepository;
    public List<Currency> currencies;
    private static final String API_KEY = "54ac26c9b24985a0b66ed777";
    private static final String API_ENDPOINT = "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s";

    @GetMapping("/Converter")
    public ModelAndView Convert() {
        currencyRepository = new CurrencyRepository();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("converter.html");
        currencies = currencyRepository.getAllCurrencies();
        modelAndView.addObject("currencies", currencies);
        return modelAndView;
    }

    @PostMapping("/exchange-rate")
    public ResponseEntity<ExchangeRateResponse> getExchangeRateFromAPI(@RequestBody fromToRequest response) throws IOException {
        String fromCurrency = response.fromCurrency;
        String toCurrency = response.toCurrency;
        double amount = response.amount;
        ExchangeRateResponse exchangeRateResponse = new ExchangeRateResponse();
        if (!MyValidation(response)) {
            return ResponseEntity.ok(failureResponse(response));
        }
        double rate = ConsumeExternalApi(response);
        if(rate==0.0)
        {
            return ResponseEntity.ok(failureResponse(response));
        }
        return ResponseEntity.ok(SuccessResponse(response,rate));
    }

    public boolean MyValidation(fromToRequest request) {

        if (request.fromCurrency.isEmpty() || request.toCurrency.isEmpty()) {
            return false;
        } else if (request.amount < 0 || !currencyRepository.hasCurrency(request.fromCurrency) || !currencyRepository.hasCurrency(request.fromCurrency)) {
            return false;
        } else {
            return true;
        }
    }

    public ExchangeRateResponse failureResponse(fromToRequest request) {
        ExchangeRateResponse exchangeRateResponse = new ExchangeRateResponse();
        exchangeRateResponse.setResult("failure");
        exchangeRateResponse.setConversion_rate(0.0);
        exchangeRateResponse.setConversion_result(0.0);
        exchangeRateResponse.setBase_code(request.fromCurrency);
        exchangeRateResponse.setTarget_code(request.toCurrency);
        return exchangeRateResponse;
    }

    public double ConsumeExternalApi(fromToRequest request) throws IOException {
        String apiUrl = String.format(API_ENDPOINT, API_KEY, request.fromCurrency, request.toCurrency);
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) connection.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();
            if (jsonobj.has("conversion_rate"))
            {
                return jsonobj.get("conversion_rate").getAsDouble();
            }

        }
        else {
            throw new IOException();
        }
         return 0.0 ;
    }
    public ExchangeRateResponse SuccessResponse(fromToRequest request , double rate)
    {
        ExchangeRateResponse exchangeRateResponse = new ExchangeRateResponse();
        exchangeRateResponse.setConversion_rate(rate);
        exchangeRateResponse.setResult("success");
        exchangeRateResponse.setBase_code(request.fromCurrency);
        exchangeRateResponse.setTarget_code(request.toCurrency);
        exchangeRateResponse.setConversion_result(rate * request.amount);
        return exchangeRateResponse;
    }

}
