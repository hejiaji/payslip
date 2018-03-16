package main.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaySlip {
    private String name;
    private String payPeriod;
    private Double grossIncome;
    private Double incomeTax;
    private Double netIncome;
    @JsonProperty("super")
    private Double superPrice;

    public PaySlip() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public Double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(Double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public Double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(Double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public Double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(Double netIncome) {
        this.netIncome = netIncome;
    }

    public Double getSuperPrice() {
        return superPrice;
    }

    public void setSuperPrice(Double superPrice) {
        this.superPrice = superPrice;
    }
}
