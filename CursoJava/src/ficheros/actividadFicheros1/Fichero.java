package ficheros.actividadFicheros1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Fichero {
	
	public static File crearFichero(String ruta) throws IOException {
		File ficheroNuevo= new File(ruta);
		if(!ficheroNuevo.exists()) {
			if (ficheroNuevo.createNewFile()) {
                System.out.println("Fichero creado.");
            } else {
                System.out.println("No se pudo crear el fichero.");
            }
			
		}else {
			System.out.println("El fichero ya existe");
		}
		return ficheroNuevo;
	}
	
	static void addLineasFichero(File fichero) throws IOException {
		BufferedWriter bw= new BufferedWriter(new FileWriter(fichero));
		String textoParaLineas="TIN PATATA";
		int numAleatorio= (int) (Math.random() * 10) + 5;
		
		for (int i = 0; i < numAleatorio; i++) {
			bw.write(textoParaLineas +" " +i);
			bw.newLine();
		}
		bw.close();
	}
	
	static void modificarFichero(File fichero, boolean append) throws IOException {
		BufferedWriter bw= new BufferedWriter(new FileWriter(fichero,append));
		bw.write("hemos modificado el fichero");
		bw.newLine();
		bw.close();
	}
	
	
	static void eliminarLinea(File fichero, int lineaEliminar) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fichero));
	    File copiaTemporal = new File("archivo_tmp");
	    BufferedWriter bw = new BufferedWriter(new FileWriter(copiaTemporal));

	    String lineaLeida;
	    int conta = 0;

	    while ((lineaLeida = br.readLine()) != null) {
	        if (conta != lineaEliminar) {
	            bw.write(lineaLeida); // Escribir la línea leída en el archivo temporal
	            bw.newLine(); // Añadir nueva línea
	        }
	        conta++;
	    }

	    // Cerrar los flujos de lectura y escritura
	    bw.close();
	    br.close();

	   
	    if (fichero.delete()) {
	        copiaTemporal.renameTo(fichero);
	        System.out.println("Línea eliminada y archivo actualizado.");

	     
	        String nombreCopiaOG = "copia_" + fichero.getName();
	        File copiaOriginal = new File(nombreCopiaOG);
	        if (copiaOriginal.exists()) {
	            System.out.println("El archivo de copia ya existe."+copiaOriginal.getAbsolutePath());
	        } else {
	            if (copiaOriginal.createNewFile()) {
	                System.out.println("Archivo de copia creado: " + copiaOriginal.getPath());
	            } else {
	                System.out.println("No se pudo crear la copia del archivo.");
	            }
	        }
	       

	        // Copiar el contenido del archivo actualizado a la copia
	        BufferedReader brCopia = new BufferedReader(new FileReader(fichero));
	        BufferedWriter bwCopia = new BufferedWriter(new FileWriter(copiaOriginal));

	        while ((lineaLeida = brCopia.readLine()) != null) {
	            bwCopia.write(lineaLeida);
	            bwCopia.newLine();
	        }
	        
	        // Cerrar los flujos de la copia
	        brCopia.close();
	        bwCopia.close();
	    } else {
	        System.out.println("Error al eliminar el archivo original.");
	    }
	}

	
	

}
