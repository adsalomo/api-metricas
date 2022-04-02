package com.example.demo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dominio.Carro;
import com.example.demo.servicios.CarroService;

@RestController
@RequestMapping("/carro") // esta ruta debe ser unica
@CrossOrigin("*") // para que sea accedida desde cualquier punto
public class CarroController {

	@Autowired
	CarroService carroService; // inyeccion de dependencia carro service
	
	@PostMapping // recibe en el cuerpo de la peticion un objeto de tipo carro en formato JSON
	public void crearCarro(@RequestBody Carro carro) {
		carroService.crearCarro(carro);
	}
	
	@GetMapping // devuelve una lista de carros en formato JSON
	public List<Carro> listarCarros() {
		return carroService.listarCarros();
	}
	
}
