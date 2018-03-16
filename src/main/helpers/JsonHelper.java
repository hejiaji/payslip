package main.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.dtos.PersonInputDTO;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class JsonHelper {
    static public List<PersonInputDTO> loadFromJSON(String path) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(new File(path), new TypeReference<List<PersonInputDTO>>(){});
        } catch (Exception e) {
            System.out.print(e.toString());
            return Collections.emptyList();
        }
    }
}
