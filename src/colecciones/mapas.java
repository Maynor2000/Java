package colecciones;

import java.util.*;

public class mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,empleadosmapas> mapa = new HashMap<String,empleadosmapas>();
		
		mapa.put("145", new empleadosmapas("maynor"));
		mapa.put("146", new empleadosmapas("esteban"));
		mapa.put("147", new empleadosmapas("abdiel"));
		
		System.out.println(mapa);
		mapa.remove("146");
		System.out.println(mapa);
		System.out.println(mapa.entrySet());
		 for(Map.Entry<String, empleadosmapas> c:mapa.entrySet()) {
			 String k=c.getKey();
			 empleadosmapas v = c.getValue();
			 
			 System.out.println("Clave: "+k+" Valor: "+v);
		 }
	}

}
class empleadosmapas{
	public empleadosmapas(String n) {
		nombre=n;
		sueldo=2000;
	}
	public String toString() {
		return "[NOMBRE: "+nombre+",SUELDO: "+sueldo+"]";
	}
	
	private String nombre;
	private double sueldo;
}