package com.client.client_Serv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.client.client_Serv.entities.Client;
import com.client.client_Serv.repositories.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServApplication.class, args);
	}
	@Bean
	CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
	    return args -> {
	        clientRepository.save(new Client(Long.parseLong("1"), "Amine SAFI", Float.parseFloat("23")));
	        clientRepository.save(new Client(Long.parseLong("2"), "Amal ALAOUI", Float.parseFloat("22")));
	        clientRepository.save(new Client(Long.parseLong("3"), "Samir RAMI", Float.parseFloat("22")));
	    };
	}


}
