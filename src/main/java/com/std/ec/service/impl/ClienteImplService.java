package com.std.ec.service.impl;

import com.std.ec.model.dao.ClienteDao;
import com.std.ec.model.dto.ClienteDto;
import com.std.ec.model.entity.Cliente;
import com.std.ec.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClienteImplService implements IClienteService {
    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List listAlll() {
        return (List) clienteDao.findAll();
    }

    @Transactional
    @Override
    public Cliente save(ClienteDto ClienteDto) {
        Cliente cliente = Cliente.builder()
                .idCliente(ClienteDto.getIdCliente())
                .nombre(ClienteDto.getNombre())
                .apellido(ClienteDto.getApellido())
                .correo(ClienteDto.getCorreo())
                .fechaRegistro(ClienteDto.getFechaRegistro())
                .build();
        return clienteDao.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public boolean existsById(Integer id) {
        return  clienteDao.existsById(id);
    }
}
