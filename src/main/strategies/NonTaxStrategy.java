package main.strategies;

public class NonTaxStrategy extends TaxStrategy {
    public NonTaxStrategy(long grossIncome) {
        super(grossIncome);
    }

    @Override
    public long calculateTax() {
        return 0;
    }
}
