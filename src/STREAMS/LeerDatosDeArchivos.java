package STREAMS;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
public class LeerDatosDeArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byts by = new byts();
		by.LeerByts();

	}

}
class byts{
	public void LeerByts() {
		int contador=0;
			int[] myBytes = new int[332051];
			
			try {
			FileInputStream imagen = new FileInputStream("C:\\Users\\may_u\\Desktop\\curso java\\curso java\\src\\STREAMS\\venelope.jpg");
			boolean finalArchivo=false;
			
			while(!finalArchivo) {
				int Bytes= imagen.read();
				if(Bytes!=-1) {
					myBytes[contador]=Bytes;
					System.out.println(myBytes[contador]);
				}
				else {
					finalArchivo=true;
				}
				//if(Bytes==-1)
					
				//System.out.println(myBytes[contador]);
				//System.out.println(Bytes+" "+contador);
				contador++;
			}
			escribeByts(myBytes);
			imagen.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void escribeByts(int byts[]) {
		try {
			FileOutputStream fg = new FileOutputStream("C:\\Users\\may_u\\Desktop\\curso java\\curso java\\src\\STREAMS\\venelopecopia2.jpg");
			for(int i=0;i<byts.length;i++) {
				fg.write(byts[i]);
			}
			fg.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
