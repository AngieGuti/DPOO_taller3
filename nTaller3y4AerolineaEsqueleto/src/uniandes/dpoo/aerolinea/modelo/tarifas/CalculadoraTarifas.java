package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public abstract class CalculadoraTarifas {

	public double IMPUESTO=0.28;
	
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		/*
		 * no sé pero no es abstracta
		 */
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
		
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		/*
		 * algún cálculo ggg
		 */
		return 1;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		/*
		 * not sure
		 */
		return costoBase;
		
	}
}
