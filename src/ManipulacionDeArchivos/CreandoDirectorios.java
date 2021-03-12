package ManipulacionDeArchivos;

import java.io.File;

import javax.swing.JOptionPane;

public class CreandoDirectorios {

	public static void main(String[] args) {
		File directorio = new File("C:"+File.separator + "Users"+File.separator+"may_u"+File.separator+"Desktop"+File.separator+"curso java"+File.separator+"curso java"+File.separator+"src"+File.separator+"ManipulacionDeArchivos"+File.separator+"holaa");
		directorio.mkdir();
	}

}
