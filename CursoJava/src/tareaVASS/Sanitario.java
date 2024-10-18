package tareaVASS;

abstract public class Sanitario extends Persona {
	
	protected static int numEmpleado=0;

	public Sanitario( int dni) {
		super( dni);
		this.numEmpleado++;
		// TODO Auto-generated constructor stub
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	
	
	
	

}
