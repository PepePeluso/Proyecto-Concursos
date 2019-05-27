package Clases;

/***********************************************************************
 * Module:  Empresa.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Empresa
 ***********************************************************************/

import java.util.*;

/** @pdOid d75040f2-79bf-45a8-bb4f-b311cc64ab97 */
public class Empresa implements Verificacion {
   /** @pdOid 553e848b-7408-4efe-b422-68bf9f5e7b59 */
   private ArrayList<Evaluador> evaluadores;
   /** @pdOid 6ffd60a5-6fbe-4260-b1a4-5ba300e0dd34 */
   private ArrayList<Concurso> concusros;
   /** @pdOid 22f65321-ccc4-47d5-943c-452d656b4444 */
   private String nombre;
   /** @pdOid fbfcab43-e940-4766-beb1-9f74ad2cd89f */
   private int telefono;
   /** @pdOid f1403ef4-4cd7-4b61-86c8-edca2f929eea */
   private Direccion direccion;
   /** @pdOid 36ab6815-c7c9-405d-abac-fbcb1b54378c */
   private Login login;
   
   /** @pdOid 14e5bd20-2cbd-47a1-a19f-f53d69542d9a */
   public void guardar() {
      // TODO: implement
   }
   
   /** @pdOid 20b805ff-cc5f-41a1-9577-5957c9516306 */
   public Empresa abrir() {
      // TODO: implement
      return null;
   }

    @Override
    public boolean verifocarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}