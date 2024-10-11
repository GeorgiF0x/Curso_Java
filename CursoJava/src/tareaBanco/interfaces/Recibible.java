package tareaBanco.interfaces;

import tareaBanco.Buzon;
import tareaBanco.Mensaje;
import tareaBanco.Persona;

public interface Recibible {

	default void recibirMensajeHash(Mensaje m) {
		Persona destino=m.getDestino();
		Buzon buzonDestino=destino.getBuzonPersonal();
		buzonDestino.setRecibidos(buzonDestino.getRecibidos(), m);
	}
	
}
