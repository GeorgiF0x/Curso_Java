package tareaVASS;

import java.util.List;

import tareaVASS.paqueteDeInterfaces.OperacionesMedico;

public class Medico extends Sanitario implements OperacionesMedico{

	public Medico( int dni ) {
		super( dni );
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pasarConsulta() {
		
		List listaPacientes=Centro.obtenerListaPacientes();
		List listaVacunados=Centro.obtenerListaVacunados();
		int conta=0;
		int listaPacientesSize=listaPacientes.size();
			for (Object paciente : listaPacientes) {
				if(conta % 2 ==0) {
					listaVacunados.add(paciente);
					System.out.println("Paciente pasado por consulta: "+(conta/2+1));
				}
				conta++;
				if(conta==listaPacientesSize) {
					listaVacunados.add(this);
					System.out.println("Medico añadido a la ultima consulta del dia");
				}
			}
		
	}
	

}
