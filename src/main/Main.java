package main;

import main.dtos.PersonInputDTO;
import main.helpers.DateHelper;
import main.helpers.JsonHelper;
import main.services.TaxService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        JsonHelper.init();
//        DateHelper.getPercentageOfTheMonth("01 March - 31 March");
        List<PersonInputDTO> personInputDTOList = JsonHelper.loadFromJSON("src/main/input.json");
        System.out.println("Hello World!");
    }
}
