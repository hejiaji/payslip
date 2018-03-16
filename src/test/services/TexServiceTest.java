package test.services;

import main.services.TaxService;
import main.strategies.LowTaxStrategy;
import main.strategies.NonTaxStrategy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TexServiceTest {
    private TaxService taxService = TaxService.getInstance();
    private Double grossIncome;

    @Test
    public void should_return_correct_tax_when_use_non_tax_strategy() {
        this.grossIncome = 10000.0;

        NonTaxStrategy nonTaxStrategy = new NonTaxStrategy(grossIncome);
        Double expectedResult = nonTaxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(doubles = {18201.0, 20000.0, 37000.0})
    public void should_return_correct_tax_when_use_low_tax_strategy(double value) {
        this.grossIncome = value;

        LowTaxStrategy lowTaxStrategy = new LowTaxStrategy(grossIncome);
        Double expectedResult = lowTaxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @Test
    public void should_return_correct_tax_when_use_middle_tax_strategy() {
        this.grossIncome = 18201.0;

        LowTaxStrategy lowTaxStrategy = new LowTaxStrategy(grossIncome);
        Double expectedResult = lowTaxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }
}
