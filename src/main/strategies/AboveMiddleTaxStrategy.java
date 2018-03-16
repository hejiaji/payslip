package main.strategies;

public class AboveMiddleTaxStrategy extends TaxStrategy {
    public AboveMiddleTaxStrategy(Double grossIncome) {
        super(grossIncome);
        this.setBasicTax(19822.0);
        this.setTaxPoint(87000.0);
        this.setTaxRate(0.37);
    }
}
