package JDBC;
import java.sql.*;
import java.util.ArrayList;
public class jdbc1 {
	public static void main(String[] args) {
		int contador=0;
		try {
			Connection Myconeccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			Statement mystatement = Myconeccion.createStatement();
			ResultSet myResultlset = mystatement.executeQuery("SELECT EMPRESA,DIRECCI�N FROM CLIENTES");
			ArrayList<String>miarray=new ArrayList<String>();
			while(myResultlset.next()) { 

				//System.out.println(myResultlset.getString("EMPRESA")); 
				miarray.add(contador+"Empresas: "+myResultlset.getString("EMPRESA")+" Direcion: "+myResultlset.getString("DIRECCI�N"));
				contador++;
			}
			for(String a:miarray) {
				System.out.println(a);
			}

		}catch(Exception e) {
			System.out.println("no conecta");
			e.printStackTrace();
		}
	}

}
