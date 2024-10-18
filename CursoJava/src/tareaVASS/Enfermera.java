package tareaVASS;

import java.util.List;

import tareaVASS.paqueteDeInterfaces.OperacionesEnfermera;

public class Enfermera extends Sanitario implements OperacionesEnfermera{

	public Enfermera( int dni) {
		super(dni);
		// TODO Auto-generated constructor stu
	}

	@Override
	public void vacunar() {
		 int conta = 0; 
		    List<Persona> listaParaVacunar = Centro.obtenerListaVacunados(); 
		    
		    for (Persona p_paraVacunar : listaParaVacunar) { 
		      
		        conta += vacunar(p_paraVacunar); 
		    }

		    // Imprimir el mensaje total al final
		    System.out.println("Se han vacunado " + conta + " personas");
		 
	}

	@Override
	public int vacunar(Persona p) {
	    List<Persona> pacientesYaVacunados = Centro.obtenerListaPacientesYaVacunados(); 
	    
	    if ((p instanceof Medico) || (p instanceof Paciente)) {
	    	p.setVacunado(true);
	        pacientesYaVacunados.add(p); // Añadir a la lista
	        
	        
	        if (p instanceof Medico) {
	            System.out.println("Médico vacunado");
	        } else {
	            System.out.println("Paciente vacunado");
	        }
	        
	        return 1; 
	    }
	    
	    return 0; 
	}

	
	

}
