package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteNatural extends Cliente
{
    public String NATURAL= "Natural";
    private String nombre;
    

    public ClienteNatural (String nombre) {
    	this.nombre= nombre;
    }
    
    
    public String getIdentificador () {
    	super.getIdentificador();
    }
    
    public String getTipoCliente () {
    	/*
    	 * not sure xd
    	 */
    }
}
