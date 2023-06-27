package com.example.QualityAssurance;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CurrencyRepository {
    public List<Currency> currencies;

    public CurrencyRepository() {
        currencies = new ArrayList<>();
        addCurrency("AED", "UAE Dirham");
        addCurrency("AFN", "Afghan Afghani");
        addCurrency("ALL", "Albanian Lek");
        addCurrency("AMD", "Armenian Dram");
        addCurrency("ANG", "Netherlands Antillian Guilder");
        addCurrency("AOA", "Angolan Kwanza");
        addCurrency("ARS", "Argentine Peso");
        addCurrency("AUD", "Australian Dollar");
        addCurrency("AWG", "Aruban Florin");
        addCurrency("AZN", "Azerbaijani Manat");
        addCurrency("BAM", "Bosnia and Herzegovina Mark");
        addCurrency("BBD", "Barbados Dollar");
        addCurrency("BDT", "Bangladeshi Taka");
        addCurrency("BGN", "Bulgarian Lev");
        addCurrency("BHD", "Bahraini Dinar");
        addCurrency("BIF", "Burundian Franc");
        addCurrency("BMD", "Bermudian Dollar");
        addCurrency("BND", "Brunei Dollar");
        addCurrency("BOB", "Bolivian Boliviano");
        addCurrency("BRL", "Brazilian Real");
        addCurrency("BSD", "Bahamian Dollar");
        addCurrency("BTN", "Bhutanese Ngultrum");
        addCurrency("BWP", "Botswana Pula");
        addCurrency("BYN", "Belarusian Ruble");
        addCurrency("BZD", "Belize Dollar");
        addCurrency("CAD", "Canadian Dollar");
        addCurrency("CDF", "Congolese Franc");
        addCurrency("CHF", "Swiss Franc");
        addCurrency("CLP", "Chilean Peso");
        addCurrency("CNY", "Chinese Renminbi");
        addCurrency("COP", "Colombian Peso");
        addCurrency("CRC", "Costa Rican Colon");
        addCurrency("CUP", "Cuban Peso");
        addCurrency("CVE", "Cape Verdean Escudo");
        addCurrency("CZK", "Czech Koruna");
        addCurrency("DJF", "Djiboutian Franc");
        addCurrency("DKK", "Danish Krone");
        addCurrency("DOP", "Dominican Peso");
        addCurrency("DZD", "Algerian Dinar");
        addCurrency("EGP", "Egyptian Pound");
        addCurrency("ERN", "Eritrean Nakfa");
        addCurrency("ETB", "Ethiopian Birr");
        addCurrency("EUR", "Euro");
        addCurrency("FJD", "Fiji Dollar");
        addCurrency("FKP", "Falkland Islands Pound");
        addCurrency("FOK", "Faroese Króna");
        addCurrency("GBP", "Pound Sterling");
        addCurrency("GEL", "Georgian Lari");
        addCurrency("GGP", "Guernsey Pound");
        addCurrency("GHS", "Ghanaian Cedi");
        addCurrency("GIP", "Gibraltar Pound");
        addCurrency("GMD", "Gambian Dalasi");
        addCurrency("GNF", "Guinean Franc");
        addCurrency("GTQ", "Guatemalan Quetzal");
        addCurrency("GYD", "Guyanese Dollar");
        addCurrency("HKD", "Hong Kong Dollar");
        addCurrency("HNL", "Honduran Lempira");
        addCurrency("HRK", "Croatian Kuna");
        addCurrency("HTG", "Haitian Gourde");
        addCurrency("HUF", "Hungarian Forint");
        addCurrency("IDR", "Indonesian Rupiah");
        addCurrency("ILS", "Israeli New Shekel");
        addCurrency("IMP", "Manx Pound");
        addCurrency("INR", "Indian Rupee");
        addCurrency("IQD", "Iraqi Dinar");
        addCurrency("IRR", "Iranian Rial");
        addCurrency("ISK", "Icelandic Króna");
        addCurrency("JEP", "Jersey Pound");
        addCurrency("JMD", "Jamaican Dollar");
        addCurrency("JOD", "Jordanian Dinar");
        addCurrency("JPY", "Japanese Yen");
        addCurrency("KES", "Kenyan Shilling");
        addCurrency("KGS", "Kyrgyzstani Som");
        addCurrency("KHR", "Cambodian Riel");
        addCurrency("KID", "Kiribati Dollar");
        addCurrency("KMF", "Comorian Franc");
        addCurrency("KRW", "South Korean Won");
        addCurrency("KWD", "Kuwaiti Dinar");
        addCurrency("KYD", "Cayman Islands Dollar");
        addCurrency("KZT", "Kazakhstani Tenge");
        addCurrency("LAK", "Lao Kip");
        addCurrency("LBP", "Lebanese Pound");
        addCurrency("LKR", "Sri Lanka Rupee");
        addCurrency("LRD", "Liberian Dollar");
        addCurrency("LSL", "Lesotho Loti");
        addCurrency("LYD", "Libyan Dinar");
        addCurrency("MAD", "Moroccan Dirham");
        addCurrency("MDL", "Moldovan Leu");
        addCurrency("MGA", "Malagasy Ariary");
        addCurrency("MKD", "Macedonian Denar");
        addCurrency("MMK", "Burmese Kyat");
        addCurrency("MNT", "Mongolian Tögrög");
        addCurrency("MOP", "Macanese Pataca");
        addCurrency("MRU", "Mauritanian Ouguiya");
        addCurrency("MUR", "Mauritian Rupee");
        addCurrency("MVR", "Maldivian Rufiyaa");
        addCurrency("MWK", "Malawian Kwacha");
        addCurrency("MXN", "Mexican Peso");
        addCurrency("MYR", "Malaysian Ringgit");
        addCurrency("MZN", "Mozambican Metical");
        addCurrency("NAD", "Namibian Dollar");
        addCurrency("NGN", "Nigerian Naira");
        addCurrency("NIO", "Nicaraguan Córdoba");
        addCurrency("NOK", "Norwegian Krone");
        addCurrency("NPR", "Nepalese Rupee");
        addCurrency("NZD", "New Zealand Dollar");
        addCurrency("OMR", "Omani Rial");
        addCurrency("PAB", "Panamanian Balboa");
        addCurrency("PEN", "Peruvian Sol");
        addCurrency("PGK", "Papua New Guinean Kina");
        addCurrency("PHP", "Philippine Peso");
        addCurrency("PKR", "Pakistani Rupee");
        addCurrency("PLN", "Polish Złoty");
        addCurrency("PYG", "Paraguayan Guarani");
        addCurrency("QAR", "Qatari Riyal");
        addCurrency("RON", "Romanian Leu");
        addCurrency("RSD", "Serbian Dinar");
        addCurrency("RUB", "Russian Ruble");
        addCurrency("RWF", "Rwandan Franc");
        addCurrency("SAR", "Saudi Riyal");
        addCurrency("SBD", "Solomon Islands Dollar");
        addCurrency("SCR", "Seychellois Rupee");
        addCurrency("SDG", "Sudanese Pound");
        addCurrency("SEK", "Swedish Krona");
        addCurrency("SGD", "Singapore Dollar");
        addCurrency("SHP", "Saint Helena Pound");
        addCurrency("SLL", "Sierra Leonean Leone");
        addCurrency("SOS", "Somali Shilling");
        addCurrency("SRD", "Surinamese Dollar");
        addCurrency("SSP", "South Sudanese Pound");
        addCurrency("STN", "São Tomé and Príncipe Dobra");
        addCurrency("SYP", "Syrian Pound");
        addCurrency("SZL", "Eswatini Lilangeni");
        addCurrency("THB", "Thai Baht");
        addCurrency("TJS", "Tajikistani Somoni");
        addCurrency("TMT", "Turkmenistan Manat");
        addCurrency("TND", "Tunisian Dinar");
        addCurrency("TOP", "Tongan Pa'anga");
        addCurrency("TRY", "Turkish Lira");
        addCurrency("TTD", "Trinidad and Tobago Dollar");
        addCurrency("TVD", "Tuvaluan Dollar");
        addCurrency("TWD", "New Taiwan Dollar");
        addCurrency("TZS", "Tanzanian Shilling");
        addCurrency("UAH", "Ukrainian Hryvnia");
        addCurrency("UGX", "Ugandan Shilling");
        addCurrency("USD", "United States Dollar");
        addCurrency("UYU", "Uruguayan Peso");
        addCurrency("UZS", "Uzbekistani So'm");
        addCurrency("VES", "Venezuelan Bolívar Soberano");
        addCurrency("VND", "Vietnamese Đồng");
        addCurrency("VUV", "Vanuatu Vatu");
        addCurrency("WST", "Samoan Tala");
        addCurrency("XAF", "Central African CFA Franc");
        addCurrency("XCD", "East Caribbean Dollar");
        addCurrency("XDR", "Special Drawing Rights");
        addCurrency("XOF", "West African CFA franc");
        addCurrency("XPF", "CFP Franc");
        addCurrency("YER", "Yemeni Rial");
        addCurrency("ZAR", "South African Rand");
        addCurrency("ZMW", "Zambian Kwacha");
    }
    private void addCurrency(String code, String name) {
        currencies.add(new Currency(code, name));
    }
    public List<Currency> getAllCurrencies() {
        return currencies;
    }

    public boolean hasCurrency(String code) {
        for (Currency currency : currencies) {
            if (currency.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

}
