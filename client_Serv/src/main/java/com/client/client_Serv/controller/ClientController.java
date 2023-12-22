package com.client.client_Serv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.client_Serv.entities.Client;
import com.client.client_Serv.services.ClientService;

@RestController
@RequestMapping("api/client")

public class ClientController {

                            @Autowired
                            private ClientService service;

                            @GetMapping("/clients")
                            public List<Client> findAll() {
                            return service.findAll();

                            }

                            @GetMapping("/{id}")
                            public Client findById(@PathVariable Long id) throws Exception {
                            return service.findById(id);

                            }

                            @PostMapping
                            public void save (@RequestBody Client client) {
                            service.addClient (client);

}                           }
