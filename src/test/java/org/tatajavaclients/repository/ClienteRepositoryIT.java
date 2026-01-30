package org.tatajavaclients.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
import org.tatajavaclients.model.Cliente;
import org.tatajavaclients.repository.ClienteRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
public class ClienteRepositoryIT {
    @Autowired
    private ClienteRepository clienteRepository;

    //Prueba de integración repositorio + BBDD
    @Test
    void guardarYBuscarCliente(){
        Cliente newCliente = new Cliente();
        newCliente.setIdentificacion("1234567892");
        newCliente.setNombre("Mishell Castillo");
        newCliente.setDireccion("Quito");
        newCliente.setTelefono("0999999999");
        newCliente.setContrasenia("123456");
        newCliente.setEstado(Boolean.TRUE);
        newCliente.setEdad(24);
        clienteRepository.save(newCliente);
        Optional<Cliente>  miCliente = clienteRepository.findByIdentificacion("1234567892");
        assertTrue(miCliente.isPresent());
    }
}
