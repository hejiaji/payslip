package main.strategies;

public class HighTaxStrategy extends TaxStrategy {
    public HighTaxStrategy(Double annualSalary) {
        super(annualSalary);
        this.setBasicTax(54232.0);
        this.setTaxPoint(180000.0);
        this.setTaxRate(0.45);
    }
}
