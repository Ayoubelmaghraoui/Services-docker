package com.client.client_Serv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.client_Serv.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
