package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dominio.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {

}
