package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dominio.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {

}
