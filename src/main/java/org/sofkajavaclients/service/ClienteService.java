package org.sofkajavaclients.service;

import org.sofkajavaclients.dto.ClienteDTO;
import org.sofkajavaclients.dto.respuestaBase.BaseResponseDTO;
import org.sofkajavaclients.dto.respuestaBase.BaseResponseSimpleDTO;

public interface ClienteService {
    BaseResponseDTO crearCliente(ClienteDTO cliente);
    BaseResponseSimpleDTO obtenerCliente(Long idCliente);
    BaseResponseDTO obtenerTodosLosClientes();
    BaseResponseDTO actualizarCliente(ClienteDTO cliente, Long idCliente);
    BaseResponseDTO eliminarCliente(Long idCliente);
}
