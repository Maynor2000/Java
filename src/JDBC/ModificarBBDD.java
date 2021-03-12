package JDBC;
import java.sql.*;
public class ModificarBBDD {

	public static void main(String[] args) {
		
		try {
		Connection clientes = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
		Statement miconsulta = clientes.createStatement();
		String insertar ="INSERT INTO CLIENTES(CÓDIGOCLIENTE,EMPRESA,DIRECCIÓN) VALUES('A207','MSSTUDIO','MERIDA')\"";
		String Actualizar= "UPDATE CLIENTES SET POBLACIÓN='MÉXICO',TELÉFONO='999646572' WHERE CÓDIGOCLIENTE='A207'";
		String Eliminar = "DELETE FROM CLIENTES WHERE CÓDIGOCLIENTE='A207'";
		miconsulta.executeUpdate(Eliminar);
		System.out.println("se ha agreagado los datos correctamente");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
