package tareaBanco.interfaces;

import java.util.HashMap;
import java.util.List;

public interface Imprimible<T> {

    default void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
        	System.out.println(elemento.toString());
        }
    }
    
    
    default <K, V> void imprimirHashMap(HashMap<K, V> mapa) {
        for (V valor : mapa.values()) {
            System.out.println(valor.toString());
        }
    }

}
    


