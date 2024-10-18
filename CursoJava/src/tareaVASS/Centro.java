package tareaVASS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract public class Centro {
	

    private static List<Persona> lista_pacientes=Collections.synchronizedList(new ArrayList<Persona>()); 
    private static List<Persona> lista_paraVacunar=Collections.synchronizedList(new ArrayList<Persona>()); 
    private static List<Persona> lista_ya_vacunados=Collections.synchronizedList(new ArrayList<Persona>()); 
    //private static List<Persona> pacientes_sync = Collections.synchronizedList(new ArrayList<Persona>());
    
    
    
    
    
    public static List<Persona> obtenerListaPacientes() {
    	return getLista_pacientes();
    }
    
    
    public static List<Persona> obtenerListaVacunados() {
    	return getLista_paraVacunar();
    }
    
    public static List<Persona> obtenerListaPacientesYaVacunados() {
    	return getya_Vacunados_sync();
    }
    
    
    
    
	public static List<Persona> getLista_pacientes() {
		return lista_pacientes;
	}



	public static void setLista_pacientes(List<Persona> pacientes_sync) {
		Centro.lista_pacientes = pacientes_sync;
	}



	public static List<Persona> getLista_paraVacunar() {
		return lista_paraVacunar;
	}



	public static void setLista_paraVacunar(List<Persona> vacunados_sync) {
		Centro.lista_paraVacunar = vacunados_sync;
	}
	public static List<Persona> getya_Vacunados_sync() {
		return lista_ya_vacunados;
	}



	public static void setya_Vacunados_sync(List<Persona> vacunados_sync) {
		Centro.lista_ya_vacunados = vacunados_sync;
	}

}
