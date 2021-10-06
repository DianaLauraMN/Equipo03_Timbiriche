package gui;

import controles.ComenzarPartidaControlador;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import objNegocios.Configuracion;
import objNegocios.Jugador;

public class DLGRegistro extends javax.swing.JDialog {

    ArrayList<Jugador> jugadores;
    ComenzarPartidaControlador control = new ComenzarPartidaControlador();

    public DLGRegistro(java.awt.Frame parent, boolean modal, ArrayList<Jugador> jugadores) {
        super(parent, modal);
        initComponents();
        this.jugadores = jugadores;

        this.getRootPane().setOpaque(false);
        this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        this.panel.getRootPane().setOpaque(false);
        this.panel.setBackground(new Color(0, 0, 0, 0));

        try {
            this.panelJugador1.setBackground(jugadores.get(0).getColor());
            this.panelJugador2.setBackground(jugadores.get(1).getColor());
            this.panelJugador3.setBackground(jugadores.get(2).getColor());
            this.panelJugador4.setBackground(jugadores.get(3).getColor());
        } catch (Exception e) {
        }
        llenaCampos(jugadores);

        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelJugador2 = new javax.swing.JPanel();
        panelJugador3 = new javax.swing.JPanel();
        panelJugador4 = new javax.swing.JPanel();
        panelJugador1 = new javax.swing.JPanel();
        colorJugador1 = new javax.swing.JButton();
        colorJugador2 = new javax.swing.JButton();
        colorJugador3 = new javax.swing.JButton();
        colorJugador4 = new javax.swing.JButton();
        txtJ1Nombre = new javax.swing.JTextField();
        lblJ1Nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJ2Nombre = new javax.swing.JTextField();
        lblJ2Nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJ3Nombre = new javax.swing.JTextField();
        lblJ3Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJ4Nombre = new javax.swing.JTextField();
        lblJ4Nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelJugador2.setBackground(new java.awt.Color(255, 255, 255));
        panel.add(panelJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 110, 110));

