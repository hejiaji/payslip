package test.services;

import main.services.TaxService;
import main.strategies.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxServiceTest {
    private TaxService taxService = TaxService.getInstance();
    private long grossIncome;

    @Test
    public void should_return_correct_tax_when_use_non_tax_strategy() {
        this.grossIncome = 10000;

        TaxStrategy taxStrategy = new NonTaxStrategy(grossIncome);
        long expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(longs = {18201, 20000, 37000})
    public void should_return_correct_tax_when_use_low_tax_strategy(long value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new LowTaxStrategy(grossIncome);
        long expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(longs = {37001, 50000, 87000})
    public void should_return_correct_tax_when_use_middle_tax_strategy(long value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new MiddleTaxStrategy(grossIncome);
        long expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(longs = {87001, 150000, 180000})
    public void should_return_correct_tax_when_use_above_middle_tax_strategy(long value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new AboveMiddleTaxStrategy(grossIncome);
        long expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }

    @ParameterizedTest
    @ValueSource(longs = {180001, 500000, 1000000})
    public void should_return_correct_tax_when_use_high_tax_strategy(long value) {
        this.grossIncome = value;

        TaxStrategy taxStrategy = new HighTaxStrategy(grossIncome);
        long expectedResult = taxStrategy.calculateTax();

        assertEquals(expectedResult, taxService.calculateTax(grossIncome));
    }
}
