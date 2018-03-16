package main.services;

import main.dtos.PersonInputDTO;
import main.entities.PaySlip;

public class PaySlipService {
    static PaySlip getPaySlip(PersonInputDTO personInputDTO) {
        String name = String.format("%s %s",personInputDTO.getFirstName(), personInputDTO.getLastName());
        long grossIncome = Math.round(personInputDTO.getAnnualSalary() / 12);
        long incomeTax = TaxService.getInstance().calculateTax(grossIncome);
        return new PaySlip();
    }
}
