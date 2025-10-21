package demoPOO.models;

import demoPOO.services.TelefonoImpl;

public class Telefono extends TelefonoImpl{
	
	//Propiedades - Atributos
	private String marca;
	private String modelo;
	private String serie;
	private String numero;
	
	//Otros métodos
	public void marcar(String telefono) {
		System.out.println("Marcando desde el número: " + telefono);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	//Funcionalidades - Métodos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	
}
