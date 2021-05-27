package com.marceloramos.clientregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marceloramos.clientregister.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
