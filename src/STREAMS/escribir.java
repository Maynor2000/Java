package STREAMS;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class escribir {

	public static void main(String[] args) {
		escribir1 e1 = new escribir1();
		e1.escribir();
	}

}
class escribir1{
	public void escribir() {
		String a =JOptionPane.showInputDialog("escribe el mensaje");
		try {
			FileWriter escr = new FileWriter("C:\\Users\\may_u\\Desktop\\curso java\\curso java\\src\\STREAMS\\"+JOptionPane.showInputDialog("nombre del fichero")+".txt");
			for(int i=0;i<a.length();i++) {
					escr.write(a.charAt(i));
					System.out.print(a.charAt(i));
			}
		escr.close();
		} catch (IOException e) {
			System.out.println("no de encontro el archivo");
		}
	}
}