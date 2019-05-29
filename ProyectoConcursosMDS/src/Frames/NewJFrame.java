/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe Peluso
 */
public class NewJFrame extends javax.swing.JFrame {

    Empresa empresa;
    Login login;
    Evaluador evaluador;
    boolean conventana;
    DefaultTableModel modelo1;
    DefaultTableModel modelo2;
    DefaultTableModel modelo3;
    DefaultTableModel modelo4;
    DefaultTableModel modelo5;
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
         try {
           ObjectInputStream abrir=new ObjectInputStream(new FileInputStream("archivo.conc"));
           empresa= (Empresa)abrir.readObject();
           abrir.close();
           login=empresa.getLogin();
       } catch (Exception e) {
       }
         if(empresa!=null){
         jComboParaEvaluar.removeAllItems();
                for (int i = 0; i < empresa.getConcusos().size(); i++) {
                   jComboParaEvaluar.addItem(empresa.getConcusos().get(i).getNombre()); 
                }
         }
        TablaEvaluadores();
         String Cabecera2[]={"Nombre","Cedula","Fecha de Nacimiento","Años de Experiencia","Profesion"};    
        modelo2=new DefaultTableModel(null,Cabecera2);
        TablaParticpantes.setModel(modelo2);
        TablaConcursos();
         String Cabecera4[]={"Nombre","Cedula","Fecha de Nacimiento","Años de Experiencia","Profesion"};    
        modelo4=new DefaultTableModel(null,Cabecera4);
        TablaParticipantesEvaluados.setModel(modelo4);
        TablaConcursoEliminamos();
        btnRegistrarConcurso.setEnabled(false);
        btnRegistroParticipante.setEnabled(false);
    }
    public  void TablaEvaluadores(){
    String Cabecera1[]={"Nombre","Cedula","Fecha de Nacimiento"};    
        modelo1=new DefaultTableModel(null,Cabecera1);
        TablaEvaluadores.setModel(modelo1);
        if(empresa!=null){
        for (int i = 0; i < empresa.getEvaluadores().size(); i++) {
            modelo1.addRow(new Object[]{
           empresa.getEvaluadores().get(i).getNombre(),
           empresa.getEvaluadores().get(i).getCedula(),
            empresa.getEvaluadores().get(i).getFechaNacimiento().imprimir()
            
            });
        }
        }
    }
          public  void TablaConcursos(){
    String Cabecera3[]={"Nombre","Máximo de Participantes","Fecha de inicio","Fecha de fin","Nombre del evaluador"};    
        modelo3=new DefaultTableModel(null,Cabecera3);
        TablaConcursos.setModel(modelo3);
        if(empresa!=null){
        for (int i = 0; i < empresa.getConcusos().size(); i++) {
            modelo3.addRow(new Object[]{
                empresa.getConcusos().get(i).getNombre(),
                empresa.getConcusos().get(i).getMaxParticipantes(),
                empresa.getConcusos().get(i).getFechaInicioConcurso().imprimir(),
                empresa.getConcusos().get(i).getFechaFinConcurso().imprimir(),
                empresa.getConcusos().get(i).getEvaluador().getNombre()
           
            });
        }
        }
    }
          public  void TablaConcursoEliminamos(){
    String Cabecera3[]={"Nombre","Máximo de Participantes","Fecha de inicio","Fecha de fin","Nombre del evaluador"};    
        modelo5=new DefaultTableModel(null,Cabecera3);
        TablaConcursosElinimos.setModel(modelo5);
        if(empresa!=null){
        for (int i = 0; i < empresa.getConcusos().size(); i++) {
            modelo5.addRow(new Object[]{
                empresa.getConcusos().get(i).getNombre(),
                empresa.getConcusos().get(i).getMaxParticipantes(),
                empresa.getConcusos().get(i).getFechaInicioConcurso().imprimir(),
                empresa.getConcusos().get(i).getFechaFinConcurso().imprimir(),
                empresa.getConcusos().get(i).getEvaluador().getNombre()
           
            });
        }
        }
    }
          
    
     public  void TablaParticipantes(int numConcurso){
    String Cabecera2[]={"Nombre","Cedula","Fecha de Nacimiento","Años de Experiencia","Profesion"};    
        modelo2=new DefaultTableModel(null,Cabecera2);
        TablaParticpantes.setModel(modelo2);
        if(empresa!=null){
        for (int i = 0; i < empresa.getConcusos().get(numConcurso).getParticipantes().size(); i++) {
            modelo2.addRow(new Object[]{
           empresa.getConcusos().get(numConcurso).getParticipantes().get(i).getNombre(),
           empresa.getConcusos().get(numConcurso).getParticipantes().get(i).getCedula(),
            empresa.getConcusos().get(numConcurso).getParticipantes().get(i).getFechaNacimiento().imprimir(),
            empresa.getConcusos().get(numConcurso).getParticipantes().get(i).getAnosEXperiencia(),
            empresa.getConcusos().get(numConcurso).getParticipantes().get(i).getProfesion()
            });
        }
        }
    }
      public  void TablaEvaluados(int n){
       String Cabecera4[]={"Nombre","Cedula","Fecha de Nacimiento","Años de Experiencia","Profesion"};    
           modelo4=new DefaultTableModel(null,Cabecera4);
           TablaParticipantesEvaluados.setModel(modelo4);   
         for (int i = 0; i < empresa.getConcusos().get(n).getSeleccionados().size(); i++) {
              modelo4.addRow(new Object[]{
            empresa.getConcusos().get(n).getSeleccionados().get(i).getNombre(),
            empresa.getConcusos().get(n).getSeleccionados().get(i).getCedula(),
            empresa.getConcusos().get(n).getSeleccionados().get(i).getFechaNacimiento().imprimir(),
            empresa.getConcusos().get(n).getSeleccionados().get(i).getAnosEXperiencia(),
            empresa.getConcusos().get(n).getSeleccionados().get(i).getProfesion()
            });
        }
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistroEmpresa = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCallePrincipal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCalleSecundaria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        RegistroConcurso = new javax.swing.JFrame();
        btnRegistrarConcurso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreConcurso = new javax.swing.JTextField();
        txtminimoParticipantes = new javax.swing.JTextField();
        txtMaximoParticipantes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEvaluadores = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        dchInicio = new com.toedter.calendar.JDateChooser();
        dchFin = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaConcursosElinimos = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        ckbTerminosConcurso = new javax.swing.JCheckBox();
        EvaluarParticipante = new javax.swing.JFrame();
        jButton11 = new javax.swing.JButton();
        jComboParaEvaluar = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaParticpantes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaParticipantesEvaluados = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        lblevluador = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        RegistroPostulante = new javax.swing.JFrame();
        btnRegistroParticipante = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombreParticipante = new javax.swing.JTextField();
        txtCedulaParticipante = new javax.swing.JTextField();
        txtAñosExperiencia1 = new javax.swing.JTextField();
        jComboProfecion = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaConcursos = new javax.swing.JTable();
        dchNaciminetoParticipante = new com.toedter.calendar.JDateChooser();
        chkTerminosParticipante = new javax.swing.JCheckBox();
        RegistrarEvaluador = new javax.swing.JFrame();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        txtNombreEvaluador = new javax.swing.JTextField();
        txtCedulaEvaluador = new javax.swing.JTextField();
        dchNaciminetoEvaluador = new com.toedter.calendar.JDateChooser();
        LoginIngreso = new javax.swing.JFrame();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        txtContraseñaLogin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("Nombre de  Empresa:");

        txtNombreEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpresaKeyTyped(evt);
            }
        });

        jLabel2.setText("Calle principal: ");

        txtCallePrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCallePrincipalKeyTyped(evt);
            }
        });

        jLabel3.setText("Calle Secundaria: ");

        txtCalleSecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleSecundariaKeyTyped(evt);
            }
        });

        jLabel4.setText("Telefono:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel5.setText("Usuario:");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        jLabel6.setText("Contraseña");

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroEmpresaLayout = new javax.swing.GroupLayout(RegistroEmpresa.getContentPane());
        RegistroEmpresa.getContentPane().setLayout(RegistroEmpresaLayout);
        RegistroEmpresaLayout.setHorizontalGroup(
            RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroEmpresaLayout.createSequentialGroup()
                        .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtCallePrincipal)
                            .addComponent(txtCalleSecundaria)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroEmpresaLayout.createSequentialGroup()
                        .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
            .addGroup(RegistroEmpresaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton5)
                .addGap(142, 142, 142))
        );
        RegistroEmpresaLayout.setVerticalGroup(
            RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroEmpresaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCallePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCalleSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnRegistrarConcurso.setText("Registrar");
        btnRegistrarConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConcursoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre: ");

        jLabel8.setText("Fecha de inicio:");

        jLabel9.setText("Fecha Fin:");

        jLabel10.setText("Minimo de participantes:");

        jLabel11.setText("Maximo de participantes:");

        txtNombreConcurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreConcursoKeyTyped(evt);
            }
        });

        txtminimoParticipantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtminimoParticipantesKeyTyped(evt);
            }
        });

        txtMaximoParticipantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaximoParticipantesKeyTyped(evt);
            }
        });

        TablaEvaluadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaEvaluadores);

        jButton7.setText("Registrar Evaluador");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Escojer Evaluador");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        TablaConcursosElinimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(TablaConcursosElinimos);

        jButton15.setText("Emininar Concurso");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        ckbTerminosConcurso.setText("Acepto los términos y condiciones");
        ckbTerminosConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTerminosConcursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroConcursoLayout = new javax.swing.GroupLayout(RegistroConcurso.getContentPane());
        RegistroConcurso.getContentPane().setLayout(RegistroConcursoLayout);
        RegistroConcursoLayout.setHorizontalGroup(
            RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroConcursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroConcursoLayout.createSequentialGroup()
                        .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                            .addGroup(RegistroConcursoLayout.createSequentialGroup()
                                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreConcurso)
                                    .addComponent(txtminimoParticipantes)
                                    .addComponent(txtMaximoParticipantes)
                                    .addComponent(dchInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dchFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroConcursoLayout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)))
                        .addContainerGap())
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(RegistroConcursoLayout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addGap(406, 416, Short.MAX_VALUE))
                    .addGroup(RegistroConcursoLayout.createSequentialGroup()
                        .addComponent(btnRegistrarConcurso)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ckbTerminosConcurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        RegistroConcursoLayout.setVerticalGroup(
            RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroConcursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtminimoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMaximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(dchInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(dchFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(ckbTerminosConcurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarConcurso)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap())
        );

        jButton11.setText("Evaluar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel21.setText("Concursos");

        TablaParticpantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaParticpantes);

        TablaParticipantesEvaluados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaParticipantesEvaluados);

        jButton12.setText("Eliminar Postulante");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel22.setText("Evaluado deacurdo a su edad y años de experiencia");

        jButton14.setText("Ver participantes");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        lblevluador.setText("Evaluador: ");

        jButton16.setText("Ver evaluados");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EvaluarParticipanteLayout = new javax.swing.GroupLayout(EvaluarParticipante.getContentPane());
        EvaluarParticipante.getContentPane().setLayout(EvaluarParticipanteLayout);
        EvaluarParticipanteLayout.setHorizontalGroup(
            EvaluarParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EvaluarParticipanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EvaluarParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EvaluarParticipanteLayout.createSequentialGroup()
                        .addGroup(EvaluarParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvaluarParticipanteLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(jComboParaEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11))
                            .addGroup(EvaluarParticipanteLayout.createSequentialGroup()
                                .addGroup(EvaluarParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12)
                                    .addGroup(EvaluarParticipanteLayout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton16)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(EvaluarParticipanteLayout.createSequentialGroup()
                        .addComponent(lblevluador, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        EvaluarParticipanteLayout.setVerticalGroup(
            EvaluarParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EvaluarParticipanteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(EvaluarParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jComboParaEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(EvaluarParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jButton16))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblevluador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnRegistroParticipante.setText("Registrar");
        btnRegistroParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroParticipanteActionPerformed(evt);
            }
        });

        jLabel12.setText("Nombre:");

        jLabel13.setText("Cedula:");

        jLabel14.setText("Fecha Nacimiento:");

        jLabel15.setText("Años de Experiencia:");

        jLabel16.setText("Profeccion:");

        txtNombreParticipante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreParticipanteKeyTyped(evt);
            }
        });

        txtCedulaParticipante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaParticipanteKeyTyped(evt);
            }
        });

        txtAñosExperiencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñosExperiencia1ActionPerformed(evt);
            }
        });
        txtAñosExperiencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñosExperiencia1KeyTyped(evt);
            }
        });

        jComboProfecion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software", "Mecatronica", "Arquitecto", "Publicidad" }));

        TablaConcursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TablaConcursos);

        chkTerminosParticipante.setText("Acepto los términos y condiciones.");
        chkTerminosParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTerminosParticipanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroPostulanteLayout = new javax.swing.GroupLayout(RegistroPostulante.getContentPane());
        RegistroPostulante.getContentPane().setLayout(RegistroPostulanteLayout);
        RegistroPostulanteLayout.setHorizontalGroup(
            RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPostulanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroPostulanteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistroParticipante)
                        .addGap(0, 335, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(RegistroPostulanteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTerminosParticipante)
                    .addGroup(RegistroPostulanteLayout.createSequentialGroup()
                        .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAñosExperiencia1)
                            .addComponent(jComboProfecion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dchNaciminetoParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addGroup(RegistroPostulanteLayout.createSequentialGroup()
                        .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(txtCedulaParticipante))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistroPostulanteLayout.setVerticalGroup(
            RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPostulanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreParticipante))
                .addGap(21, 21, 21)
                .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCedulaParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(dchNaciminetoParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtAñosExperiencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboProfecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(chkTerminosParticipante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroParticipante)
                .addContainerGap())
        );

        jLabel18.setText("Nombre:");

        jLabel19.setText("Cedula:");

        jLabel20.setText("Fecha de Nacimiento:");

        jButton10.setText("Registrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        txtNombreEvaluador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEvaluadorKeyTyped(evt);
            }
        });

        txtCedulaEvaluador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEvaluadorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout RegistrarEvaluadorLayout = new javax.swing.GroupLayout(RegistrarEvaluador.getContentPane());
        RegistrarEvaluador.getContentPane().setLayout(RegistrarEvaluadorLayout);
        RegistrarEvaluadorLayout.setHorizontalGroup(
            RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarEvaluadorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addGroup(RegistrarEvaluadorLayout.createSequentialGroup()
                        .addGroup(RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreEvaluador)
                            .addComponent(txtCedulaEvaluador)
                            .addComponent(dchNaciminetoEvaluador, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        RegistrarEvaluadorLayout.setVerticalGroup(
            RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarEvaluadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNombreEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtCedulaEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistrarEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(dchNaciminetoEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton10)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel23.setText("Usuario:");

        jLabel25.setText("Contraseña:");

        jButton13.setText("Ingresar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginIngresoLayout = new javax.swing.GroupLayout(LoginIngreso.getContentPane());
        LoginIngreso.getContentPane().setLayout(LoginIngresoLayout);
        LoginIngresoLayout.setHorizontalGroup(
            LoginIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginIngresoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(LoginIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addGroup(LoginIngresoLayout.createSequentialGroup()
                        .addGroup(LoginIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(LoginIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginIngresoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                            .addGroup(LoginIngresoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtContraseñaLogin)))))
                .addContainerGap())
        );
        LoginIngresoLayout.setVerticalGroup(
            LoginIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginIngresoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(LoginIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(LoginIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtContraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("Registrar Concurso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar Empresa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar Participante");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Evaluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAñosExperiencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñosExperiencia1ActionPerformed
        
    }//GEN-LAST:event_txtAñosExperiencia1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(login!=null){
        LoginIngreso.setVisible(true);
        LoginIngreso.setSize(300,200);
        LoginIngreso.setLocationRelativeTo(this);
        conventana=true;   
}else{
JOptionPane.showMessageDialog(null, "No existe ninguna Empresa Registrada");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(empresa==null){
RegistroEmpresa.setVisible(true);
RegistroEmpresa.setSize(400,400);
RegistroEmpresa.setLocationRelativeTo(this);
}else{
JOptionPane.showMessageDialog(null, "Ya existe una empresa registrarda");
}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     RegistroPostulante.setVisible(true);
         RegistroPostulante.setSize(450,470);
         RegistroPostulante.setLocationRelativeTo(this);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(login!=null){
        LoginIngreso.setVisible(true);
        LoginIngreso.setSize(300,200);
        LoginIngreso.setLocationRelativeTo(this);
        conventana=false;   
}else{
JOptionPane.showMessageDialog(null, "No existe ninguna Empresa Registrada");
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            login=new Login(txtUsuario.getText(),txtContrasena.getText());
            empresa=new Empresa(txtNombreEmpresa.getText(),Integer.parseInt(txtTelefono.getText()), new Direccion(txtCalleSecundaria.getText(), txtCallePrincipal.getText()), login);
            if(!empresa.verificarDatos()){
            empresa=null;
            login=null;
            }else{
            JOptionPane.showMessageDialog(null, "Registro Correcto");
            RegistroEmpresa.setVisible(false);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Espacios vacios");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            if(login.verificarlogin(new Login(txtUsuarioLogin.getText(), txtContraseñaLogin.getText()))){
            if(conventana){
            RegistroConcurso.setVisible(true);
            RegistroConcurso.setSize(600,600);
            RegistroConcurso.setLocationRelativeTo(this);
            txtUsuarioLogin.setText("");
            txtContraseñaLogin.setText("");
            LoginIngreso.setVisible(false);
            }else{
             EvaluarParticipante.setVisible(true);
             EvaluarParticipante.setSize(450,450);
             EvaluarParticipante.setLocationRelativeTo(this);
             txtUsuarioLogin.setText("");
             txtContraseñaLogin.setText("");
             LoginIngreso.setVisible(false);
            }
            }
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Casillas vacias");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      RegistrarEvaluador.setVisible(true);
      RegistrarEvaluador.setSize(400,300);
      RegistrarEvaluador.setLocationRelativeTo(null);      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            evaluador=empresa.getEvaluadores().get(TablaEvaluadores.getSelectedRow()); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione un Evaluador  de la tabla");
        }
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnRegistrarConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConcursoActionPerformed
        try {
            if(evaluador!=null){
            Concurso concurso=new Concurso(Integer.parseInt(txtMaximoParticipantes.getText()), Integer.parseInt(txtminimoParticipantes.getText()), new Fecha(dchInicio.getCalendar().get(Calendar.DAY_OF_MONTH), dchInicio.getCalendar().get(Calendar.MONTH)+1, dchInicio.getCalendar().get(Calendar.YEAR)), new Fecha(dchFin.getCalendar().get(Calendar.DAY_OF_MONTH), dchFin.getCalendar().get(Calendar.MONTH)+1, dchFin.getCalendar().get(Calendar.YEAR)),txtNombreConcurso.getText(), evaluador);
            if(concurso.verificarDatos()){
            empresa.AgregarConcurso(concurso);
            TablaConcursos();
            TablaConcursoEliminamos();
            jComboParaEvaluar.removeAllItems();
                for (int i = 0; i < empresa.getConcusos().size(); i++) {
                   jComboParaEvaluar.addItem(empresa.getConcusos().get(i).getNombre()); 
                }
            
             }
            }else{
            JOptionPane.showMessageDialog(null, "Escoja un Evaluador");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos Vacios");
        }
    }//GEN-LAST:event_btnRegistrarConcursoActionPerformed

    private void btnRegistroParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroParticipanteActionPerformed
       try {
         Participante participante=new Participante(jComboProfecion.getSelectedItem().toString(), Integer.parseInt(txtAñosExperiencia1.getText()),txtNombreParticipante.getText(), txtCedulaParticipante.getText(),new Fecha(dchNaciminetoParticipante.getCalendar().get(Calendar.DAY_OF_MONTH), dchNaciminetoParticipante.getCalendar().get(Calendar.MONTH)+1, dchNaciminetoParticipante.getCalendar().get(Calendar.YEAR)));
         if(participante.verificarDatos()){
         empresa.getConcusos().get(TablaConcursos.getSelectedRow()).AgregarParticipante(participante);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos vacios");
        }
    }//GEN-LAST:event_btnRegistroParticipanteActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
         Evaluador evaluador1=new Evaluador(txtNombreEvaluador.getText(), txtCedulaEvaluador.getText(), new Fecha(dchNaciminetoEvaluador.getCalendar().get(Calendar.DAY_OF_MONTH), dchNaciminetoEvaluador.getCalendar().get(Calendar.MONTH)+1, dchNaciminetoEvaluador.getCalendar().get(Calendar.YEAR)));
         if(evaluador1.verificarDatos()){
         empresa.AgregarEvaluador(evaluador1);
         TablaEvaluadores();
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos vacios");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            TablaParticipantes(jComboParaEvaluar.getSelectedIndex());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
           
            Concurso concurso=empresa.getConcusos().get(jComboParaEvaluar.getSelectedIndex());
            if(concurso.getSeleccionados()==null){
           concurso.setSeleccionados(concurso.getEvaluador().Aprobados(concurso.getParticipantes()));
            TablaEvaluados(jComboParaEvaluar.getSelectedIndex());
            lblevluador.setText("Evaluador: "+concurso.getEvaluador().getNombre());
            }else{
            JOptionPane.showMessageDialog(null, "Este concurso ya fue evaluado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha escoguido ningun concurso para evaluar");
        }
        
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      try {
            empresa.getConcusos().get(jComboParaEvaluar.getSelectedIndex()).getSeleccionados().remove(TablaParticipantesEvaluados.getSelectedRow());
            TablaEvaluados(jComboParaEvaluar.getSelectedIndex());         
                    
             
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun Participante Evaluado para Eliminar");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            empresa.getConcusos().remove(TablaConcursosElinimos.getSelectedRow());
            TablaConcursos();
            TablaConcursoEliminamos();
            jComboParaEvaluar.removeAllItems();
                for (int i = 0; i < empresa.getConcusos().size(); i++) {
                   jComboParaEvaluar.addItem(empresa.getConcusos().get(i).getNombre()); 
                } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun concurso para Eliminar");
        }
       
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
             Concurso concurso=empresa.getConcusos().get(jComboParaEvaluar.getSelectedIndex());
    if(concurso.getSeleccionados()!=null){
        TablaEvaluados(jComboParaEvaluar.getSelectedIndex());
    }else{
    JOptionPane.showMessageDialog(null, "No se ha evaluado a este concurso");
    }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No ha seleccionado ningun concurso");
        }
       
    }//GEN-LAST:event_jButton16ActionPerformed

    private void txtNombreEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpresaKeyTyped
       char validar=evt.getKeyChar();
        if(!Character.isLetter(validar))evt.consume();
        
    }//GEN-LAST:event_txtNombreEmpresaKeyTyped

    private void txtCallePrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCallePrincipalKeyTyped
       char validar=evt.getKeyChar();
        if(!Character.isLetter(validar)&&!Character.isSpaceChar(validar))evt.consume();
    }//GEN-LAST:event_txtCallePrincipalKeyTyped

    private void txtCalleSecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleSecundariaKeyTyped
         char validar=evt.getKeyChar();
        if(!Character.isLetter(validar)&&!Character.isSpaceChar(validar))evt.consume();
    }//GEN-LAST:event_txtCalleSecundariaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
         char validar=evt.getKeyChar();
        
        int v=txtTelefono.getText().length();
        
        if (validar<'0' || validar>'9' || v<0 || v>9) evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreConcursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreConcursoKeyTyped
        char validar=evt.getKeyChar();
        if(!Character.isLetter(validar)&&!Character.isSpaceChar(validar))evt.consume();
    }//GEN-LAST:event_txtNombreConcursoKeyTyped

    private void txtminimoParticipantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtminimoParticipantesKeyTyped
       char validar=evt.getKeyChar();
        
        int v=txtminimoParticipantes.getText().length();
        
        if (validar<'0' || validar>'9' || v<0 || v>1) evt.consume();
    }//GEN-LAST:event_txtminimoParticipantesKeyTyped

    private void txtMaximoParticipantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaximoParticipantesKeyTyped
      char validar=evt.getKeyChar();
        
        int v=txtMaximoParticipantes.getText().length();
        
        if (validar<'0' || validar>'9' || v<0 || v>1) evt.consume();
    }//GEN-LAST:event_txtMaximoParticipantesKeyTyped

    private void txtNombreParticipanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreParticipanteKeyTyped
       char validar=evt.getKeyChar();
        if(!Character.isLetter(validar))evt.consume();
    }//GEN-LAST:event_txtNombreParticipanteKeyTyped

    private void txtCedulaParticipanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaParticipanteKeyTyped
        char validar=evt.getKeyChar();
        
        int v=txtCedulaParticipante.getText().length();
        
        if (validar<'0' || validar>'9' || v<0 || v>9) evt.consume();
    }//GEN-LAST:event_txtCedulaParticipanteKeyTyped

    private void txtAñosExperiencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñosExperiencia1KeyTyped
        char validar=evt.getKeyChar();
        
        int v=txtAñosExperiencia1.getText().length();
        
        if (validar<'0' || validar>'9' || v<0 || v>2) evt.consume();
    }//GEN-LAST:event_txtAñosExperiencia1KeyTyped

    private void txtNombreEvaluadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEvaluadorKeyTyped
      char validar=evt.getKeyChar();
        if(!Character.isLetter(validar))evt.consume();
    }//GEN-LAST:event_txtNombreEvaluadorKeyTyped

    private void txtCedulaEvaluadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEvaluadorKeyTyped
       char validar=evt.getKeyChar();
        
        int v=txtCedulaEvaluador.getText().length();
        
        if (validar<'0' || validar>'9' || v<0 || v>9) evt.consume(); 
    }//GEN-LAST:event_txtCedulaEvaluadorKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ObjectOutputStream Guardar = new ObjectOutputStream(new FileOutputStream("archivo.conc"));
            Guardar.writeObject(empresa);
            Guardar.close();
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_formWindowClosing

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char validar=evt.getKeyChar();
        if((!Character.isLetter(validar))&&!Character.isDigit(validar))evt.consume();
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void ckbTerminosConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTerminosConcursoActionPerformed
        // TODO add your handling code here:
        if (!ckbTerminosConcurso.isSelected()){
            btnRegistrarConcurso.setEnabled(false);
        } else {
            btnRegistrarConcurso.setEnabled(true);
        }
    }//GEN-LAST:event_ckbTerminosConcursoActionPerformed

    private void chkTerminosParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTerminosParticipanteActionPerformed
        // TODO add your handling code here:
        if (!chkTerminosParticipante.isSelected()){
            btnRegistroParticipante.setEnabled(false);
        } else {
            btnRegistroParticipante.setEnabled(true);
        }
    }//GEN-LAST:event_chkTerminosParticipanteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame EvaluarParticipante;
    private javax.swing.JFrame LoginIngreso;
    private javax.swing.JFrame RegistrarEvaluador;
    private javax.swing.JFrame RegistroConcurso;
    private javax.swing.JFrame RegistroEmpresa;
    private javax.swing.JFrame RegistroPostulante;
    private javax.swing.JTable TablaConcursos;
    private javax.swing.JTable TablaConcursosElinimos;
    private javax.swing.JTable TablaEvaluadores;
    private javax.swing.JTable TablaParticipantesEvaluados;
    private javax.swing.JTable TablaParticpantes;
    private javax.swing.JButton btnRegistrarConcurso;
    private javax.swing.JButton btnRegistroParticipante;
    private javax.swing.JCheckBox chkTerminosParticipante;
    private javax.swing.JCheckBox ckbTerminosConcurso;
    private com.toedter.calendar.JDateChooser dchFin;
    private com.toedter.calendar.JDateChooser dchInicio;
    private com.toedter.calendar.JDateChooser dchNaciminetoEvaluador;
    private com.toedter.calendar.JDateChooser dchNaciminetoParticipante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboParaEvaluar;
    private javax.swing.JComboBox<String> jComboProfecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblevluador;
    private javax.swing.JTextField txtAñosExperiencia1;
    private javax.swing.JTextField txtCallePrincipal;
    private javax.swing.JTextField txtCalleSecundaria;
    private javax.swing.JTextField txtCedulaEvaluador;
    private javax.swing.JTextField txtCedulaParticipante;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPasswordField txtContraseñaLogin;
    private javax.swing.JTextField txtMaximoParticipantes;
    private javax.swing.JTextField txtNombreConcurso;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreEvaluador;
    private javax.swing.JTextField txtNombreParticipante;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JTextField txtminimoParticipantes;
    // End of variables declaration//GEN-END:variables
}
