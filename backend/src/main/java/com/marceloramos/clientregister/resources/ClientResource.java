package com.marceloramos.clientregister.resources;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marceloramos.clientregister.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Diego Alves", "11111111111", 400000.0, Instant.now(Clock.systemUTC()), 2));
		list.add(new Client(2L, "Mauricio Isla", "22222222222", 300000.0, Instant.now(Clock.systemUTC()), 2));
		return ResponseEntity.ok().body(list);
	}

}
