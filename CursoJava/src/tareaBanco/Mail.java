package tareaBanco;

import java.util.ArrayList;

public class Mail {
	
	private static ArrayList <Mail> bbdd_correos= new ArrayList<>(); 
	private String nombre;
	

	public Mail(String nombre) {
		super();
		this.nombre = nombre;
		bbdd_correos.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Mail [nombre=" + nombre + "]";
	}

	public static ArrayList<Mail> getBbdd_correos() {
		return bbdd_correos;
	}


	
	
	
	
	
	

}
