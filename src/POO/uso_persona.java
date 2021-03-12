package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_persona {

	public static void main(String[] args) {
		persona[] person = new persona[2];
		person[0]=new empleados2("paco gomez",45000,1990,12,17);
		person[1]= new alumno("maynor","informatica");
		for(persona e: person) {
			System.out.println(e.DameDescripcion()+" nombre "+e.DameNombre());
		}
	}

}
abstract class persona{
	
	public persona(String nom) {
		nombre = nom;
		
	}
	private String nombre;
	public String DameNombre() {
		
		return "el nombre es: "+ nombre;
	}
	public abstract String DameDescripcion();
	
}

class empleados2 extends persona{

	 public empleados2(String nom,double sue,int agno,int mes,int dia) {//constructor
		 super(nom);
		 nombre = nom;
		 sueldo = sue;
		 
		 GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia); 
		 alta_contrato = calendario.getTime();
		 
	 }
	 public String DameDescripcion() {
		 return "este es un empleado ";
	 }
	 
	 public double DameSueldo() {
		 
		 return sueldo;
		 
	 }
	 
	 public Date dame_alta_contrato() {
		 
		 return alta_contrato;
	 }
	 
	 public void sube_sueldo(double porsentaje) {
		 
		 double aumento = sueldo*porsentaje/100;
		 sueldo += aumento;
	 }
	 public void setID() {
		 id++;
	 }
	 
	 private String nombre;
	 private double sueldo;
	 private Date alta_contrato;
	public static int id=0;
}
class alumno extends persona{
	public alumno(String nombre,String car){
		super(nombre);
		carrera = car;
	}
	public String DameDescripcion() {
		return "este es un alumno";
	}
	private String carrera;
}
