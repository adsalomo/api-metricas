package com.example.demo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carros")
public class Carro {

	@Id // indica que es la llave primaria
	private int id;
	
	@Column(unique = true) // indico que es un campo unico en nuestra tabla
	private String placa;
	
	private String color;
	
	@Column(name = "tipo_combustible")
	private String tipoCombustible;
	
	@Column(name = "numero_puertas")
	private String numeroPuertas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public String getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	
	
}
