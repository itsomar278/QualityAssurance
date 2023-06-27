package com.example.QualityAssurance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CurrencyRepositoryTest {
    private CurrencyRepository currencyRepository;

    @BeforeEach
    public void setUp() {
        currencyRepository = new CurrencyRepository();
    }

    @Test
    public void testGetAllCurrencies() {
        List<Currency> currencies = currencyRepository.getAllCurrencies();

        // Assert that the currencies list is not null and contains some elements
        Assertions.assertNotNull(currencies);
        Assertions.assertFalse(currencies.isEmpty());

        // Assert specific currencies if needed
        // Example: Assert that the list contains a currency with code "USD"
        boolean containsUSDCurrency = currencies.stream().anyMatch(c -> c.getCode().equals("USD"));
        Assertions.assertTrue(containsUSDCurrency);
        // Assert that list contains 160 currency
        Assertions.assertEquals(160,currencies.size());
    }
}
