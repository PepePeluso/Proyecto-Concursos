package Clases;

/***********************************************************************
 * Module:  Login.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Login
 ***********************************************************************/

import java.util.*;

/** @pdOid 91a316f2-e52f-44d1-a874-04b48b299173 */
public class Login implements Verificacion {
   /** @pdOid 8a67f3d5-969f-4ada-ae2a-3dbaf3c3a94f */
   private String usuario;
   /** @pdOid 41d5c3ea-7de0-4e09-b199-3076277728f0 */
   private String contrasena;
   
   /** @param login
    * @pdOid 3b46a4b6-54d3-4aa1-aa17-54e84f561f22 */
   public boolean verificarlogin(Login login) {
      // TODO: implement
      return false;
   }

    @Override
    public boolean verificarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    void Test(){
        
        System.out.println("ESTA ES UNA PRUEBA :V");
    }
    
    



}