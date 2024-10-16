package threads.actividadThreads;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				HiloCreaFichero nuevoHilo= new HiloCreaFichero();
				HiloCreaFichero nuevoHilo2= new HiloCreaFichero();
				HiloCreaFichero nuevoHilo3= new HiloCreaFichero();
				
				

		
				nuevoHilo.setPriority(Thread.MAX_PRIORITY);
				nuevoHilo2.setPriority(Thread.NORM_PRIORITY);
				nuevoHilo3.setPriority(Thread.MIN_PRIORITY);
				
				nuevoHilo.start();
				nuevoHilo2.start();
				nuevoHilo3.start();
				
				
			;
				


	}
}
