
/**
 * Axis2SpringServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package org.packt.erp.modules;

    /**
     *  Axis2SpringServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class Axis2SpringServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public Axis2SpringServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public Axis2SpringServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getMessage method
            * override this method for handling normal response from getMessage operation
            */
           public void receiveResultgetMessage(
                    org.packt.erp.modules.Axis2SpringServiceStub.GetMessageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMessage operation
           */
            public void receiveErrorgetMessage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllPersons method
            * override this method for handling normal response from getAllPersons operation
            */
           public void receiveResultgetAllPersons(
                    org.packt.erp.modules.Axis2SpringServiceStub.GetAllPersonsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllPersons operation
           */
            public void receiveErrorgetAllPersons(java.lang.Exception e) {
            }
                


    }
    