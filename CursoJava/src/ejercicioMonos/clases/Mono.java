package ejercicioMonos.clases;

import ejercicioMonos.constantes.Constantes;

public class Mono extends Primates {

	public Mono(String nombre, int capacidadMaxima) {
		super(nombre, Constantes.MONO.getCapacidadMaxima());
		// TODO Auto-generated constructor stub
	}

	@Override
	void recogerComida(int unidades ,Comida comida) {
		if (this.getUnidadesAlmacenadas() <Constantes.MONO.getCapacidadMaxima()) {
            // Guardar la comida en el almacén
            guardarComida(unidades ,comida);
            System.out.println(nombre + " ha recogido " + comida.getTipo() + ".");
        } else {
            System.out.println(nombre + " no puede almacenar más comida, su capacidad máxima es " + Constantes.MONO.getCapacidadMaxima() + ".");
        }
		
	}

	@Override
	void guardarComida(int unidades,Comida comida) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void comer() {
		// TODO Auto-generated method stub
		
	}

}
