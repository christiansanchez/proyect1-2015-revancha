package db_factibilidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class creacion_bd {

	public static void main(String[] args) {
		try{
			//cargo driver
			String driver = "com.mysql.jdbc.Driver";	
			Class.forName(driver);
		
			String url = "jdbc:mysql://localhost:3306/";
			
			System.out.println("********** CONECTANDO MYSQL **********");
			//creo conexion
			Connection con = DriverManager.getConnection(url, "root", "admin");
			
			System.out.println("********** CONECTADO MYSQL **********");
			//crear db Escuela
			System.out.println("********** CREANDO BASE DE DATOS **********");
			String createDB = "CREATE DATABASE factibilidad2015;";
			PreparedStatement pstmt = con.prepareStatement(createDB);	
			int cant = pstmt.executeUpdate();
			pstmt.close();	
			System.out.println("********** CREADA BASE DE DATOS **********");
			//seteo la db a usar 
			String strSetDB = "Use factibilidad2015;";
			pstmt = con.prepareStatement(strSetDB);	
			cant = pstmt.executeUpdate();
			pstmt.close();		
			System.out.println("********** CREANDO TABLA **********");
			//crear tabla coordenadas (posicion_x VARCHAR(10), posicion_y VARCHAR(10))
			String createTableCoodenadas = "CREATE TABLE coordenadas (posicion_x VARCHAR(10), posicion_y VARCHAR(10));";
			pstmt = con.prepareStatement(createTableCoodenadas);	
			cant = pstmt.executeUpdate();
			pstmt.close();
			System.out.println("********** CREADA TABLA **********");
			//cierro conexion con base de datos
			con.close();
			System.out.println("********** DESCONECTADO MYSQL **********");
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}

}
