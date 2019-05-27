package Clases;

/***********************************************************************
 * Module:  Fecha.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Fecha
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** @pdOid 8ce7475a-3cbd-4d8d-b67a-3a61e495972c */
public class Fecha implements Escritura,Serializable {
   /** @pdOid 59d3390c-5a12-4a57-be61-38d292003c1e */
   private int dia;
   /** @pdOid 1065ce0f-94c2-4a93-8fd8-fa19e6296682 */
   private int mes;
   /** @pdOid aa802670-585b-42e5-9aa3-f0f9e8c5b3f7 */
   private int ano;
   
   /** @param fecha
    * @pdOid 7f7e3305-d24b-4315-9863-7acf344df21e */
   public boolean validarFecha(Fecha fecha) {
      
      return false;
   }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}