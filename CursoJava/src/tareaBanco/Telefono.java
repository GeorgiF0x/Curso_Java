package tareaBanco;

public class Telefono {
	
	private int numeroTelefono;

	public Telefono(int numeroTelefono) {
		super();
		this.numeroTelefono = numeroTelefono;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	@Override
	public String toString() {
		return "Telefono [numeroTelefono=" + numeroTelefono + "]";
	}
	
	
	
	
	
}
