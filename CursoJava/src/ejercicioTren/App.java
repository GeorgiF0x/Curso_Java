package ejercicioTren;

public class App {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		 // instinciar los vagones
        Vagon vagon1 = new Vagon();
        Vagon vagon2 = new Vagon();
        Vagon vagon3 = new Vagon();

        // instanciar el tren y acoplar los vagones
        Tren tren = new Tren(vagon1, vagon2, vagon3);
        
        // instanciar   pasajeros
        Persona pasajero1 = new Persona("Juan Pérez");
        /*
        Persona pasajero2 = new Persona("María López");
        Persona pasajero3 = new Persona("Carlos García");
        Persona pasajero4 = new Persona("Ana Fernández");*/
        
        // Asignar pasajeros a asientos en los vagones
        System.out.println("Asignando asientos a los pasajeros...");
        vagon1.reservarAsiento(pasajero1);
        /*
        vagon1.reservarAsiento(pasajero2);
        vagon2.reservarAsiento(pasajero3);
        vagon3.reservarAsiento(pasajero4);*/
        
        // Mostrar la estructura del tren
        System.out.println("****************Estructura de Asientos del Tren****************");
        System.out.println("Vagón 1:");
         vagon1.mostrarEstructuraAsientos();
        System.out.println("Vagón 2:");
       // vagon2.mostrarEstructuraAsientos();
        System.out.println("Vagón 3:");
        //vagon3.mostrarEstructuraAsientos();
        System.out.println("****************************************************************");
        
    

	}

}
