package Clases;

/***********************************************************************
 * Module:  Login.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Login
 ***********************************************************************/

    private String usuario;
    private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean verificarlogin(Login login) {
        if (usuario.equals(contrasena)){
            JOptionPane.showMessageDialog(null, "No se pueden repetir el mismo"
                    + "usuario y contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
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
