package tareaBanco;

public class Cliente extends Persona{
	
	//atributos
	private double saldo_total;
	
	//constructor
	public Cliente(String dni, String nombre, String apellido1, String apellido2, Direccion dir, Contacto cont,
			double saldo_total) {
		super(dni, nombre, apellido1, apellido2, dir, cont);
		this.saldo_total = saldo_total;
	}

	//getter y setters


	public double getSaldo_total() {
		return saldo_total;
	}


	public void setSaldo_total(double saldo_total) {
		this.saldo_total = saldo_total;
	}
	
	




	
	
	
	
	

}
