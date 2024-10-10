package tareaBanco;

import tareaBanco.interfaces.Transferible;

public class CuentaAhorro extends Cuenta implements Transferible{


	final private int COMISION_FIJA=1;
	
	private double comisionesHechas[];
	
	public CuentaAhorro(Cliente cliente, int numeroCuenta) {
		super(cliente, numeroCuenta);
		this.comisionesHechas=new double[10];
		// TODO Auto-generated constructor stub
	}

	public double[] getComisionesHechas() {
		return comisionesHechas;
	}

	public void setComisionesHechas(double[] comisionesHechas) {
		this.comisionesHechas = comisionesHechas;
	}

	public void transferenciaComision(Cuenta cuenta, Double cantidad) {
	    double comision = cantidad * (this.COMISION_FIJA / 100.0);
	    this.setSaldo_total_cuenta(this.getsaldo_total_cuenta() - comision);
	    cuenta.setSaldo_total_cuenta(cuenta.getsaldo_total_cuenta() + cantidad);
	    for (int i = 0; i < comisionesHechas.length; i++) {
			if(this.comisionesHechas[i]!=0) {
				this.comisionesHechas[i]=comision;
			}
		}
	}
	
	public void verComisionesCobradas() {
		for (int i = 0; i < comisionesHechas.length; i++) {
			System.out.println(i+"- "+this.comisionesHechas[i]);
		}
	}
	
	
	
	

	
	
	
	
	
	
}
