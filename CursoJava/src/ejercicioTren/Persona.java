package ejercicioTren;

public class Persona {

    // Atributos
    private static int contadorPasajero = 0;  
    private int idPasajero;  
    private String nombre;   
    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        this.idPasajero = ++contadorPasajero;  
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    //toString 
    @Override
    public String toString() {
        return "ID: " + idPasajero + ", Nombre: " + nombre;
    }
}

