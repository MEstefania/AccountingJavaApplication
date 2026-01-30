package org.tatajavaclients.service;

import org.tatajavaclients.dto.ClienteDTO;
import org.tatajavaclients.dto.respuestaBase.BaseResponseDTO;
import org.tatajavaclients.dto.respuestaBase.BaseResponseSimpleDTO;

public interface ClienteService {
    BaseResponseDTO crearCliente(ClienteDTO cliente);
    BaseResponseSimpleDTO obtenerCliente(Long idCliente);
    BaseResponseDTO obtenerTodosLosClientes();
    BaseResponseDTO actualizarCliente(ClienteDTO cliente, Long idCliente);
    BaseResponseDTO eliminarCliente(Long idCliente);
}
