package Clases;

/***********************************************************************
 * Module:  Participante.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Participante
 ***********************************************************************/

import java.util.*;

/** @pdOid b271d8fc-3de5-4c6e-a804-43bc963b977d */
public class Participante extends Persona implements Verificacion {
   /** @pdOid 02b7943f-38bd-4396-8645-39cb3d3e0fd2 */
   private String profesion;
   /** @pdOid c127fbdf-d03d-4d88-bb90-600bd01a1197 */
   private int anosEXperiencia;

    @Override
    public boolean verifocarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}