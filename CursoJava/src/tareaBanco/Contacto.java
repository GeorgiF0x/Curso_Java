package tareaBanco;

import java.util.ArrayList;
import java.util.Scanner;

import tareaBanco.interfaces.Imprimible;

public class Contacto implements Imprimible {
	
	//atributos
	private ArrayList <Telefono> lista_telefonos;
	private ArrayList<Mail> lista_mails;

	//constructor
	public Contacto() {
		this.lista_telefonos = new ArrayList<>(); //que guarde 5 numeros
		this.lista_mails = new ArrayList<>();
	}
	
	  public void imprimirContactos() {
	        System.out.println("Lista de teléfonos:");
	        imprimirLista(lista_telefonos); 

	        System.out.println("Lista de correos electrónicos:");
	        imprimirLista(lista_mails);
	    }
	  
	  public void imprimirAgendaTelefonica() {
		   System.out.println("Lista de teléfonos:");
	        imprimirLista(lista_telefonos); 
	  }
	  
	  public void imprimirAgendaCorreos() {
		   System.out.println("Lista de correos electrónicos:");
	        imprimirLista(lista_mails);
	  }
	  
	  
	
	
	
	
	

	

	
	
	
	
	
}
