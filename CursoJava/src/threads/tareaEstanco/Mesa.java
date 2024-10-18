package threads.tareaEstanco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mesa {
	
	private Fumador fumador1;
	private Fumador fumador2;
	private Fumador fumador3;
	private Camello camello;
	
	private   List<String> lista_contenidoMesa; // Declaración de la lista
    private static List<String> contenido_sync; // Declaración de la lista sincronizada
    
    // Constructor
    public Mesa(Fumador fuma1,Fumador fuma2,Fumador fuma3,Camello camello) {
    	this.fumador1=fuma1;
    	this.fumador2=fuma2;
    	this.fumador3=fuma3;
    	this.camello=camello;
        this.lista_contenidoMesa = new ArrayList<>(); // Inicialización de la lista
        Mesa.setContenido_sync(Collections.synchronizedList(lista_contenidoMesa)); // Inicialización de la lista sincronizada
      	camello.run();
    	fumador1.run();
    	fumador2.run();
    	fumador3.run();
        
       /* while(true) {        	
        	camello.run();
        	fumador1.run();
        	fumador2.run();
        	fumador3.run();
        }*/
    }
    
    
    public static List<String> obtenerLista() {
        return getContenido_sync();
    }


	public static List<String> getContenido_sync() {
		return contenido_sync;
	}


	public static void setContenido_sync(List<String> contenido_sync) {
		Mesa.contenido_sync = contenido_sync;
	}
	
	public static void vaciarMesa() {
		contenido_sync.clear();
	}
    
    
    
	
}
