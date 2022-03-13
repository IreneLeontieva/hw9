package qaguru;

import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestJackson {

    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/resources/sample.json");

    @Test
    void jsonParse() throws Exception {
        Student student = objectMapper.readValue(file, Student.class);
        assertThat(student.getFirstName()).isEqualTo("Irina");
        assertThat(student.getLastName()).isEqualTo("Leonteva");
        assertThat(student.getAddress().getCity()).isEqualTo("Moscow");
        assertThat(student.getFavoriteFood()).contains("noodles");
    }

}
