package tareaBanco.interfaces;

import java.util.Scanner;

import tareaBanco.Cuenta;
import tareaBanco.Mail;
import tareaBanco.Mensaje;
import tareaBanco.Persona;

public interface Maileable  {

	Persona obtenerOrigen();
	
	default Mensaje crearCorreo() {
        Persona origen = obtenerOrigen();
        Scanner sc = new Scanner(System.in);
        Mensaje nuevoMensaje=new Mensaje();
        System.out.println("Escribe la dirección del destinatario:");
        String correoDestinatario = sc.next();
        Persona destinatario = Persona.obtenerPersonaPorCorreo(correoDestinatario);
        
        if(destinatario != null) {
        	
        	 System.out.println("Escribe el asunto:");
             String asunto = sc.next();
             sc.nextLine();
             System.out.println("Escribe el contenido:");
             String contenido = sc.nextLine();
             nuevoMensaje = new Mensaje(origen, destinatario, asunto, contenido);            
        }else {
        	System.out.println("Correo no existe");
        }
		return nuevoMensaje;
    }
	
	
	
}
