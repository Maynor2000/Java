package POO;

public class prueba {

	public static void main(String[] args) {
		empleados1[] trabajadores = new empleados1[4];
			trabajadores[0] = new empleados1("paco");
			trabajadores[1] = new empleados1("ana");
			trabajadores[2] = new empleados1("antonio");
			trabajadores[3] = new empleados1("maria");
			
			trabajadores[0].cambiaSeccion("RRHH");
	
		  //trabajadores[1].cambiaNombre("cucaramaca");
		for(empleados1 t: trabajadores) {
			//t.asignaId();
			empleados1.asignaId();
			
			System.out.println(t.DameDatos());
		}
		empleados1.asignaId();
		System.out.println("el id siguinte es "+empleados1.dameId());

	}

}

class empleados1{
	
	public empleados1(String nom) {
		id=0;
		nombre = nom;
		seccion = "administracion";
	}
	public static int dameId() {
		return id;
	}
	public static void asignaId() {
		
		id++;
	}
	public void cambiaSeccion(String seccion) {
		
		this.seccion = seccion;
	}
	/*public void cambiaNombre(String nombre) {
		this.nombre = nombre;
		
	}*/
	public String DameDatos() {
		
		return "nombre: "+nombre+" seccion "+seccion+" id "+id;
	}
	private final String nombre;
	private String seccion;
	private static int id;
}