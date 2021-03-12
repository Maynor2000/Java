package colecciones;

import java.util.*;

public class pruevaLinckedList {

	public static void main(String[] args) {
		LinkedList<String> miLista = new LinkedList<String>();
		miLista.add("maynor");
		miLista.add("blanca");
		miLista.add("aurora");
		miLista.add("josefina");
		
		System.out.println(miLista.size());
		
		ListIterator<String> it = miLista.listIterator();
		it.next();

		it.add("rodrigo");
		
		for(String e:miLista) {
			System.out.println(e);
		}

	}

}
