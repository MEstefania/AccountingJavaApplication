package org.tatajavaclients.service;

import org.tatajavaclients.dto.ClienteRequestDTO;
import org.tatajavaclients.dto.respuestaBase.BaseResponseDTO;
import org.tatajavaclients.dto.respuestaBase.BaseResponseSimpleDTO;

public interface ClienteService {
    BaseResponseDTO crearCliente(ClienteRequestDTO cliente);
    BaseResponseSimpleDTO obtenerCliente(Long idCliente);
    BaseResponseDTO obtenerTodosLosClientes();
    BaseResponseDTO actualizarCliente(ClienteRequestDTO cliente, Long idCliente);
    BaseResponseDTO eliminarCliente(Long idCliente);
}
