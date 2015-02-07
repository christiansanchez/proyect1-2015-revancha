
/**
 * WsFactibilidadCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package ws_factibilidad_tecnica;

    /**
     *  WsFactibilidadCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WsFactibilidadCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WsFactibilidadCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WsFactibilidadCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for setCoordenadas method
            * override this method for handling normal response from setCoordenadas operation
            */
           public void receiveResultsetCoordenadas(
                    ws_factibilidad_tecnica.WsFactibilidadStub.SetCoordenadasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setCoordenadas operation
           */
            public void receiveErrorsetCoordenadas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCoordenadas method
            * override this method for handling normal response from getCoordenadas operation
            */
           public void receiveResultgetCoordenadas(
                    ws_factibilidad_tecnica.WsFactibilidadStub.GetCoordenadasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCoordenadas operation
           */
            public void receiveErrorgetCoordenadas(java.lang.Exception e) {
            }
                


    }
    