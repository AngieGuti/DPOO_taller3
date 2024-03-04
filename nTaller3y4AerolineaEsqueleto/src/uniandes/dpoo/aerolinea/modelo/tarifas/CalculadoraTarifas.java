package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public abstract class CalculadoraTarifas {

	public static final double IMPUESTO=0.28;
	
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		/*
		 * Este método calcula cuál debe ser la tarifa total para un vuelo, dado el vuelo y el cliente. 
		 * La tarifa total está constituída por un costo base, un descuento que podría aplicarse sobre el costo base,
		 *  y un impuesto que se aplica sobre el costo base menos el descuento. 
		 * Este método utiliza los métodos calcularCostoBase y calcularPorcentajeDescuento para calcular la tarifa total
		 */
		int costoBase= calcularCostoBase(vuelo, cliente);
		double porcentajeDescuento= calcularPorcentajeDescuento(cliente);
		double descuento = costoBase * porcentajeDescuento;
		double costoBaseMenosDescuento = costoBase - descuento;
		double impuesto = costoBaseMenosDescuento * IMPUESTO;
		double tarifa = costoBaseMenosDescuento + impuesto;
		return (int) tarifa;
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
		
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return (int) (costoBase * IMPUESTO);		
	}
}
