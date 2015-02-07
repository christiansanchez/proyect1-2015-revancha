package cliente_java_ws_factibilidad_tecnica;
import java.rmi.RemoteException;

import ws_factibilidad_tecnica.WsFactibilidadStub;
import ws_factibilidad_tecnica.WsFactibilidadStub.GetCoordenadasResponse;
import ws_factibilidad_tecnica.WsFactibilidadStub.SetCoordenadas;
import ws_factibilidad_tecnica.WsFactibilidadStub.SetCoordenadasResponse;
public class ClienteWsFactibilidad {

	public static void main(String[] args) {
		String url = "http://127.0.0.1:8080/axis2/services/WsFactibilidad.WsFactibilidadHttpEndpoint/";
		try {
			WsFactibilidadStub cliente = new WsFactibilidadStub(url);
			SetCoordenadas reqSetCoord = new SetCoordenadas();
			reqSetCoord.setPosX("1");
			reqSetCoord.setPosY("20");
			SetCoordenadasResponse respSetCoord = cliente.setCoordenadas(reqSetCoord);
			System.out.println("Response set: " + respSetCoord.get_return());
			
			
			GetCoordenadasResponse respGetCoord = cliente.getCoordenadas();
			System.out.println("Response get: " + respGetCoord.get_return());
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
