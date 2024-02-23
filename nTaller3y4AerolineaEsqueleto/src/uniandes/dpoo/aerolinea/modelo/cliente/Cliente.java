package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	/**
	 * 
	 */
	public Cliente() {
		
	}
	
	public String getTipoCliente() {
		return "Coporativo";
	}

	public String getIdentificador() {
		// TODO Auto-generated method stub
		return "2822-SHJA";
	}
	
	public void agregarTiquete(Tiquete tiquete) {
		/*
		 * agregar
		 */
	}

	public int calcularValorTotalTiquetes() {
		/*
		 * agregar
		 */
		return 2+3;
	}

	public void usarTiquetes(Vuelo vuelo) {
		/*
		 * agregar x3
		 */
	}
}
