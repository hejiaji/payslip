package main.strategies;

public class LowTaxStrategy extends TaxStrategy {
    public LowTaxStrategy(Double annualSalary) {
        super(annualSalary);
        this.setBasicTax(0.0);
        this.setTaxPoint(18200.0);
        this.setTaxRate(0.19);
    }
}
