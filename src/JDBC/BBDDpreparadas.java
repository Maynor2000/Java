package JDBC;
import java.sql.*;
public class BBDDpreparadas {

	public static void main(String[] args) {
		try {
		Connection preparado = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
		PreparedStatement statement = preparado.prepareStatement("SELECT* FROM CLIENTES WHERE POBLACIÓN=?");
		statement.setString(1,"MADRID");
		ResultSet tabla = statement.executeQuery();
		while(tabla.next()) {
			System.out.println(tabla.getString("EMPRESA"));
		}
		tabla.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
