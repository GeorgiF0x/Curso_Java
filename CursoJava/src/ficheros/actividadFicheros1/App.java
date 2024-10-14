package ficheros.actividadFicheros1;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
	
		//1- crear fichero
			String ruta = "C:\\Users\\gborisov\\Desktop\\Temario\\Sesion 6 (1)\\Sesion 6\\Actividades\\miFichero.txt";
			File miFichero=Fichero.crearFichero(ruta);
		//2-Introducir lineas
			Fichero.addLineasFichero(miFichero);
		//3-Hacer modificacion
			Fichero.modificarFichero(miFichero,true);
		//4-Eliminar Linea
			Fichero.eliminarLinea(miFichero, 5);
	}
	
	
	

}
