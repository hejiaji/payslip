package main.strategies;

public abstract class TaxStrategy {
    private Double basicTax;

    private Double taxPoint;

    private Double taxRate;

    protected long grossIncome;

    public TaxStrategy(long grossIncome) {
        this.grossIncome = grossIncome;
    }

    public long calculateTax() {
        Double result = this.getBasicTax() + ((this.grossIncome - this.taxPoint) * this.getTaxRate());
        return result.longValue();
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
