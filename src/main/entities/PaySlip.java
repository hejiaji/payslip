package main.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaySlip {
    private String name;
    private String payPeriod;
    private long grossIncome;
    private long incomeTax;
    private long netIncome;
    @JsonProperty("super")
    private long superPrice;

    public PaySlip(String name, String payPeriod, long grossIncome, long incomeTax, long netIncome, long superPrice) {
        this.name = name;
        this.payPeriod = payPeriod;
        this.grossIncome = grossIncome;
        this.incomeTax = incomeTax;
        this.netIncome = netIncome;
        this.superPrice = superPrice;
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

    public long getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(long grossIncome) {
        this.grossIncome = grossIncome;
    }

    public long getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(long incomeTax) {
        this.incomeTax = incomeTax;
    }

    public long getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(long netIncome) {
        this.netIncome = netIncome;
    }

    public long getSuperPrice() {
        return superPrice;
    }

    public void setSuperPrice(long superPrice) {
        this.superPrice = superPrice;
    }
}
