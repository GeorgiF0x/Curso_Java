	package tareaBanco.interfaces;

import tareaBanco.Buzon;
import tareaBanco.Mensaje;
import tareaBanco.Persona;

public interface Enviable  {
	
		default void EnviarMensaje(Mensaje m) {
			Persona origen=m.getOrigen();
			Persona destino=m.getDestino();
			Buzon buzonOrigen=origen.getBuzonPersonal();
			origen.setBandeja_salida(m);
			destino.setBandeja_entrada(m);
		}
		
		default void EnviarRecibirMensajeHash(Mensaje m) {
			Persona origen=m.getOrigen();
			Persona destino=m.getDestino();
			Buzon buzonOrigen=origen.getBuzonPersonal();
			Buzon buzonDestino=destino.getBuzonPersonal();
			buzonOrigen.setEnviados(buzonOrigen.getEnviados(), m);
			buzonDestino.setRecibidos(buzonDestino.getRecibidos(), m);
		}
		

		
	}
