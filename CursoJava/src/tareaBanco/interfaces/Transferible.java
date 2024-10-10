package tareaBanco.interfaces;

import tareaBanco.Cuenta;

public interface Transferible  {
	
	double COMISION_FIJA = 1; 
	
	 Cuenta devolverCuentaOrigen();
	
	default  void realizarTranferencia(Cuenta cuenta,double cantidad ) {
		Cuenta cuentaOrigen=devolverCuentaOrigen();
		double nuevoTotal=cuenta.getsaldo_total_cuenta()+cantidad;
		cuentaOrigen.setSaldo_total_cuenta(cuentaOrigen.getsaldo_total_cuenta()-cantidad);
		cuenta.setSaldo_total_cuenta(nuevoTotal);
	}
	


}
