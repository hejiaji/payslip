package main.strategies;

public class LowTaxStrategy extends TaxStrategy {
    public LowTaxStrategy(Double grossIncome) {
        super(grossIncome);
        this.setBasicTax(0.0);
        this.setTaxPoint(18200.0);
        this.setTaxRate(0.19);
    }
}
