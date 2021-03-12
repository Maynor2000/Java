package excepciones;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class excepciones_for {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("introduce el email");
		try {
		comprobar(mail);
		}catch(ErrorLongitudTexto e){
			System.out.println("muy corto");
		}

	}
	static void comprobar(String mail) throws ErrorLongitudTexto {
		int arroba=0;
		boolean punto= false;
		if (mail.length()<3) {
			
			throw new ErrorLongitudTexto();
		}else {
		for (int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				punto=true;
			}
		}
		}
		if(arroba==1&&punto==true) {
			System.out.println("correcto");
		}else {
			System.out.println("error");
		}
		
	}

}
class ErrorLongitudTexto extends Exception{
	public ErrorLongitudTexto() {
		
	}
	public ErrorLongitudTexto(String msj) {
		super(msj);
	}
}
