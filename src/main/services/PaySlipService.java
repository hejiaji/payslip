package main.services;

import main.dtos.PersonDTO;
import main.entities.PaySlip;
import main.helpers.DateHelper;

public class PaySlipService {
    public static PaySlip getPaySlip(PersonDTO personDTO) {
        String name = String.format("%s %s", personDTO.getFirstName(), personDTO.getLastName());
        long grossIncome = calculateGrossIncome(personDTO.getAnnualSalary(), personDTO.getPaymentStartDate());
        long incomeTax = TaxService.getInstance().calculateTax(personDTO.getAnnualSalary());
        long netIncome = grossIncome - incomeTax;
        long superPrice = Math.round(grossIncome * personDTO.getSuperRate() / 100);
        return new PaySlip(name, personDTO.getPaymentStartDate(), grossIncome, incomeTax, netIncome, superPrice);
    }

    public static long calculateGrossIncome(Double annualSalary, String paymentStartDate) {
        Double percentage = DateHelper.getPercentageOfTheMonth(paymentStartDate);
        return Math.round(annualSalary / 12 * percentage / 100);
    }
}
