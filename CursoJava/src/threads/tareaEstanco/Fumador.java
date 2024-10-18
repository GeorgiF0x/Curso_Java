package threads.tareaEstanco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Fumador extends Thread {
	
	static List<String> materiales = new ArrayList<>();
	static Random random = new Random();

	// Al cargar la clase, inicializamos los materiales
	static {
		materiales.add("Mechero");
		materiales.add("Cogoyo");
		materiales.add("Papelina");
	}

	// Variable para almacenar el material en posesión del fumador
	private String materialEnPosesion;

	public Fumador() {
		super();
		// Asignar un material aleatorio y eliminarlo de la lista
		int index = random.nextInt(materiales.size());
		this.materialEnPosesion = materiales.get(index);
		materiales.remove(index);
	}


	public static void main(String[] args) {
		// Crear varios hilos Fumador
		for (int i = 0; i < 3; i++) {
			Fumador fumador = new Fumador();
			fumador.start();
		}
	}
	
	@Override
	public void run() {
	
		try {
			Thread.sleep(500);
			System.out.println("Fumador con material: " + materialEnPosesion);
			if(comprobarContenidoMesa()) {
				fumar();
				
			}else {
				System.out.println("fallo al comprobar lo que hay en la mesa");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private synchronized  boolean comprobarContenidoMesa() {
		boolean puedefumar=false;
		if(!Mesa.obtenerLista().contains(this.materialEnPosesion)) {
			puedefumar=true;
		}
		return puedefumar;
    }
	
	private void fumar() {
		
		StringBuilder frase = new StringBuilder();
        frase.append("El fumador, ")
             .append(Thread.currentThread().getName())
             .append(", con material ")
             .append(this.materialEnPosesion)
             .append(", recoge los materiales de la mesa: ");
        List<String> materialesMesa = Mesa.obtenerLista();
        String materialesStr = String.join(", ", materialesMesa);
        
        frase.append(materialesStr)
        .append(", y se está fumando uno extra largo.");
        System.out.println(frase.toString());
       
	}
	

	

}


