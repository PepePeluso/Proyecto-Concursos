package Clases;

import java.io.Serializable;
import javax.swing.JOptionPane;

/***********************************************************************
 * Module:  Login.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Login
 ***********************************************************************/

    public class Login implements Verificacion,Serializable {

    private String usuario;
    private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean verificarlogin(Login login) {
        if (!usuario.equals(login.getUsuario())){
            JOptionPane.showMessageDialog(null, "El usuario no coincide");
             return false;
        }
        if(!contrasena.equals(login.getContrasena())){
        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
        return false;
        }
        return true;
    }

    @Override
    public boolean verificarDatos() {
        if (contrasena.length()<8){
            JOptionPane.showMessageDialog(null, "La contraseña debe ser mayor a"
                    + " 8 carácteres");
            return false;
        } else return true;
    }
}
