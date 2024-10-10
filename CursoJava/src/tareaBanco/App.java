package tareaBanco;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Direccion dir1= new Direccion("calle", "1C", 3, 4, "Zamora", "ESPAÑA", 49004);
			Contacto contacto1= new Contacto();
			Contacto contacto2 = new Contacto();
			Direccion dir2 = new Direccion("Avenida Libertad", "20A", 2, 3, "Madrid", "ESPAÑA", 28013);
			
			

	        // Crear dos objetos Cliente
	        Cliente cliente1 = new Cliente("12345678A", "Juan", "Pérez", "González", dir1, contacto1, 1500.00);
	        Cliente cliente2 = new Cliente("87654321B", "María", "Lopez", "Martínez", dir2, contacto2, 2000.50);
	        
	        cliente1.crearYEnviarCorreo();
	        cliente2.imprimirBandejaEntrada();
		
		
		/*
		//usuario1
		Contacto contacto1= new Contacto();
		Direccion dir1= new Direccion("calle", "1C", 3, 4, "Zamora", "ESPAÑA", 49004);
		Cliente cli1= new Cliente("A12345567K", "Pepe", "Benito", "Bunny", dir1, contacto1, "nada@nada.es", 3987.65);
		System.out.println(cli1.email);
		//usuario2
		Contacto contacto2 = new Contacto();
		Direccion dir2 = new Direccion("Avenida Libertad", "20A", 2, 3, "Madrid", "ESPAÑA", 28013);
		Cliente cli2 = new Cliente("B98765432L", "Maria", "Gomez", "Lopez", dir2, contacto2, "maria.gomez@ejemplo.com", 1500.50);
		
		*/

		//cuenta Nomina
		/*
		CuentaNomina cuenta_nomina=new CuentaNomina(cli1, 123);
		cuenta_nomina.visualizarSaldo();
		cuenta_nomina.realizarIngreso(22.22);
		cuenta_nomina.visualizarSaldo();
		
		//cuenta Nomina2
		CuentaNomina cuenta_nomina2=new CuentaNomina(cli2, 12345);
		cuenta_nomina2.realizarIngreso(50.00);
		cuenta_nomina2.visualizarSaldo();
		cuenta_nomina2.realizarTranferencia(cuenta_nomina, 20.00);
		cuenta_nomina2.visualizarSaldo();
		cuenta_nomina.visualizarSaldo();
		*/
		
		
		
	}

}
