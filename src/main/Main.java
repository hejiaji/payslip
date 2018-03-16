package main;

import main.dtos.PersonInputDTO;
import main.entities.PaySlip;
import main.helpers.DateHelper;
import main.helpers.JsonHelper;
import main.services.PaySlipService;
import main.services.TaxService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        try {
            List<PersonInputDTO> personInputDTOList = JsonHelper.loadFromJSON("src/main/files/input.json");

            List<PaySlip> paySlipList = personInputDTOList.stream()
                    .map(PaySlipService::getPaySlip)
                    .collect(toList());

            JsonHelper.generateJSON("src/main/files/output.json", paySlipList);
            System.out.println("Successfully generate the paySlip files.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