        panelJugador3.setBackground(new java.awt.Color(255, 255, 255));
        panel.add(panelJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 110, 110));

        panelJugador4.setBackground(new java.awt.Color(255, 255, 255));
        panel.add(panelJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 110, 110));

        panelJugador1.setBackground(new java.awt.Color(255, 255, 255));
        panel.add(panelJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 110));

        colorJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador1.setBorder(null);
        colorJugador1.setBorderPainted(false);
        colorJugador1.setContentAreaFilled(false);
        colorJugador1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorJugador1.setEnabled(false);
        colorJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador1ActionPerformed(evt);
            }
        });
        panel.add(colorJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 70, 40));

        colorJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador2.setBorder(null);
        colorJugador2.setBorderPainted(false);
        colorJugador2.setContentAreaFilled(false);
        colorJugador2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorJugador2.setEnabled(false);
        colorJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador2ActionPerformed(evt);
            }
        });
        panel.add(colorJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 70, 40));

        colorJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador3.setBorder(null);
        colorJugador3.setContentAreaFilled(false);
        colorJugador3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorJugador3.setEnabled(false);
        colorJugador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador3ActionPerformed(evt);
            }
        });
        panel.add(colorJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 70, 40));

        colorJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador4.setBorder(null);
        colorJugador4.setBorderPainted(false);
        colorJugador4.setContentAreaFilled(false);
        colorJugador4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorJugador4.setEnabled(false);
        colorJugador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador4ActionPerformed(evt);
            }
        });
        panel.add(colorJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 70, 40));

        txtJ1Nombre.setEditable(false);
        txtJ1Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txtJ1Nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtJ1Nombre.setForeground(new java.awt.Color(53, 63, 75));
        txtJ1Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJ1Nombre.setBorder(null);
        txtJ1Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJ1NombreKeyReleased(evt);
            }
        });
        panel.add(txtJ1Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 130, 30));

        lblJ1Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nombre .png"))); // NOI18N
        panel.add(lblJ1Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CartaJugador.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, 320));

        txtJ2Nombre.setEditable(false);
        txtJ2Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txtJ2Nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtJ2Nombre.setForeground(new java.awt.Color(53, 63, 75));
        txtJ2Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJ2Nombre.setBorder(null);
        txtJ2Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJ2NombreKeyReleased(evt);
            }
        });
        panel.add(txtJ2Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 120, 30));

        lblJ2Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nombre .png"))); // NOI18N
        panel.add(lblJ2Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CartaJugador.png"))); // NOI18N
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 190, 320));

        txtJ3Nombre.setEditable(false);
        txtJ3Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txtJ3Nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtJ3Nombre.setForeground(new java.awt.Color(53, 63, 75));
        txtJ3Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJ3Nombre.setBorder(null);
        txtJ3Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJ3NombreKeyReleased(evt);
            }
        });
        panel.add(txtJ3Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 120, 30));

        lblJ3Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nombre .png"))); // NOI18N
        panel.add(lblJ3Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 160, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CartaJugador.png"))); // NOI18N
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 190, 320));

        txtJ4Nombre.setEditable(false);
        txtJ4Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txtJ4Nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtJ4Nombre.setForeground(new java.awt.Color(53, 63, 75));
        txtJ4Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJ4Nombre.setBorder(null);
        txtJ4Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJ4NombreKeyReleased(evt);
            }
        });
        panel.add(txtJ4Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 120, 30));

        lblJ4Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nombre .png"))); // NOI18N
        panel.add(lblJ4Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 160, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CJugadorDesactivado.png"))); // NOI18N
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 190, 320));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnMinimizar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 30, 30));

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIniciar.png"))); // NOI18N
        btnIniciar.setBorder(null);
        btnIniciar.setBorderPainted(false);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        panel.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 180, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCerrar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Titulo.png"))); // NOI18N
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 240, 70));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BGNormal.png"))); // NOI18N
        panel.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        jLabel1.setIcon(new ImageIcon("src/img/CartaJugador-acepto.png"));
        iniciar();
        jugadores.get(0).setNombre(txtJ1Nombre.getText());
        jugadores.get(0).setColor(panelJugador1.getBackground());
        
        DLGPartida dlgPartida = new DLGPartida(null, true, jugadores.get(0));
    }//GEN-LAST:event_btnIniciarActionPerformed
    public void iniciar() {
        control.comenzarPartida();
        jLabel3.setIcon(new ImageIcon("src/img/CartaJugador-acepto.png"));
        control.comenzarPartida();
        jLabel2.setIcon(new ImageIcon("src/img/CartaJugador-acepto.png"));
    }
    private void colorJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorJugador1ActionPerformed
        StringBuffer colores = new StringBuffer();
        DLGColor dlg = new DLGColor(null, true, colores);
        String coloresPos[] = colores.toString().split(",");
        int coloresInt[] = {
            Integer.parseInt(coloresPos[0]),
            Integer.parseInt(coloresPos[1]),
            Integer.parseInt(coloresPos[2])
        };
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);

        this.panelJugador1.setBackground(colorJugador);

        if (panelJugador1.getBackground().getRGB() == Color.white.getRGB()) {
            btnIniciar.setEnabled(false);
            jLabel1.setIcon(new ImageIcon("src/img/CJugadorDesactivado.png"));

        } else {
            btnIniciar.setEnabled(true);
        }


    }//GEN-LAST:event_colorJugador1ActionPerformed

    private void colorJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorJugador2ActionPerformed
        StringBuffer colores = new StringBuffer();
        DLGColor dlg = new DLGColor(null, true, colores);
        String coloresPos[] = colores.toString().split(",");
        int coloresInt[] = {
            Integer.parseInt(coloresPos[0]),
            Integer.parseInt(coloresPos[1]),
            Integer.parseInt(coloresPos[2])
        };
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);
        this.panelJugador2.setBackground(colorJugador);

        if (panelJugador2.getBackground().getRGB() == Color.white.getRGB()) {
            btnIniciar.setEnabled(false);
        } else {
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_colorJugador2ActionPerformed

    private void colorJugador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorJugador3ActionPerformed
        StringBuffer colores = new StringBuffer();
        DLGColor dlg = new DLGColor(null, true, colores);
        String coloresPos[] = colores.toString().split(",");
        int coloresInt[] = {
            Integer.parseInt(coloresPos[0]),
            Integer.parseInt(coloresPos[1]),
            Integer.parseInt(coloresPos[2])
        };
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);
        this.panelJugador3.setBackground(colorJugador);

        if (panelJugador3.getBackground().getRGB() == Color.white.getRGB()) {
            btnIniciar.setEnabled(false);
        } else {
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_colorJugador3ActionPerformed

    private void colorJugador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorJugador4ActionPerformed
        StringBuffer colores = new StringBuffer();
        DLGColor dlg = new DLGColor(null, true, colores);
        String coloresPos[] = colores.toString().split(",");
        int coloresInt[] = {
            Integer.parseInt(coloresPos[0]),
            Integer.parseInt(coloresPos[1]),
            Integer.parseInt(coloresPos[2])
        };
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);
        this.panelJugador4.setBackground(colorJugador);

        if (panelJugador4.getBackground().getRGB() == Color.white.getRGB()) {
            btnIniciar.setEnabled(false);
        } else {
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_colorJugador4ActionPerformed

    private void txtJ1NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJ1NombreKeyReleased
        String nombre = txtJ1Nombre.getText();
        nombre = nombre.trim();

        if (nombre.isEmpty()) {
            btnIniciar.setEnabled(false);
            jLabel1.setIcon(new ImageIcon("src/img/CJugadorDesactivado.png"));
        } else {
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJ1NombreKeyReleased

    private void txtJ2NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJ2NombreKeyReleased
        String nombre = txtJ2Nombre.getText();
        nombre = nombre.trim();

        if (nombre.isEmpty()) {
            btnIniciar.setEnabled(false);
        } else {
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJ2NombreKeyReleased

    private void txtJ3NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJ3NombreKeyReleased
        String nombre = txtJ3Nombre.getText();
        nombre = nombre.trim();

        if (nombre.isEmpty()) {
            btnIniciar.setEnabled(false);
        } else {
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJ3NombreKeyReleased

    private void txtJ4NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJ4NombreKeyReleased
        String nombre = txtJ4Nombre.getText();
        nombre = nombre.trim();

        if (nombre.isEmpty()) {
            btnIniciar.setEnabled(false);
        } else {
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJ4NombreKeyReleased

    public void llenaCampos(ArrayList<Jugador> jugadores) {
        try {
            if (jugadores.get(0) != null) {
                if (!jugadores.get(0).getNombre().isEmpty()) {
                    txtJ1Nombre.setText(jugadores.get(0).getNombre());
                    txtJ1Nombre.setEditable(true);
                    colorJugador1.setEnabled(true);
                    if (jugadores.get(0).getColor() != Color.white) {
                        btnIniciar.setEnabled(true);
                    }
                }
            }
            if (jugadores.get(1) != null) {
                if (!jugadores.get(1).getNombre().isEmpty()) {
                    txtJ2Nombre.setText(jugadores.get(1).getNombre());
                    txtJ2Nombre.setEditable(true);
                    colorJugador2.setEnabled(true);
                    if (jugadores.get(1).getColor() != Color.white) {
                        btnIniciar.setEnabled(true);
                    }
                }
            }
            if (jugadores.get(2) != null) {
                if (!jugadores.get(2).getNombre().isEmpty()) {
                    txtJ3Nombre.setText(jugadores.get(2).getNombre());
                    txtJ3Nombre.setEditable(true);
                    colorJugador3.setEnabled(true);
                    if (jugadores.get(2).getColor() != Color.white) {
                        btnIniciar.setEnabled(true);
                    }
                }
            }
            if (jugadores.get(3) != null) {
                if (!jugadores.get(3).getNombre().isEmpty()) {
                    txtJ4Nombre.setText(jugadores.get(3).getNombre());
                    txtJ4Nombre.setEditable(true);
                    colorJugador4.setEnabled(true);
                    if (jugadores.get(3).getColor() != Color.white) {
                        btnIniciar.setEnabled(true);
                    }
                }
            }
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton colorJugador1;
    private javax.swing.JButton colorJugador2;
    private javax.swing.JButton colorJugador3;
    private javax.swing.JButton colorJugador4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblJ1Nombre;
    private javax.swing.JLabel lblJ2Nombre;
    private javax.swing.JLabel lblJ3Nombre;
    private javax.swing.JLabel lblJ4Nombre;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelJugador1;
    private javax.swing.JPanel panelJugador2;
    private javax.swing.JPanel panelJugador3;
    private javax.swing.JPanel panelJugador4;
    private javax.swing.JTextField txtJ1Nombre;
    private javax.swing.JTextField txtJ2Nombre;
    private javax.swing.JTextField txtJ3Nombre;
    private javax.swing.JTextField txtJ4Nombre;
    // End of variables declaration//GEN-END:variables
}
