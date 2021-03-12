package POO;

import java.util.*;

public class Uso_empleado{

	public static void main(String[] args) {
	jefatura jefe_RRHH = new jefatura("maynor",20000,1995,3,16);
	//jefe_RRHH.estableceIncentivo(2570);
	empleados[] empleado = new empleados[4];
				empleado[0] = new empleados("paco gomez",45000,1990,12,17);
				empleado[1] = new empleados("halo",25000,1990,12,17);
				empleado[2] = jefe_RRHH;
				empleado[3] = new jefatura("blanca",95000,1990,12,17);
				jefatura jefa_enfermera = (jefatura) empleado[3];//castinhg
				System.out.println(jefa_enfermera.tomar_deciciones("juan esta despedido"));
				
				//Arrays.sort(empleado);
				for(empleados e: empleado) {
					e.establece_bonus(1000);
					e.AsignaId();
					//e.sube_sueldo(5);
					
					System.out.println(e.DameSueldo()+" id: "+e.DameId()
					+"tienen un bono de: "+e.establece_bonus(500));
				}
				
		/*
		jefatura jefe_RRHH = new jefatura("maynor",20000,1995,3,16);
		jefe_RRHH.estableceIncentivo(2570);
		
		empleados[] empleado = new empleados[6];
			empleado[0]= new empleados("paco gomez",85000,1990,12,17);
			empleado[1]= new empleados("ana lopez",95000,1995,6,2);
			empleado[2]= new empleados("maria martin",105000,2002,3,15);
			empleado[3]= new empleados("america");
			empleado[4]= jefe_RRHH;//polimorfismo
			empleado[5]= new jefatura("maynor",20000,1995,3,16);
			
			for(int i=0;i<6;i++) {
				empleados1.asignaId();
				empleado[i].sube_sueldo(5);
				System.out.println();
				System.out.println("nombre "+empleado[i].Dame_Nombre()+" sueldo "+empleado[i].Dame_Sueldo()+
						" fecha de alta "+empleado[i].dame_alta_contrato()+" id: "+empleados1.dameId());
			}*/
			
			
	
			
				
		/*empleados empleado1 = new empleados("paco gomez",85000,1990,12,17);
		empleados empleado2 = new empleados("ana lopez",95000,1995,6,2);
		empleados empleado3 = new empleados("maria martin",105000,2002,3,15);
		empleado1.sube_sueldo(5);
		empleado2.sube_sueldo(5);
		empleado3.sube_sueldo(5);
		
		System.out.println("nombre: "+ empleado1.Dame_Nombre()+" sueldo: "+empleado1.Dame_Sueldo()
		+" fecha de alta: "+empleado1.dame_alta_contrato());
		System.out.println();
		System.out.println("nombre: "+ empleado2.Dame_Nombre()+" sueldo: "+empleado2.Dame_Sueldo()
		+" fecha de alta: "+empleado2.dame_alta_contrato());
		System.out.println();
		System.out.println("nombre: "+ empleado3.Dame_Nombre()+" sueldo: "+empleado3.Dame_Sueldo()
		+" fecha de alta: "+empleado3.dame_alta_contrato());*/
		
	}

}

class empleados implements Comparable,trabajadores{

	 public empleados(String nom,double sue,int agno,int mes,int dia) {//constructor
		 nombre = nom;
		 sueldo = sue;
		 empleados.id=0;
		 GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia); 
		 alta_contrato = calendario.getTime();
		 
	 }
	 public empleados(String nom) {//constructor
		 this(nom,30000,2000,01,01);
		 
	 }
	 public double establece_bonus(double bonus) {
			
			 return trabajadores.bonus+bonus;
		 }
	 public void AsignaId() {
		 id++;
	 }
	 public int DameId() {
		 return id;
	 }
	 
	 public int compareTo(Object miObjeto) {
		 empleados otroEmpleado = (empleados) miObjeto;
		 if(this.sueldo<otroEmpleado.sueldo) {
		 return -1;
		 }
		 if(this.sueldo<otroEmpleado.sueldo) {
			 return 1;
		 }
		
			 return 0;
		 
	 }
	 
	 public String Dame_Nombre() {
		 
		 return nombre;
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
	 
	 private String nombre;
	 private double sueldo;
	 private Date alta_contrato;
	 public static int id;
	
}

class jefatura extends empleados implements jefes{
	
	public jefatura(String nom,double sue,int agno,int mes,int dia) {//constructor
		super(nom,sue,agno,mes,dia);
	}
	 public double establece_bonus(double bonus) {
			double prima=2000;
			
			 return trabajadores.bonus+bonus+prima;
		 }

	public String tomar_deciciones(String desicion) {
		this.desicion = desicion;
		return desicion;
	}
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	public double DameSueldo() {
		double sueldoJefe  = super.DameSueldo();
		return sueldoJefe + incentivo;
	}
	private double incentivo;
	private String desicion;
	
}

class director extends jefatura{
	public director(String nom,double sue,int agno,int mes,int dia) {
		super(nom,sue,agno,mes,dia);
	}
	
	
}