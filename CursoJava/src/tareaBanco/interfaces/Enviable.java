	package tareaBanco.interfaces;

import tareaBanco.Mensaje;
import tareaBanco.Persona;

public interface Enviable  {
	
		default void EnviarMensaje(Mensaje m) {
			Persona origen=m.getOrigen();
			Persona destino=m.getDestino();
			origen.setBandeja_salida(m);
			destino.setBandeja_entrada(m);
		}
	}
