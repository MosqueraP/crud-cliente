package com.relacionesSprinboot.service;

import com.relacionesSprinboot.Repository.ClienteRepository;
import com.relacionesSprinboot.medel.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteService {

    // inyección de dependencia
    @Autowired
    private ClienteRepository clienteRepository;

    //Método ver todos los clientes de la lista
    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    //Método agregar un cliente
    public Cliente addCliente( Cliente producto){
        return clienteRepository.save(producto);
    }

    //Método eliminar un cliente
    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }

    //buscar un solo cliente
    public Cliente findCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }


    public void editCliente(Cliente cliente) {
        this.addCliente(cliente);

    }
}
