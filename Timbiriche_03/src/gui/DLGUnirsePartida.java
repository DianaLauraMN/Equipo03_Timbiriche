package gui;

import controles.UnirsePartidaControlador;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import objNegocios.Configuracion;
import objNegocios.Jugador;

public class DLGUnirsePartida extends javax.swing.JDialog {
    
    Color colorJugador;
    UnirsePartidaControlador control = new UnirsePartidaControlador();
    
    public DLGUnirsePartida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.panel.getRootPane().setOpaque(false);
        this.panel.setBackground(new Color(0, 0, 0, 0));
        btnColorea.setEnabled(false);
        BtnUnirse.setEnabled(false);
        Color c = new Color(255, 255, 255);
        this.pnl.setBackground(c);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        pnl = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        BtnUnirse = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnColorea = new javax.swing.JButton();
        txtNombreJugador = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel.add(pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 244, 101, 101));
        pnl.getAccessibleContext().setAccessibleName("");

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnMinimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 30, 30));

        BtnUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btbUnirse.png"))); // NOI18N
        BtnUnirse.setBorder(null);
        BtnUnirse.setBorderPainted(false);
        BtnUnirse.setContentAreaFilled(false);
        BtnUnirse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnirseActionPerformed(evt);
            }
        });
        panel.add(BtnUnirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 180, 60));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panel.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 30, 30));

        btnColorea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        btnColorea.setBorder(null);
        btnColorea.setBorderPainted(false);
        btnColorea.setContentAreaFilled(false);
        btnColorea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnColorea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColoreaActionPerformed(evt);
            }
        });
        panel.add(btnColorea, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 60, 50));

        txtNombreJugador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNombreJugador.setForeground(new java.awt.Color(53, 63, 75));
        txtNombreJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreJugador.setBorder(null);
        txtNombreJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreJugadorKeyReleased(evt);
            }
        });
        panel.add(txtNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 387, 140, 30));

        FONDO.setForeground(new java.awt.Color(53, 63, 75));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Unirse.png"))); // NOI18N
        panel.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void BtnUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnirseActionPerformed
        
        Jugador jugador = new Jugador(txtNombreJugador.getText(), colorJugador, 0);
        Configuracion configuracion = new Configuracion(colorJugador, jugador);
        List<Configuracion> configuraciones = new ArrayList<>();
        configuraciones.add(configuracion);
        jugador.setConfiguraciones(configuraciones);
        
        
        
        control.unirsePartida(jugador);
    }//GEN-LAST:event_BtnUnirseActionPerformed

    private void btnColoreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColoreaActionPerformed
        
        StringBuffer colores = new StringBuffer();
        DLGColor dlg = new DLGColor(null, true, colores);
        
        String coloresPos[] = colores.toString().split(",");
        int coloresInt[] = {
            Integer.parseInt(coloresPos[0]),
            Integer.parseInt(coloresPos[1]),
            Integer.parseInt(coloresPos[2])
        };
        
        Graphics2D g = (Graphics2D) this.pnl.getGraphics();
        colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);        
        this.pnl.setBackground(colorJugador);
        
        if (coloresInt[0] == 255 && coloresInt[1] == 255 && coloresInt[2] == 255) {
            BtnUnirse.setEnabled(false);
        } else {
            BtnUnirse.setEnabled(true);
        }
        
        camposCompletos();
    }//GEN-LAST:event_btnColoreaActionPerformed

    private void txtNombreJugadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreJugadorKeyReleased
        String nombre = txtNombreJugador.getText();
        nombre = nombre.trim();
        
        if (nombre.isEmpty()) {
            btnColorea.setEnabled(false);
        } else {
            btnColorea.setEnabled(true);
        }
        
        camposCompletos();
    }//GEN-LAST:event_txtNombreJugadorKeyReleased
    
    public boolean camposCompletos() {
        Color color = new Color(255, 255, 255);
        
        if (colorJugador != null) {
            if (color.getRGB() == colorJugador.getRGB() || this.txtNombreJugador.getText().trim().isEmpty()) {
                this.BtnUnirse.setEnabled(false);
                return false;
            }
            this.BtnUnirse.setEnabled(true);
            return true;
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUnirse;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnColorea;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtNombreJugador;
    // End of variables declaration//GEN-END:variables
}
