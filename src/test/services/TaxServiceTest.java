package test.services;

import main.services.TaxService;
import main.strategies.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxServiceTest {
    private TaxService taxService = TaxService.getInstance();
    private Double grossIncome;

    @Test
    public void should_return_correct_tax_when_use_non_tax_strategy() {
        this.grossIncome = 10000.0;

        TaxStrategy taxStrategy = new NonTaxStrategy(grossIncome);
        Double expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(doubles = {18201.0, 20000.0, 37000.0})
    public void should_return_correct_tax_when_use_low_tax_strategy(double value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new LowTaxStrategy(grossIncome);
        Double expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(doubles = {37001.0, 50000.0, 87000.0})
    public void should_return_correct_tax_when_use_middle_tax_strategy(double value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new MiddleTaxStrategy(grossIncome);
        Double expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(doubles = {87001.0, 150000.0, 180000.0})
    public void should_return_correct_tax_when_use_above_middle_tax_strategy(double value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new AboveMiddleTaxStrategy(grossIncome);
        Double expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(doubles = {180001.0, 500000.0, 1000000.0})
    public void should_return_correct_tax_when_use_high_tax_strategy(double value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new HighTaxStrategy(grossIncome);
        Double expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }
}
