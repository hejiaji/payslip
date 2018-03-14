package main.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.dtos.PersonInputDTO;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Initialization {
    static public List<PersonInputDTO> init() {
        List<PersonInputDTO> personInputDTOList = loadFromJSON();
        return Collections.emptyList();
    }

    static private List<PersonInputDTO> loadFromJSON() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(new File("src/main/input.json"), new TypeReference<List<PersonInputDTO>>(){});
        } catch (Exception e) {
            System.out.print(e.toString());
            return Collections.emptyList();
        }
    }
}
