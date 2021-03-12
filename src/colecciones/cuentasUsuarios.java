package colecciones;

import java.util.*;

public class cuentasUsuarios {

	public static void main(String[] args) {
		clientes cl1 = new clientes("juan","12345",2500);
		clientes cl2 = new clientes("maynor","12845",2500);
		clientes cl3 = new clientes("alicia","12645",2500);
		clientes cl4 = new clientes("blanca","17345",2500);
		
		 Set<clientes> cuentas_clientes = new HashSet<clientes>();
		 
		 cuentas_clientes.add(cl1);
		 cuentas_clientes.add(cl2);
		 cuentas_clientes.add(cl3);
		 cuentas_clientes.add(cl4);
		 Iterator<clientes> it = cuentas_clientes.iterator();
		 while(it.hasNext()) {
			 if(it.next().getNombre().equals("juan")) {
				 it.remove();
			 }
		 }
		 for (clientes c : cuentas_clientes) {
			System.out.println(c.getNombre()+" "+c.getNumero_cuenta()+" "+ c.getSaldo());
		}
		 /*
		 Iterator<clientes> it = cuentas_clientes.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next().getNombre());
			 
			 
		 }*/
		 
	}
	

}
