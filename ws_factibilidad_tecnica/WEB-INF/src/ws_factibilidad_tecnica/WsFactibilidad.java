package ws_factibilidad_tecnica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

public class WsFactibilidad {
	
		public void setCoordenadas(String posX, String posY){
			try{
				/* 1. cargo dinamicamente el driver de MySQL */
				String driver = "com.mysql.jdbc.Driver";
				Class.forName(driver);

				/* 2. una vez cargado el driver, me conecto con la base de datos */
				String url = "jdbc:mysql://localhost:3306/factibilidad2015";
				Connection con = DriverManager.getConnection(url, "root", "admin");

				/* 3. creo un PreparedStatement para insertar una persona en base de datos */
				String insert = "INSERT INTO coordenadas VALUES (?, ?)";
				PreparedStatement pstmt = con.prepareStatement(insert);
				pstmt.setString(1, posX);
				pstmt.setString(1, posY);

				/* 4. ejecuto la sentencia de insercion y cierro el PreparedStatement */
				pstmt.executeUpdate();
				pstmt.close();
			
				/* 7. por ultimo, cierro la conexion con la base de datos */
				con.close();
			}
			catch(SQLException | ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		
		public TreeMap<String, String> getCoordenadas(){
			TreeMap<String, String> coordenadas = new TreeMap<String, String>();
			String posX = "";
			String posY = "";
			try
			{
				String driver = "com.mysql.jdbc.Driver";
				Class.forName(driver);
				
				String url = "jdbc:mysql://localhost:3306/factibilidad2015";
				Connection con = DriverManager.getConnection(url, "root", "admin");
				
				String query = "Select posicion_x, posicion_y from";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next())
				{
					posX = rs.getString ("posicion_x");
					posY = rs.getString ("posicion_y");					
				}			
				rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException | ClassNotFoundException e){
				e.printStackTrace();
			}
			coordenadas.put("posX", posX);
			coordenadas.put("posY", posY);
			return coordenadas;
		}
}
