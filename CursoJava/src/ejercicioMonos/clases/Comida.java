package ejercicioMonos.clases;

public class Comida {

	private String tipo;
	private boolean pelada;
	
	public Comida(String tipo, boolean pelada) {
        this.tipo = tipo;
        this.pelada = pelada;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isPelada() {
		return pelada;
	}

	public void setPelada(boolean pelada) {
		this.pelada = pelada;
	}
	
	public void pelar() {
        if (this.pelada!=pelada) {
            pelada = true;
            System.out.println("La " + tipo + " ha sido pelada.");
        } else {
            System.out.println("La " + tipo + " ya está pelada.");
        }
    }
	
}
