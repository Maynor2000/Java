package colecciones;

public class Uso_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("blanca una hermosa novia","blanca y maynor",12);
		Libro libro2 = new Libro("blanca una hermosa novia","blanca y maynor",12);
		//System.out.println(libro1);
		//System.out.println(libro2);
		//igualamos el hascode
		//libro1=libro2;
		if (libro1.equals(libro2)) {
			System.out.println("iguales");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
		else {
			System.out.println("diferentes");
		}
		/*
		if(libro1.getisbn()==libro2.getisbn()) {
			System.out.println("iguales");
		}
		else {
			System.out.println("diferentes");
		}
		*/
	}

}
