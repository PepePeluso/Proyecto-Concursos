package Clases;

/***********************************************************************
 * Module:  Empresa.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Empresa
 ***********************************************************************/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/** @pdOid d75040f2-79bf-45a8-bb4f-b311cc64ab97 */
public class Empresa implements Verificacion,Serializable {
   /** @pdOid 553e848b-7408-4efe-b422-68bf9f5e7b59 */
   private ArrayList<Evaluador> evaluadores;
   /** @pdOid 6ffd60a5-6fbe-4260-b1a4-5ba300e0dd34 */
   private ArrayList<Concurso> concusos;
   /** @pdOid 22f65321-ccc4-47d5-943c-452d656b4444 */
   private String nombre;
   /** @pdOid fbfcab43-e940-4766-beb1-9f74ad2cd89f */
   private int telefono;
   /** @pdOid f1403ef4-4cd7-4b61-86c8-edca2f929eea */
   private Direccion direccion;
   /** @pdOid 36ab6815-c7c9-405d-abac-fbcb1b54378c */
   private Login login;

    public Empresa(   String nombre, int telefono, Direccion direccion, Login login) {
        this.evaluadores = new  ArrayList<Evaluador>();
        this.concusos =new ArrayList<Concurso>();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.login = login;
    }
   
   
   
   /** @pdOid 14e5bd20-2cbd-47a1-a19f-f53d69542d9a */
   public  void guardar() {
       try {
            ObjectOutputStream Guardar=new ObjectOutputStream( new FileOutputStream(""));
            Guardar.writeObject(this);
           Guardar.close();
       } catch (Exception e) {
       }
    
   }
   
   /** @pdOid 20b805ff-cc5f-41a1-9577-5957c9516306 */
   public static Empresa abrir() {
       try {
           ObjectInputStream abrir=new ObjectInputStream(new FileInputStream(""));
            Empresa empresa=(Empresa)abrir.readObject();
             return empresa;
       } catch (Exception e) {
       }
        
      return null ;
   }

    @Override
    public boolean verificarDatos() {
        if(!login.verificarDatos())
            return false;
        return true;
                    
    }

    

}