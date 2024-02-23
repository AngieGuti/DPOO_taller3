/**
 * 
 */
package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
/**
 * 
 */
public class Vuelo {

	private Ruta ruta;
	private String fecha;
	private Avion avion;

	
	/**
	 * 
	 */
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.ruta= ruta;
		this.fecha= fecha;
		this.avion= avion;
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
		Collection<Tiquete> tiquetes= new Collection<Tiquete>();
		return tiquetes;
	}

}