package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.Carro;
import com.example.demo.repositorios.CarroRepository;

@Service
public class CarroService {

	@Autowired
	CarroRepository carroRepository;
	
	public void crearCarro(Carro carro) {
		// insert into (id, placa, ...) values (1, 'hjk456', ...)
		carroRepository.save(carro);
	}
	
	public Carro crearCarroReturn(Carro carro) {
		// insert into (id, placa, ...) values (1, 'hjk456', ...)
		return carroRepository.save(carro);
	}
	
	public List<Carro> listarCarros() {
		// select * from carro
		List<Carro> carros =  (List<Carro>) carroRepository.findAll();
		return carros;
	}
	
}
