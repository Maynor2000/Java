package ProgramacionGenerica;

public class inicio {

	public static void main(String[] args) {
		jefe<String> miJefe = new jefe<String>();
		miJefe.asignaValor("maynor");
		System.out.println(miJefe.devuelveValor());

	}

}
