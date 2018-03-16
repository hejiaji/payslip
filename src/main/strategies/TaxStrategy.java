package main.strategies;

public abstract class TaxStrategy {
    private Double basicTax;

    private Double taxPoint;

    private Double taxRate;

    protected Double annualSalary;

    public TaxStrategy(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public long calculateTax() {
        Double result = (this.getBasicTax() + ((this.annualSalary - this.getTaxPoint()) * this.getTaxRate())) / 12;
        return Math.round(result);
    }

    public Double getBasicTax() {
        return basicTax;
    }

    public void setBasicTax(Double basicTax) {
        this.basicTax = basicTax;
    }

    public Double getTaxPoint() {
        return taxPoint;
    }

    public void setTaxPoint(Double taxPoint) {
        this.taxPoint = taxPoint;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}
