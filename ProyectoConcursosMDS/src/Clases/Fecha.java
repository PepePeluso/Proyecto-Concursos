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
   private int dia;
   private int mes;
   private int ano;
    //Constructor por defecto
    public Fecha() {
         Calendar fecha=Calendar.getInstance();
         ano=fecha.get(Calendar.YEAR);
         mes=(fecha.get(Calendar.MONTH)+1);
         dia=fecha.get(Calendar.DAY_OF_MONTH)-1;
    }

    //Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.ano = año;
    }

    //setters y getters
    public void setDia(int d) {
        dia = d;
    }
    public void setMes(int m) {
        mes = m;
    }
    public void setAño(int a) {
        ano = a;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return ano;
    }
    //Método privado para comprobar si el año es bisiesto
    //Este método lo utiliza el método fechaCorrecta
   
   public boolean validarFecha(Fecha fecha) {
      if(!(fecha.getAño()>=ano))
      {    
      return false;
      
      }else if(!(fecha.getAño()==ano)){
     
      return true;
      
      }else{
           if(!(fecha.mes>=mes)){
               return false;
           }else if(!(fecha.mes==mes)){
           return true;
           }else{
           if(fecha.dia>dia){
           return true;
           }else{
           return false;
           }
           }
      }
       
   }
   
    @Override
    public String imprimir() {
        return this.dia+"/"+this.mes+"/"+this.ano;
    }

}