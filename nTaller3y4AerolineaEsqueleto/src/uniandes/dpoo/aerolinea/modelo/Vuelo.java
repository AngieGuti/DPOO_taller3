/**
 * 
 */
package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
/**
 * 
 */
public class Vuelo {

	private Ruta ruta;
	private String fecha;
	private Avion avion;
	private Map<String, Tiquete> tiquetes= null;

	
	/**
	 * 
	 */
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.ruta= ruta;
		this.fecha= fecha;
		this.avion= avion;
		this.tiquetes= new HashMap<>();
	}
	
	public Ruta getRuta() {
		return ruta;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public Collection<Tiquete> getTiquetes() {
		/*
		 * arreglar xd
		 */
		return tiquetes.values();
	}

	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
	//primero toca revisar que el vuelo no esté lleno 
	if (tiquetes.size() + cantidad > avion.getCapacidad()) {
		throw new VueloSobrevendidoException(this);
	}
	//no está lleno :D
	int totalCosto= 0;
	for (int i = 0; i < cantidad; i++) {
		int tarifa = calculadora.calcularTarifa(this, cliente);
		Tiquete tiquete = GeneradorTiquetes.generarTiquete(this, cliente, tarifa);
		tiquetes.put(tiquete.getCodigo(), tiquete);
		cliente.agregarTiquete(tiquete);
		totalCosto += tarifa;
	}
	return totalCosto;
	}
	
	public boolean equals(Object obj) {
		
	}
}
