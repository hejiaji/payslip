package main.services;

import main.strategies.*;

public class TaxService {
    private static TaxService instance = new TaxService();

    private TaxService() {
    }

    public static TaxService getInstance() {
        return instance;
    }

    public long calculateTax(Double annualSalary) {
        TaxStrategy taxStrategy = getTaxStrategy(annualSalary);
        return taxStrategy.calculateTax();
    }

    private TaxStrategy getTaxStrategy(Double annualSalary) {
        if (isInRange(annualSalary, 18200.0)) {
            return new NonTaxStrategy(annualSalary);
        } else if (isInRange(annualSalary, 18200.0, 37000.0)) {
            return new LowTaxStrategy(annualSalary);
        } else if (isInRange(annualSalary,37000.0, 87000.0)) {
            return new MiddleTaxStrategy(annualSalary);
        } else if (isInRange(annualSalary,87000.0, 180000.0)) {
            return new AboveMiddleTaxStrategy(annualSalary);
        } else {
            return new HighTaxStrategy(annualSalary);
        }
    }

    private boolean isInRange(Double annualSalary, Double lowPoint, Double highPoint) {
        return annualSalary > lowPoint && isInRange(annualSalary, highPoint);
    }

    private boolean isInRange(Double annualSalary, Double highPoint) {
        return annualSalary <= highPoint;
    }
}
