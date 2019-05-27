package Clases;

/***********************************************************************
 * Module:  Persona.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Persona
 ***********************************************************************/

import java.util.*;

/** @pdOid 0d7970b2-e7ae-48ec-9fc3-8d909a3fae84 */
public abstract class Persona {
   /** @pdOid e9eb4ce9-6f62-4e6e-bf7b-48e8c249982d */
   protected String nombre;
   /** @pdOid e73b1a73-4c6b-4d8b-a1eb-e80543bd9c72 */
   protected String cedula;
   /** @pdOid 7dbd21f7-8251-46cb-8b78-d8f974e9c172 */
   protected Fecha fechaNacimiento;
   
   /** @param cedula
    * @pdOid 13d219d4-cf18-4dbc-8315-d48bd02b6035 */
   public boolean verificarCedula(String cedula) {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 0436374d-6a7a-40de-8a80-7d1858d0ea24 */
   public int calcularEdad() {
      // TODO: implement
      return 0;
   }

}