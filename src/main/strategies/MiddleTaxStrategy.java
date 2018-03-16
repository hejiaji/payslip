package main.strategies;

public class MiddleTaxStrategy extends TaxStrategy {
    public MiddleTaxStrategy(long grossIncome) {
        super(grossIncome);
        this.setBasicTax(3572.0);
        this.setTaxPoint(37000.0);
        this.setTaxRate(0.325);
    }
}
