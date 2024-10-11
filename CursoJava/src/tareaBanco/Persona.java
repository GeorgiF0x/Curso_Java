package tareaBanco;

import java.util.ArrayList;
import java.util.Scanner;

import tareaBanco.interfaces.Enviable;
import tareaBanco.interfaces.Imprimible;
import tareaBanco.interfaces.Maileable;

import java.util.List;

public class Persona implements Imprimible<Mensaje> , Maileable,Enviable {
	
	//atributos
	protected String dni;
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected Direccion dir;
	protected Contacto cont;
	protected Telefono numeroTelefono;
	protected Mail email;
	protected Buzon buzonPersonal;
	protected ArrayList <Mensaje> bandeja_entrada;
	protected ArrayList<Mensaje> bandeja_salida;
	
	

	private static ArrayList<Persona> listaPersonas = new ArrayList<>();
	
	//constructor 
	
	public Persona(String dni, String nombre, String apellido1, String apellido2, Direccion dir, Contacto cont) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dir = dir;
		this.cont = cont;
		this.email=this.crearMail();
		this.numeroTelefono=this.crearTelefono();
		this.bandeja_entrada = new ArrayList<>(); //que guarde 5 numeros
		this.bandeja_salida = new ArrayList<>();
		listaPersonas.add(this);
		this.buzonPersonal= new Buzon(this);
	}
	
	//getter y setters
	
	public Buzon getBuzonPersonal() {
		return buzonPersonal;
	}



	public ArrayList<Mensaje> getBandeja_entrada() {
		return bandeja_entrada;
	}
	
	
	
	public void setBandeja_entrada(Mensaje m) {
		this.bandeja_entrada.add(m);
	}
	
	
	
	public ArrayList<Mensaje> getBandeja_salida() {
		return bandeja_salida;
	}
	
	
	
	public void setBandeja_salida(Mensaje m) {
		this.bandeja_salida.add(m);
	}
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Direccion getDir() {
		return dir;
	}

	public Contacto getCont() {
		return cont;
	}
	
	
	
		public Telefono getNumeroTelefono() {
		return numeroTelefono;
	}



	public void setNumeroTelefono(Telefono numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}



	public Mail getEmail() {
		return email;
	}



	public void setEmail(Mail email) {
		this.email = email;
	}



	public void setDir(Direccion dir) {
		this.dir = dir;
	}



	public void setCont(Contacto cont) {
		this.cont = cont;
	}
	
	 public void imprimirLista(List<Mensaje> lista) {
	        Imprimible.super.imprimirLista(lista);
	    }


	private Mail crearMail() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe tu correo electronico con el que te quieres registrar");
		String nombreMail=sc.next();
		Mail nuevoMail= new Mail(nombreMail);
		return nuevoMail;
	}
	
	public Telefono crearTelefono() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe tu numero de telefono");
		int numeroTelefono=sc.nextInt();
		Telefono nuevoTelefono=new Telefono(numeroTelefono);
		
		return nuevoTelefono;
	}
	
	 public Persona obtenerOrigen() {
		return this;
	}
	 
	 public void crearYEnviarCorreo() {
	        Mensaje mensaje = crearCorreo();
	        if (mensaje != null) {
	            EnviarMensaje(mensaje);  
	        } else {
	            System.out.println("No se pudo crear el correo.");
	        }
	    }
	
	 public static Persona obtenerPersonaPorCorreo(String correo) {
	        for (Persona persona : listaPersonas) {
	            if (persona.email.getNombre().equalsIgnoreCase(correo)) {
	                return persona; 
	            }
	        }
	        return null; 
	   }
	 
	 public void crearYEnviarCorreoHash() {
	        Mensaje mensaje = crearCorreo();
	        if (mensaje != null) {
	            EnviarRecibirMensajeHash(mensaje);  
	        } else {
	            System.out.println("No se pudo crear el correo.");
	        }
	    }
	

	 
	  public void imprimirBandejaEntrada() {
		   System.out.println("Lista de correos:");
	        imprimirLista(bandeja_entrada); 
	  }
	  
	  public void imprimirBandejaSalida() {
		   System.out.println("Lista de correos:");
	        imprimirLista(bandeja_salida); 
	  }
	  
	
	

	
	
	
	

}
