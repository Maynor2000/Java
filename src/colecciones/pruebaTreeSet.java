package colecciones;

import java.util.*;

public class pruebaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo primero = new Articulo(2,"juan");
		Articulo segundo = new Articulo(1,"maynor");
		Articulo tercero = new Articulo(3,"ricardo");
		
		TreeSet<Articulo> lista = new TreeSet<Articulo>();
		
		lista.add(segundo);
		lista.add(primero);
		lista.add(tercero);
		
		 for(Articulo a:lista) {
			 System.out.println(a.getDescription());
		 }
		 
		 
		 TreeSet<Articulo> lista2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
				public int compare(Articulo a1, Articulo a2) {
				 String argumento1 = a1.getDescription();
				 String argumento2 = a2.getDescription();
					return argumento1.compareTo(argumento2);
				}
		 });
		 
		 lista2.add(primero);
		 lista2.add(segundo);
		 lista2.add(tercero);
		 
		 for(Articulo a:lista2) {
			 System.out.println(a.getDescription());
		 }
	}

}

class Articulo implements Comparable<Articulo>{

	public Articulo(int id,String desc) {
		this.id=id;
		descripccion=desc;
	}

	public int compareTo(Articulo a) {
		// TODO Auto-generated method stub
		return id-a.id;
	}
	public String getDescription() {
		return descripccion;
	}
	
	private int id;
	private String descripccion;
	
	
	
}