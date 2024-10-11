package tareaBanco.interfaces;

import java.util.HashMap;

public interface Rellenable<T> {

	
    default <K, V> void addHashMap(HashMap<K, V> mapa, K clave, V valor) {
    	mapa.put(clave, valor);
    }
}
