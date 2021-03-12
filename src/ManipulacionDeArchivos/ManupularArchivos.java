package ManipulacionDeArchivos;

import java.io.File;

import javax.swing.JOptionPane;

public class ManupularArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File("src\\POO");
		System.out.println(archivo.getAbsolutePath());
		String[] carpetas=archivo.list();
		
		for(int i=0;i<carpetas.length;i++) {
			System.out.println(carpetas[i]);
		}
		//System.out.println(archivo.list());
		System.out.println(archivo.exists());
		
	}

}
