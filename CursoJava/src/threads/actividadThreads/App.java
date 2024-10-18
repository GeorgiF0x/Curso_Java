package threads.actividadThreads;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("Menú de opciones:");
	            System.out.println("1. Crear archivos (con hilos)");
	            System.out.println("2. Contar registros (con hilos)");
	            System.out.println("0. Salir");
	            System.out.print("Elige una opción: ");
	            
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                  opt1();
	                    break;

	                case 2:
	                    // Contar registros
	                	opt2();
	                    break;

	                case 0:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción no válida. Intenta de nuevo.");
	            }

	            // Separador para mejor visualización
	            System.out.println("-----------------------------------");

	        } while (opcion != 0);

	        scanner.close();
	    }
	
	
	public static void opt1() {
		  // Crear archivos con hilos
	    HiloCreaFichero nuevoHilo = new HiloCreaFichero();
	    HiloCreaFichero nuevoHilo2 = new HiloCreaFichero();
	    HiloCreaFichero nuevoHilo3 = new HiloCreaFichero();
	
	    nuevoHilo.setPriority(Thread.MAX_PRIORITY);
	    nuevoHilo2.setPriority(Thread.NORM_PRIORITY);
	    nuevoHilo3.setPriority(Thread.MIN_PRIORITY);
	
	    nuevoHilo.setName("nuevoHilo");
	    nuevoHilo2.setName("nuevoHilo2");
	    nuevoHilo3.setName("nuevoHilo3");
	
	    nuevoHilo.start();
	    nuevoHilo2.start();
	    nuevoHilo3.start();
	}
	
	public static void opt2() {
		   HiloContar hiloConta = new HiloContar();
           hiloConta.start();
	}
}
	

