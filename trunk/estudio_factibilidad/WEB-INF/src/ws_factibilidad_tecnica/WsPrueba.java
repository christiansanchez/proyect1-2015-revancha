package ws_factibilidad_tecnica;
import java.util.TreeMap;

public class WsPrueba {
	
	public void setCoordenadas(String posX, String posY){
		/*Metodo encargado de persistir en la base de datos las
		 * coordenadas X e Y que reciba el metodo*/
		
	}
	
	public TreeMap<String, String> getCoordenadas(){
		TreeMap <String, String>coordenadas = new TreeMap<String, String>();
		String posX = "0";
		String posY = "0";
		//Falta obtener las coordenas de X e Y de base de datos
		
		coordenadas.put("posX", posX);
		coordenadas.put("posY", posY);
		return coordenadas;				
	}	
}
