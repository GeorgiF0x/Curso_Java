package tareaBanco;

public class Empleado extends Persona {
	private String usuario;
	private String password;
	
	//constructor
	public Empleado(String dni, String nombre, String apellido1, String apellido2, Direccion dir, Contacto cont,
			String usuario, String password) {
		super(dni, nombre, apellido1, apellido2, dir, cont);
		this.usuario = usuario;
		this.password = password;
	}

	//getter y setter
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
