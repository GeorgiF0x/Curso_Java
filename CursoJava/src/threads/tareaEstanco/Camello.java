package threads.tareaEstanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Camello extends Thread  {

	private List<String> materiales = new ArrayList<>();
	static Random random = new Random();

	// Al cargar la clase, inicializamos los materiales
	
	
	
	private String materialEnPosesion1;
	private String materialEnPosesion2;
	
	public Camello() {
		super();
		this.materiales = new ArrayList<>();
        this.materiales.add("Mechero");
        this.materiales.add("Cogoyo");
        this.materiales.add("Papelina");
        this.random = new Random();
		// Asignar un material aleatorio y eliminarlo de la lista
        int rand1 = random.nextInt(materiales.size());
        this.materialEnPosesion1 = materiales.get(rand1);
        materiales.remove(rand1);
        
        // Asignar el segundo material
        int rand2 = random.nextInt(materiales.size());
        this.materialEnPosesion2 = materiales.get(rand2);
        materiales.remove(rand2);
	}

	public String getMaterialEnPosesion1() {
		return materialEnPosesion1;
	}

	public void setMaterialEnPosesion1(String materialEnPosesion1) {
		this.materialEnPosesion1 = materialEnPosesion1;
	}

	public String getMaterialEnPosesion2() {
		return materialEnPosesion2;
	}

	public void setMaterialEnPosesion2(String materialEnPosesion2) {
		this.materialEnPosesion2 = materialEnPosesion2;
	}
	
	private void ponerMaterialEnMesa() {
		Mesa.obtenerLista().add(materialEnPosesion1);
		Mesa.obtenerLista().add(materialEnPosesion2);
	}
	
	@Override
	public void run() {
		ponerMaterialEnMesa();
	}
	


}
