package tareaBanco.interfaces;

import java.util.List;

public interface Imprimible<T> {

    default void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
        	System.out.println(elemento.toString());
        }
    }
}

