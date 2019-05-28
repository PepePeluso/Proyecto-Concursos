package Clases;

/***********************************************************************
 * Module:  Concurso.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Concurso
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

/** @pdOid c6ab528e-b770-4ab0-952a-271409d1e7f5 */
public class Concurso implements Verificacion, Serializable {
   /** @pdOid 16f37124-50a5-49a8-acec-48700e238199 */
   private int maxParticipantes;
   /** @pdOid 5ba37f67-c368-48ae-aa5c-ae5664eab6ba */
   private int minParticipantes;
   /** @pdOid f17d27c0-1b6d-419d-ba61-92e06be85106 */
   private Fecha fechaInicioConcurso;
   /** @pdOid c789457d-09f1-47e4-ab75-fd573e407482 */
   private Fecha fechaFinConcurso;
   /** @pdOid efe49873-509e-4ddb-bde1-6c0ce718ba43 */
   private String nombre;
   /** @pdOid 0f951f90-9700-4a9e-87d3-0c641bc6de6e */
   private ArrayList<Participante> participantes;
   
   private ArrayList<Participante> seleccionados;
   /** @pdOid 1663b3b9-70d2-4000-9bc1-a88cc47a3740 */
   private Evaluador evaluador;

    public Concurso(int maxParticipantes, int minParticipantes, Fecha fechaInicioConcurso, Fecha fechaFinConcurso, String nombre , Evaluador evaluador) {
        this.maxParticipantes = maxParticipantes;
        this.minParticipantes = minParticipantes;
        this.fechaInicioConcurso = fechaInicioConcurso;
        this.fechaFinConcurso = fechaFinConcurso;
        this.nombre = nombre;
        this.participantes = new ArrayList<Participante>();
        this.evaluador = evaluador;
    }

    @Override
    public boolean verificarDatos() {
         if(!(maxParticipantes<=60)){
         JOptionPane.showMessageDialog(null, "El maximo  de participantes por concurso es de 60","Error",JOptionPane.ERROR_MESSAGE);
         return false;
         }
         if(!(minParticipantes>5)){
             JOptionPane.showMessageDialog(null, "El minimo de participantes por concursos es de 6","Error",JOptionPane.ERROR_MESSAGE);
         return false;
         }
         if(!(maxParticipantes>=minParticipantes)){
             JOptionPane.showMessageDialog(null, "El mumero maximo de participantes debe ser mayor al minimo de participantes","Error",JOptionPane.ERROR_MESSAGE);
         return false;
         }
         if(!(new Fecha().validarFecha(fechaInicioConcurso))){
             JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser igual o mayor a la fecha de hoy","Error",JOptionPane.ERROR_MESSAGE);
         return false;
         }
         
         if(!(fechaInicioConcurso.validarFecha(fechaFinConcurso))){
             JOptionPane.showMessageDialog(null, "Fecha de fin de concurso debe ser mayor a fecha de inicio del concurso","Error",JOptionPane.ERROR_MESSAGE);
         return false;
         }
         
         
             
           
           return true;
    }
    public boolean AgregarParticipante(Participante participante){
    if(participante.verificarDatos()){
        for (int i = 0; i < participantes.size(); i++) {
            if(i<maxParticipantes){
            if(participantes.get(i).getCedula().equals(participante.getCedula())){
                JOptionPane.showMessageDialog(null, "Este participante ya existe","Error",JOptionPane.ERROR_MESSAGE);
                return false;
                        }
                
            }else{
                JOptionPane.showMessageDialog(null, "No hay espacio para mas participantes","Error",JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
        participantes.add(participante);
        JOptionPane.showMessageDialog(null, "Participante agragado correctamente al concurso: "+nombre);
        return true;
    }
    return false;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public int getMinParticipantes() {
        return minParticipantes;
    }

    public void setMinParticipantes(int minParticipantes) {
        this.minParticipantes = minParticipantes;
    }

    public Fecha getFechaInicioConcurso() {
        return fechaInicioConcurso;
    }

    public void setFechaInicioConcurso(Fecha fechaInicioConcurso) {
        this.fechaInicioConcurso = fechaInicioConcurso;
    }

    public Fecha getFechaFinConcurso() {
        return fechaFinConcurso;
    }

    public void setFechaFinConcurso(Fecha fechaFinConcurso) {
        this.fechaFinConcurso = fechaFinConcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

   

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }    

    public ArrayList<Participante> getSeleccionados() {
        return seleccionados;
    }

    public void setSeleccionados(ArrayList<Participante> seleccionados) {
        this.seleccionados = seleccionados;
    }
   

}