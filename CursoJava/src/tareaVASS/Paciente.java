package tareaVASS;

import java.util.HashMap;

public class Paciente extends Persona {
	
	private HashMap<String,Integer> historial;
	
	public Paciente( int dni) {
		super(dni );
        historial = new HashMap<>();
		// TODO Auto-generated constructor stub
        Centro.obtenerListaPacientes().add(this); // al crear al paciente entra en la lista de pacientes 
	}

	public HashMap<String, Integer> getHistorial() {
		return historial;
	}
	
	
	
	

	
}
