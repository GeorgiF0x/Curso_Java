package tareaVASS;

import java.util.List;
import java.util.Random;

	public class HiloCreaPersonas extends Thread {
		
		
		@Override
		public void run() {
			try {
				Thread.sleep(5000);
					while(true) {					
						crearPaciente();
		                mostrarPacientes();
		                Thread.sleep(1000);
					}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	private void crearPaciente() {
		int dni=generarNumeroAleatorioDe9Cifras();
		Paciente p= new Paciente(dni);
		//System.out.println("Persona creada");
	}
	
	  private static int generarNumeroAleatorioDe9Cifras() {
	        Random random = new Random();
	        // Genera un número entre 100000000 y 999999999 (inclusive)
	        return 100000000 + random.nextInt(900000000);
	    }
	  
	  private void mostrarPacientes() {
	        List<Persona> listaPacientes = Centro.obtenerListaPacientes();
	        int conta = 0;
	        for (Persona paciente : listaPacientes) {
	            System.out.println("Paciente " + conta + ": " + paciente); // Asegúrate de tener un método toString en Persona
	            conta++;
	        }
	    }
	

}
