package STREAMS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class secuencias {

	public static void main(String[] args) {
	LeerFichero m = new LeerFichero();
	m.leer1();
	}

}
class LeerFichero{
	public void leer() {
		try {
			FileReader archivo = new FileReader("C:\\Users\\may_u\\Desktop\\curso java\\curso java\\src\\STREAMS\\hola");
			
				int c =0;
				while(c!=-1) {
					
					 c =archivo.read();
					 char letra = (char)c;
					 System.out.print(letra);
				}
				archivo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("no se encontro el archivo");
		}
		
	}
	public void leer1() {
		try {
			FileReader archivo = new FileReader("C:\\Users\\may_u\\Desktop\\curso java\\curso java\\src\\STREAMS\\hola");
			BufferedReader mibuffer = new BufferedReader(archivo);
				String frase="";
				while(frase!=null) {
					
					 frase =mibuffer.readLine();
					 if(frase!=null)
					 System.out.println(frase);
				}
				archivo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("no se encontro el archivo");
		}
		
	}
	
}