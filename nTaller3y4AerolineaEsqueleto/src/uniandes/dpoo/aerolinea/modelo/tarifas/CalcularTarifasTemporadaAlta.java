package uniandes.dpoo.aerolinea.modelo.tarifas;


import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;


public class CalcularTarifasTemporadaAlta extends CalculadoraTarifas{

	protected int COSTO_POR_KM= 1000;
	
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 7;
	}
	

	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 9.9;
	}
}
