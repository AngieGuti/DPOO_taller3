package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	private List<Tiquete> tiquetesSinUsar= new ArrayList<>();
	private List<Tiquete> tiquetesUsados= new ArrayList<>();
	
	public Cliente() {	
	}
	
	public abstract String getTipoCliente();

	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}

	public int calcularValorTotalTiquetes() {
		int totalTiquetes= 0;
		for(Tiquete tiquete: tiquetesSinUsar) {
			totalTiquetes+= tiquete.getTarifa();
		}
		return totalTiquetes;
	}

	public void usarTiquetes(Vuelo vuelo) {
		vuelo.getTiquetes().forEach(tiquete ->{
			if(tiquetesSinUsar.contains(tiquete)) {
				tiquetesSinUsar.remove(tiquete);
				tiquetesUsados.add(tiquete);
			}
		});
	}
}
