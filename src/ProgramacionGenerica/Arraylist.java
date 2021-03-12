package ProgramacionGenerica;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<empleado> ListaEmpleados = new ArrayList<empleado>();
		ListaEmpleados.add(new empleado("maynor",20));
		System.out.println(ListaEmpleados.get(0).DatosEmpleados());
	}

}
class empleado{
	String nombre;
	int edad;
	public empleado(String nombre,int edad) {
		this.edad=edad;
		this.nombre=nombre;
	}
	public String DatosEmpleados() {
		return "nombre "+nombre+" edad "+edad;
	}
}