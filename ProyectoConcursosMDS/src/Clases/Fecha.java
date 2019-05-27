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
    private boolean esBisiesto() {
        return (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
    }
   public boolean validarFecha(Fecha fecha) {
      
     //Método para comprobar si la fecha es correcta
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = ano > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
   
    @Override
    public String imprimir() {
        return " Dia\t "+this.dia+"Mes\t "+this.mes+"Año\t "+this.ano;
    }

}