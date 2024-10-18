package tareaVASS;

import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//crear 15 pacientes
		/*
		Paciente paciente0= new Paciente(113452124);
		Paciente paciente1 = new Paciente(113452125);
		Paciente paciente2 = new Paciente(113452126);
		Paciente paciente3 = new Paciente(113452127);
		Paciente paciente4 = new Paciente(113452128);
		Paciente paciente5 = new Paciente(113452129);
		Paciente paciente6 = new Paciente(113452130);
		Paciente paciente7 = new Paciente(113452131);
		Paciente paciente8 = new Paciente(113452132);
		Paciente paciente9 = new Paciente(113452133);
		Paciente paciente10 = new Paciente(113452134);
		Paciente paciente11 = new Paciente(113452135);
		Paciente paciente12 = new Paciente(113452136);
		Paciente paciente13 = new Paciente(113452137);
		Paciente paciente14 = new Paciente(113452138);
		Paciente paciente15 = new Paciente(113452139);
		
		
		//crear un medico 
		Medico medico= new Medico(1112344123);
		//crear una Enfermera 
		Enfermera enfermera= new Enfermera(111234123);
		//pasar consulta
		medico.pasarConsulta();
		//vacunar 
		enfermera.vacunar();
		
		*/
		
		
		// ejercicio 3
		HiloCreaPersonas hiloCrea= new HiloCreaPersonas();
		hiloCrea.start();
		Medico medico= new Medico(1112344123);
		medico.pasarConsulta();
	
		
	}

}
