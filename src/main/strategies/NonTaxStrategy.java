package main.strategies;

public class NonTaxStrategy extends TaxStrategy {
    public NonTaxStrategy(Double annualSalary) {
        super(annualSalary);
    }

    @Override
    public long calculateTax() {
        return 0;
    }
}
