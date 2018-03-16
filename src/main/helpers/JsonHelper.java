package main.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.dtos.PersonInputDTO;
import main.entities.PaySlip;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class JsonHelper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static List<PersonInputDTO> loadFromJSON(String path) throws Exception {
        return objectMapper.readValue(new File(path), new TypeReference<List<PersonInputDTO>>(){});
    }

    public static <T> void generateJSON(String path, List<T> list) throws Exception {
        objectMapper.writeValue(new File(path), list);
    }
}
