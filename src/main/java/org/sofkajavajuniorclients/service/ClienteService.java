package org.sofkajavajuniorclients.service;

import org.sofkajavajuniorclients.dto.ClienteDTO;
import org.sofkajavajuniorclients.dto.respuestaBase.BaseResponseDTO;
import org.sofkajavajuniorclients.dto.respuestaBase.BaseResponseSimpleDTO;

public interface ClienteService {
    BaseResponseDTO crearCliente(ClienteDTO cliente);
    BaseResponseSimpleDTO obtenerCliente(Long idCliente);
    BaseResponseDTO obtenerTodosLosClientes();
    BaseResponseDTO actualizarCliente(ClienteDTO cliente, Long idCliente);
    BaseResponseDTO eliminarCliente(Long idCliente);
}
