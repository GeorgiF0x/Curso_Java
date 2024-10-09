package ejercicioTren;

public class Tren {
	
	//atributos
	  private Vagon[] arrayVagones;
	  
	  
	//Constructor
	    public Tren(Vagon v,Vagon v2, Vagon v3) {
	        arrayVagones = new Vagon[3];
	        acoplarVagones(v,v2,v3);
	        
	    }
	//metodos
	 public void acoplarVagones(Vagon v,Vagon v2,Vagon v3) {
		 for (int i = 0; i < arrayVagones.length; i++) {
			    switch (i) {
			        case 0: // Si el vagón es nulo
			            arrayVagones[i] = v;
			            break;
			        case 1:
			            arrayVagones[i] = v2;
			            break;
			        case 2:
			            arrayVagones[i] = v3;
			            break;
			    }
			}

	 }


}
