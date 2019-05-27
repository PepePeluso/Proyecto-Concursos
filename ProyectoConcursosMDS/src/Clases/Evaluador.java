package Clases;

/***********************************************************************
 * Module:  Evaluador.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Evaluador
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** @pdOid 70cb4cc2-157a-4a6a-9cf2-e93e964df48e */
public class Evaluador extends Persona implements Verificacion,Serializable {

    public Evaluador(String nombre, String cedula, Fecha fechaNacimiento) {
        super(nombre, cedula, fechaNacimiento);
    }
    
   public ArrayList<Participante> Aprobados(ArrayList<Participante> participantes) {
       
       ArrayList<Participante> aprobados=new ArrayList<Participante>();
       for (int i = 0; i < participantes.size(); i++) {
           if(participantes.get(i).calcularEdad()<40&&participantes.get(i).getAnosEXperiencia()>=3)
               aprobados.add(participantes.get(i));
                      }
      return aprobados;
   }

    @Override
    public boolean verificarDatos() {
      if(!verificarCedula(cedula)){
         return false;
        }
      return true;
    }

   

}