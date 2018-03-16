package test.services;

import main.dtos.PersonDTO;
import main.entities.PaySlip;
import main.services.PaySlipService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaySlipServiceTest {
    @Test
    public void should_return_the_pay_slip_when_execute_get_pay_slip_given_person_dto_with_full_month() {
        PersonDTO personDTO = new PersonDTO("David", "Rudd", 60050.0, 9.0, "01 March - 31 March");

        PaySlip paySlip = PaySlipService.getPaySlip(personDTO);

        assertEquals("David Rudd", paySlip.getName());
        assertEquals("01 March - 31 March", paySlip.getPayPeriod());
        assertEquals(5004, paySlip.getGrossIncome());
        assertEquals(922, paySlip.getIncomeTax());
        assertEquals(4082, paySlip.getNetIncome());
        assertEquals(450, paySlip.getSuperPrice());

        personDTO = new PersonDTO("Ryan", "Chen", 120000.0, 10.0, "01 March - 31 March");
        paySlip = PaySlipService.getPaySlip(personDTO);

        assertEquals("Ryan Chen", paySlip.getName());
        assertEquals("01 March - 31 March", paySlip.getPayPeriod());
        assertEquals(10000, paySlip.getGrossIncome());
        assertEquals(2669, paySlip.getIncomeTax());
        assertEquals(7331, paySlip.getNetIncome());
        assertEquals(1000, paySlip.getSuperPrice());
    }

    @Test
    public void should_return_the_pay_slip_when_execute_get_pay_slip_given_person_dto_with_partial_month() {
        PersonDTO personDTO = new PersonDTO("David", "Rudd", 60050.0, 9.0, "01 March - 15 March");

        PaySlip paySlip = PaySlipService.getPaySlip(personDTO);

        assertEquals("David Rudd", paySlip.getName());
        assertEquals("01 March - 15 March", paySlip.getPayPeriod());
        assertEquals(2421, paySlip.getGrossIncome());
        assertEquals(922, paySlip.getIncomeTax());
        assertEquals(1499, paySlip.getNetIncome());
        assertEquals(218, paySlip.getSuperPrice());
    }
}
