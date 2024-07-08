package com.relacionesSprinboot.controller;

import com.relacionesSprinboot.medel.Cliente;
import com.relacionesSprinboot.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // trae todos los clientes
    @GetMapping("/todos")
    public List<Cliente> getAllCliente(){
        return clienteService.getAllCliente();
    }

    // agregar un cliente
    @PostMapping("/agregar")
    public Cliente addCliente(@RequestBody Cliente cliente){
        return clienteService.addCliente(cliente);
    }

    // elimina un cliente
    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id){
        clienteService.eliminarCliente(id);
    }

    // Editar o actuaiza un cliente
    @PutMapping ("/editar")
    public Cliente editCliente(@RequestBody Cliente cliente) {
        clienteService.editCliente(cliente);

        return clienteService.findCliente(cliente.getId());
    }
}
