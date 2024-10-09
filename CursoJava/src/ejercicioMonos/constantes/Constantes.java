package ejercicioMonos.constantes;
 

//esto lo he hecho con la ayuda de chatGPT para saber como usar los enums
public enum Constantes {
    MONO(10, 1),        
    CHIMPANCE(15, 2),   
    GORILA(20, 3);     

    private final int capacidadMaxima;  
    private final int cantidadComida;   

    // Constructor para cada constante
    Constantes(int capacidadMaxima, int cantidadComida) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadComida = cantidadComida;
    }

    // Métodos getter
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadComida() {
        return cantidadComida;
    }
}

