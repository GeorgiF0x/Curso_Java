package threads.actividadThreads;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HiloContar extends Thread {
    private static Connection conexion;
    private static Statement st;

    // Método para inicializar la conexión desde la clase Conexion
    public static void inicializarConexion() throws SQLException {
        conexion = Conexion.getConexion();
        if (conexion != null) {
            st = conexion.createStatement();
        } else {
            System.out.println("Error al obtener la conexión.");
        }
    }
    
    // Método para contar los registros en la tabla 'alumno'
    public static int contarRegistros() throws SQLException {
        if (st == null) {
            System.out.println("La conexión o el Statement no están inicializados.");
            return -1;
        }

        String query = "SELECT COUNT(*) FROM alumno";
        ResultSet rs = st.executeQuery(query);

        int cantidad = 0;
        if (rs.next()) {
            cantidad = rs.getInt(1); 
        }

        rs.close();
        return cantidad;
    }

  
    @Override
    public void run() {
        try {
      
            int cantidad = contarRegistros();
            System.out.println("Número de registros en la tabla 'alumno': " + cantidad);
        } catch (SQLException e) {
            e.printStackTrace(); 
        } finally {

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class HiloCreaFichero extends Thread {

	private boolean terminado=false;
	@Override
	public void run() {
	  
	        // Verificamos si el nombre del hilo es "nuevoHilo!" y si no ha terminado
	        if (Thread.currentThread().getName().equals("nuevoHilo") &&  !terminado) {
	   
	            terminado=true;
	            System.out.println("Ejecutando hilo " + Thread.currentThread().getName());
	        } else if (Thread.currentThread().getName().equals("nuevoHilo2") && !terminado) {
	     
	            System.out.println("Ejecutando hilo " + Thread.currentThread().getName());
	            terminado=true;
	        } else {
	        
		            System.out.println("Ejecutando hilo " + Thread.currentThread().getName());
	        }
	    
	}

	
	
	public boolean creaFichero() throws IOException {
	    String ruta = "src/threads/actividadThreads/";
	    String nombreFichero = "fichero" + ((int) (Math.random() * 4) + 1) + ".txt"; // Añadimos extensión
	    ruta += nombreFichero;
	    
	    File ficheroNuevo = new File(ruta);
	    if (!ficheroNuevo.exists()) {
	        if (ficheroNuevo.createNewFile()) {
	            //System.out.println("Fichero creado: " + ficheroNuevo.getAbsolutePath());
	        } else {
	            System.out.println("No se pudo crear el fichero.");
	        }
	    } else {
	        System.out.println("El fichero ya existe: " + ficheroNuevo.getAbsolutePath());
	    }
	    return true;
	}
	



	
	
	
}
