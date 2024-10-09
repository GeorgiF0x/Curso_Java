package ejercicioTren;

import java.util.Scanner;

public class Vagon {
	//atributos
	private static int contadorVagon = 0;
	private int idVagon=0;
	private Persona arrayPersona [][];
	
	//contructor
    public Vagon() {
    	idVagon = ++contadorVagon;
    	arrayPersona= new Persona [16][4];
    }
    //motods
    public void asignarAsiento(Persona pasajero) {
        for (int i = 0; i < arrayPersona.length; i++) {
            for (int j = 0; j < arrayPersona[i].length; j++) {
                if (arrayPersona[i][j] == null) {
                    arrayPersona[i][j] = pasajero;
                    System.out.println("Asiento asignado en fila " + i + ", columna " + j);
                    return;  // si no salgo con return se hace infinito 
                }
            }
        }
        System.out.println("Vagón lleno");
    }
    
    public boolean validarLimiteAsientos(int fila, int columna) {
        return fila >= 0 && fila < arrayPersona.length && columna >= 0 && columna < arrayPersona[0].length;
    }

    
    public void reservarAsiento(Persona p) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        boolean asientoReservado = false;  

 
        while (!asientoReservado) {
            System.out.println("Introduce Fila: ");
            fila = scanner.nextInt();
            System.out.println("Introduce Columna: ");
            columna = scanner.nextInt();

            if (validarLimiteAsientos(fila, columna)) {
                if (arrayPersona[fila][columna] == null) {
                    arrayPersona[fila][columna] = p;
                    System.out.println("Asiento reservado en fila " + fila + ", columna " + columna);
                    asientoReservado = true;  
                } else {
                    System.out.println("El asiento está ocupado. Ingresa otra fila y columna.");
                }
            } else {
                System.out.println("Asiento fuera de rango. Ingresa una fila entre 0-15 y columna entre 0-3.");
            }
        }
    }
    
    
    private char[][] comprobarAsientos() {
        char[][] arrayOcupados = new char[arrayPersona.length][arrayPersona[0].length];
        
        for (int i = 0; i < arrayPersona.length; i++) {
            for (int j = 0; j < arrayPersona[i].length; j++) {
                if (arrayPersona[i][j] == null) {
                    arrayOcupados[i][j] = 'L';  // Libre
                } else {
                    arrayOcupados[i][j] = 'O';  // Ocupado
                }
            }
        }
        
        return arrayOcupados;
    }
    

    
    public void mostrarEstructuraAsientos() {
        char[][] arrayOcupados = comprobarAsientos();
        
        for (int i = 0; i < arrayOcupados.length; i++) {
            for (int j = 0; j < arrayOcupados[i].length; j++) {
                System.out.print(arrayOcupados[i][j] + " ");
            }
            System.out.println();  
        }
    }
}
