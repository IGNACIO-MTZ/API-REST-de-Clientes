package com.std.ec.service;

import com.std.ec.model.dto.ClienteDto;
import com.std.ec.model.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> listAlll();
    /**
     * Guarda un nuevo cliente en el sistema.
     *
     * @return El cliente guardado.
     */
    Cliente save(ClienteDto cliente);

    /**
     * Busca y devuelve un cliente por su ID.
     *
     * @param id El ID del cliente a buscar.
     * @return El cliente encontrado o null si no existe.
     */
    Cliente findById(Integer id);

    /**
     * Elimina un cliente del sistema.
     *
     * @param cliente El cliente a eliminar.
     */
    void delete(Cliente cliente);

    /**
     * Verifica si existe un cliente con el ID especificado.
     *
     * @param id El ID del cliente a verificar.
     * @return true si el cliente existe, false en caso contrario.
     */
    boolean existsById(Integer id);
}

