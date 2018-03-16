package main.strategies;

public abstract class TaxStrategy {
    private Double basicTax;

    private Double taxPoint;

    private Double taxRate;

    protected Double grossIncome;

    public TaxStrategy(Double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public Double calculateTax() {
        return this.getBasicTax() + ((this.grossIncome - this.taxPoint) * this.getTaxRate());
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
