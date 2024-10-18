package threads.tareaEstanco;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fumador colgao1= new Fumador();
		Fumador colgao2= new Fumador();
		Fumador colgao3= new Fumador();
		
		Camello camello = new Camello();
		
		Mesa mesa= new Mesa(colgao1, colgao2, colgao3, camello);
	}

}
