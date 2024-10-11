package tareaBanco;

public class Mensaje {

	private Persona origen ;
	private Persona destino;
	private String asunto;
	private String contenido;
	//private Boolean leido;
	
	
	
	public Mensaje(Persona origen, Persona destino, String asunto, String contenido) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.asunto = asunto;
		this.contenido = contenido;
		//this.leido=false;
	}

	public Mensaje() {
		// TODO Auto-generated constructor stub
	}

	public Persona getOrigen() {
		return origen;
	}

	public void setOrigen(Persona origen) {
		this.origen = origen;
	}

	public Persona getDestino() {
		return destino;
	}

	public void setDestino(Persona destino) {
		this.destino = destino;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	
	 @Override
	    public String toString() {
	        return "Asunto: " + asunto + "\n" +
	               "De: " + origen.getNombre() + " " + origen.getApellido1() + "\n" +
	               "Para: " + destino.getNombre() + " " + destino.getApellido1() + "\n" +
	               "Contenido: " + contenido;
	    }

	
	
	
}
