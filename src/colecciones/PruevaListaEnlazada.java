package colecciones;
import java.util.*;
public class PruevaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("D.F");
		capitales.add("Lima");
		
		ListIterator<String> itP = paises.listIterator();
		
		ListIterator<String> itC =capitales.listIterator();
		while(itC.hasNext()) {
			
			if(itP.hasNext()) {
				itP.next();
				itP.add(itC.next());
			}
			
		}
		System.out.println(paises);
		itC=capitales.listIterator();
		while(itC.hasNext()) {
			itC.next();
			if(itC.hasNext()) {
				itC.next();
				itC.remove();
			}
		}
		paises.removeAll(capitales);
		System.out.println(capitales);
		System.out.println(paises);
	}

}
