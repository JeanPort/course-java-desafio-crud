package com.coursejava.projeto.desafiocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.projeto.desafiocrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
