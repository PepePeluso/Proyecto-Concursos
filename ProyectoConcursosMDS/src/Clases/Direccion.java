package Clases;

/***********************************************************************
 * Module:  Direccion.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Direccion
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** @pdOid cc80336d-34a0-48ea-bfb0-5f77af8103a4 */
public class Direccion implements Escritura,Serializable {
   /** @pdOid 7a5d4a97-3477-4514-bc42-59956938eaed */
   private String calleSecundari;
   /** @pdOid 3ab23350-d60c-4e82-aefc-10547f182893 */
   private String callePrincipal;

    public Direccion(String calleSecundari, String callePrincipal) {
        this.calleSecundari = calleSecundari;
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundari() {
        return calleSecundari;
    }

    public void setCalleSecundari(String calleSecundari) {
        this.calleSecundari = calleSecundari;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    @Override
    public String imprimir() {
       return "Calle Principal: "+callePrincipal+" Calle secundaria: "+calleSecundari;
    }

}