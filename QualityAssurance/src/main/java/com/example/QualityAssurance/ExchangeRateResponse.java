package com.example.QualityAssurance;

public class ExchangeRateResponse {
    private String result;
    private double conversion_result;
    private String target_code;

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    private String base_code;
    private double conversion_rate;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }


    @Override
    public String toString() {
        return "ExchangeRateResponse{" +
                "result='" + result + '\'' +
                ", conversion_result=" + conversion_result +
                ", target_code='" + target_code + '\'' +
                ", base_code='" + base_code + '\'' +
                ", conversion_rate=" + conversion_rate +
                '}';
    }
}
