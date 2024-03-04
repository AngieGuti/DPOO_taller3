package uniandes.dpoo.aerolinea.modelo.cliente;


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
    	return this.nombre;
    }
    
    public String getTipoCliente () {
        return NATURAL;
    }
}
