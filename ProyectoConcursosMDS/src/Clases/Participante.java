package Clases;

/***********************************************************************
 * Module:  Participante.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Participante
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

/** @pdOid b271d8fc-3de5-4c6e-a804-43bc963b977d */
public class Participante extends Persona implements Verificacion,Serializable {
   /** @pdOid 02b7943f-38bd-4396-8645-39cb3d3e0fd2 */
   private String profesion;
   /** @pdOid c127fbdf-d03d-4d88-bb90-600bd01a1197 */
   private int anosEXperiencia;
   
    public Participante(String profesion, int anosEXperiencia, String nombre, String cedula, Fecha fechaNacimiento) {
        super(nombre, cedula, fechaNacimiento);
        this.profesion = profesion;
        this.anosEXperiencia = anosEXperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAnosEXperiencia() {
        return anosEXperiencia;
    }

    public void setAnosEXperiencia(int anosEXperiencia) {
        this.anosEXperiencia = anosEXperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    @Override
    public boolean verificarDatos() {
        if (!fechaNacimiento. >=18) 
            JOptionPane.showMessageDialog(null, "La Fecha de nacimiento no es correcta",null, JOptionPane.ERROR_MESSAGE);
            return false;
        
        if (fechaNacimiento. -anosEXperiencia>=18) {
            JOptionPane.showMessageDialog(null, "La Fecha de nacimiento no es correcta",null, JOptionPane.ERROR_MESSAGE);
            return true;
        }
    }

    

}