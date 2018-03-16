package main.strategies;

public class NonTaxStrategy extends TaxStrategy {
    public NonTaxStrategy(Double grossIncome) {
        super(grossIncome);
    }

    @Override
    public Double calculateTax() {
        return 0.0;
    }
}
