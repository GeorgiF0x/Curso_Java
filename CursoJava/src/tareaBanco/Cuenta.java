package tareaBanco;

import tareaBanco.interfaces.Transferible;

public  abstract class Cuenta implements Transferible {
	
	//atributos
	private String dni_cliente;
	private int numeroCuenta;
	private double saldo_total_cuenta;
	
	public Cuenta(Cliente cliente, int numeroCuenta) {
		super();
		this.dni_cliente = cliente.getDni();
		this.numeroCuenta = numeroCuenta;
		this.saldo_total_cuenta = 0;
	}

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public void setSaldo_total_cuenta(double saldo_total_cuenta) {
		this.saldo_total_cuenta = saldo_total_cuenta;
	}
	
	public double getsaldo_total_cuenta() {
		return saldo_total_cuenta;
	}
	//metodos
	public void visualizarSaldo() {
		System.out.println("el saldo de la cuenta es :"+this.getsaldo_total_cuenta());
	}
	
	public void realizarIngreso(double cantidad) {
		double nuevoTotal=this.getsaldo_total_cuenta()+cantidad;
		this.setSaldo_total_cuenta(nuevoTotal);
	}

	@Override
	public Cuenta devolverCuentaOrigen() {
		// TODO Auto-generated method stub
		return this;
	}

	

	
	


	
	
	
	
	
	
	


	
	
	
	
}
