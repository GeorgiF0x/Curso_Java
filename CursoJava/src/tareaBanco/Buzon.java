package tareaBanco;

import java.util.HashMap;

import tareaBanco.interfaces.Imprimible;
import tareaBanco.interfaces.Maileable;
import tareaBanco.interfaces.Rellenable;

public class Buzon implements Maileable,Rellenable,Imprimible  {
	
	private int idBuzon=0;
	private Persona propietario;
	
	protected HashMap<Persona, Mensaje> recibidos;
	protected HashMap<Persona, Mensaje> enviados;
	private HashMap<Persona, Mensaje> spam;
	
	public Buzon(Persona p) {
		super();
		this.idBuzon++;
		propietario=p;
		recibidos = new HashMap<Persona,Mensaje>();
		enviados = new HashMap<Persona,Mensaje>();
		enviados = new HashMap<Persona,Mensaje>();
		spam = new HashMap<Persona,Mensaje>();
	}
	

	
	
	

	public HashMap<Persona, Mensaje> getRecibidos() {
		return recibidos;
	}





	public void setRecibidos(HashMap<Persona, Mensaje> recibidos,Mensaje m) {
		addHashMap(enviados, this.propietario, m.toString());
		
	}





	public HashMap<Persona, Mensaje> getEnviados() {
		return enviados;
	}





	public void setEnviados(HashMap<Persona, Mensaje> enviados,Mensaje m) {
		Persona remitente= m.getDestino();
		addHashMap(enviados, remitente, m.toString());
	}





	public HashMap<Persona, Mensaje> getSpam() {
		return spam;
	}





	public void setSpam(HashMap<Persona, Mensaje> spam,Mensaje m) {
		addHashMap(spam, this.propietario, m.toString());
	}





	public int getIdBuzon() {
		return idBuzon;
	}



	@Override
	public Persona obtenerOrigen() {
		return this.propietario;
	}
	
	 public void imprimirHashEntrada() {
	        System.out.println("Lista de correos recibidos:");
	        imprimirHashMap(recibidos);  
	    }
	
	
	
	
	
	

}
