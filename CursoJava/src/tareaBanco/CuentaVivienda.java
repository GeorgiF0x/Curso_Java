package tareaBanco;

public class CuentaVivienda extends Cuenta {
	
	private double miebro;
	
	//constructor
	public CuentaVivienda(Cliente cliente, int numeroCuenta, double miebro) {
		super(cliente, numeroCuenta);
		this.miebro = miebro;
	}
	
	
	
	public double getMiebro() {
		return miebro;
	}



	public void setMiebro(double miebro) {
		this.miebro = miebro;
	}



	//metodos
	public void cancelarImporteHipoteca(double cantidad) {
		this.setMiebro(this.getMiebro()-cantidad);
	}
	
	public void verRestoHipoteca() {
		System.out.println("Importe pendiente de pagar hipoteca :"+this.getMiebro());
	}



	@Override
	public void visualizarSaldo() {
			System.out.print("Saldo total: "+(this.getsaldo_total_cuenta()-this.getMiebro()));
	}
	
	
	

	

}
