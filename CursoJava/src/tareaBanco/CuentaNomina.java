package tareaBanco;

public class CuentaNomina extends Cuenta {

	public CuentaNomina(Cliente cliente, int numeroCuenta) {
		super(cliente, numeroCuenta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarIngreso(double cantidad) {
		System.out.println("*Ingreso Realizado*");
		if(cantidad>1500) {
			this.setSaldo_total_cuenta((this.getsaldo_total_cuenta()+cantidad+cantidad*0.01));
			System.out.println("Aplicado plus de 1%");
		}else {
			this.setSaldo_total_cuenta(this.getsaldo_total_cuenta()+cantidad);
		}
	}
	
	

	
	

}
