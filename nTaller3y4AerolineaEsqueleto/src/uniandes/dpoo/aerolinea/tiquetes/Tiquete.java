package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

import java.io.IOException;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
		
		private Vuelo vuelo;
		private Cliente cliente;
		private String codigo;
		private int tarifa;
		private boolean usado;
		
		public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
			this.codigo= codigo;
			this.vuelo= vuelo;
			this.cliente= clienteComprador;
			this.tarifa= tarifa;
		}
		
		public Cliente getCliente() {
			return this.cliente;
		}
		
		public Vuelo getVuelo() {
			return this.vuelo;
		}
		
		public String getCodigo() {
			return this.codigo;
		}

		public int getTarifa() {
			return this.tarifa;
		}
		
		public void marcarComoUsado() {
			this.usado= true;
		}
		
		public boolean esUsado() {
			return this.usado;
		}

		@Override
		public void cargarTiquetes(String archivo, Aerolinea aerolinea)
				throws IOException, InformacionInconsistenteException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void salvarTiquetes(String archivo, Aerolinea aerolinea) throws IOException {
			// TODO Auto-generated method stub
			
		}
}


