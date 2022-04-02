package com.example.demo.servicios;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.dominio.Carro;
import com.example.demo.repositorios.CarroRepository;

public class CarroServiceTest {

	@InjectMocks // definimos que vamos a usar mocks
	CarroService carroService;
	
	@Mock // mock de carro repository
	CarroRepository carroRepository;
	
	@Before // antes de ejecutar las pruebas cree mocks
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void crearCarro() {
		
		Carro carro = new Carro();
		carro.setPlaca("DDDD");
		carro.setColor("Rojo");
		carro.setNumeroPuertas("4");
		carro.setId(1);
		carro.setTipoCombustible("Gasolina");
		
		// cuando llame el metodo guardar, me retone el carro que le estoy simulando
		when(carroRepository.save(carro)).thenReturn(carro);
		
		Carro carroReturn = carroService.crearCarroReturn(carro);
		
		assertEquals(carroReturn.getId(), carro.getId());
		
	}
	
	@Test
	public void listarCarros() {
		
		// objeto carro
		Carro carro = new Carro();
		carro.setPlaca("DDDD");
		carro.setColor("Rojo");
		carro.setNumeroPuertas("4");
		carro.setId(1);
		carro.setTipoCombustible("Gasolina");
		
		// Lista de carros para simular
		List<Carro> carros = new ArrayList<>();
		
		// carros agregados a la lista
		carros.add(carro);
		
		// lista simulada al llamar el metodo carroService
		when(carroRepository.findAll()).thenReturn(carros);
		
		List<Carro> carrosObtenidos = carroService.listarCarros();
		
		// comparo los tamaños de la lista
		assertEquals(carrosObtenidos.size(), carros.size());
		
	}
	
}
