package main.services;

import main.dtos.PersonInputDTO;
import main.entities.PaySlip;
import main.helpers.DateHelper;

public class PaySlipService {
    public static PaySlip getPaySlip(PersonInputDTO personInputDTO) {
        String name = String.format("%s %s",personInputDTO.getFirstName(), personInputDTO.getLastName());
        long grossIncome = calculateGrossIncome(personInputDTO.getAnnualSalary(), personInputDTO.getPaymentStartDate());
        long incomeTax = TaxService.getInstance().calculateTax(personInputDTO.getAnnualSalary());
        long netIncome = grossIncome - incomeTax;
        long superPrice = Math.round(grossIncome * personInputDTO.getSuperRate() / 100);
        return new PaySlip(name, personInputDTO.getPaymentStartDate(), grossIncome, incomeTax, netIncome, superPrice);
    }

    public static long calculateGrossIncome(Double annualSalary, String paymentStartDate) {
        Double percentage = DateHelper.getPercentageOfTheMonth(paymentStartDate);
        return Math.round(annualSalary / 12 * percentage / 100);
    }
}
