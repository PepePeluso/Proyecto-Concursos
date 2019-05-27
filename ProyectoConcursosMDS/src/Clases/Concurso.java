package Clases;

/***********************************************************************
 * Module:  Concurso.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Concurso
 ***********************************************************************/

import java.util.*;

/** @pdOid c6ab528e-b770-4ab0-952a-271409d1e7f5 */
public class Concurso implements Verificacion {
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
   private Participante[] participantes;
   /** @pdOid 1663b3b9-70d2-4000-9bc1-a88cc47a3740 */
   private Evaluador evaluador;

    public Concurso(int maxParticipantes, int minParticipantes, Fecha fechaInicioConcurso, Fecha fechaFinConcurso, String nombre , Evaluador evaluador) {
        this.maxParticipantes = maxParticipantes;
        this.minParticipantes = minParticipantes;
        this.fechaInicioConcurso = fechaInicioConcurso;
        this.fechaFinConcurso = fechaFinConcurso;
        this.nombre = nombre;
        this.participantes = new Participante[maxParticipantes];
        this.evaluador = evaluador;
    }

    @Override
    public boolean verificarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   

}