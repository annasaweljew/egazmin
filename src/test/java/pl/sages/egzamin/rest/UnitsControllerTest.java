package pl.sages.egzamin.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@AutoConfigureMockMvc
@SpringBootTest
class UnitsControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldReturnOKStatusForProperRequest() throws Exception {
        mockMvc.perform(get("/available-units")
                .param("wood","45")
                .param("gold","50"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}