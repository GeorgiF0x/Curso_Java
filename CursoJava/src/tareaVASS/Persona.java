package tareaVASS;

public class Persona {
	
	private boolean vacunado;
	protected int dni;
	
	public Persona( int dni) {
		super();
		this.vacunado = false;
		this.dni = dni;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	
	
	
	

}
