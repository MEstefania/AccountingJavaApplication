package org.tatajavaclients.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.tatajavaclients.dto.respuestaBase.BaseResponseDTO;
import org.tatajavaclients.dto.respuestaBase.ResponseBaseMapper;
import org.tatajavaclients.service.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc(addFilters = false)
public class ClienteControllerTest {
    @MockBean
    private ClienteServiceImpl service;

    @Autowired
    private MockMvc mvc;

    @Test
    public void testErrorNombreNullRequestCreateClient() throws Exception {
        BaseResponseDTO responseDTO = ResponseBaseMapper.generateOkResponseCreateUpdate(null);
        given(service.crearCliente(any())).willReturn(responseDTO);
        mvc.perform(
                        MockMvcRequestBuilders.post("/clientes")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n" +
                                        "    \"genero\":\"Femenino\",\n" +
                                        "    \"edad\":24,\n" +
                                        "    \"identificacion\":\"1234567897\", \n" +
                                        "    \"direccion\":\"13 junio y Equinoccial\",\n" +
                                        "    \"telefono\":\"098874587\",\n" +
                                        "    \"contrasenia\":\"1245\",\n" +
                                        "    \"estado\":\"True\"\n" +
                                        "}"))
                .andExpect(status().isBadRequest())
                .andDo(print())
                .andExpect(jsonPath("nombre", Matchers.is("El nombre no puede ser nulo.")));
    }
}
