package ejercicioMonos.clases;

 abstract public class Primates {

	protected String nombre;
	protected int unidadesAlmacenadas;
	protected int capacidadMaxima;
	
	// Constructor
    public Primates(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.unidadesAlmacenadas = 0; 
    }
    
    


	
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getUnidadesAlmacenadas() {
		return unidadesAlmacenadas;
	}





	public void setUnidadesAlmacenadas(int unidadesAlmacenadas) {
		this.unidadesAlmacenadas = unidadesAlmacenadas;
	}





	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}





	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}





	abstract void recogerComida(int unidades,Comida comida);
	abstract void guardarComida(int unidades,Comida comida);
	abstract void comer();
	 
}
