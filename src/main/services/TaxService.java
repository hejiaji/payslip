package main.services;

import main.strategies.*;

public class TaxService {
    private static TaxService instance = new TaxService();

    private TaxService() {
    }

    public static TaxService getInstance() {
        return instance;
    }

    public Double calculateTax(Double grossIncome) {
        TaxStrategy taxStrategy = getTaxStrategy(grossIncome);
        return taxStrategy.calculateTax();
    }

    private TaxStrategy getTaxStrategy(Double grossIncome) {
        if (isInRange(grossIncome, 18200.0)) {
            return new NonTaxStrategy(grossIncome);
        } else if (isInRange(grossIncome, 18200.0, 37000.0)) {
            return new LowTaxStrategy(grossIncome);
        } else if (isInRange(grossIncome,37000.0, 87000.0)) {
            return new MiddleTaxStrategy(grossIncome);
        } else if (isInRange(grossIncome,87000.0, 180000.0)) {
            return new AboveMiddleTaxStrategy(grossIncome);
        } else {
            return new HighTaxStrategy(grossIncome);
        }
    }

    private boolean isInRange(Double grossIncome, Double lowPoint, Double highPoint) {
        return grossIncome > lowPoint && isInRange(grossIncome, highPoint);
    }

    private boolean isInRange(Double grossIncome, Double highPoint) {
        return grossIncome <= highPoint;
    }
}
