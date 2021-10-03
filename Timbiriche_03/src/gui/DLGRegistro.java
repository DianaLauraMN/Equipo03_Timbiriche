
package gui;

import java.awt.Color;
import java.awt.Graphics2D;

public class DLGRegistro extends javax.swing.JDialog {

    /**
     * Creates new form Registro
     */
    public DLGRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.getRootPane().setOpaque(false);
        this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        
        this.panel.getRootPane().setOpaque(false);
        this.panel.setBackground(new Color(0, 0, 0, 0));
        
        Color c = new Color(0, 0, 0, 0);
        this.panelJugador1.setBackground(c);
        this.panelJugador2.setBackground(c);
        this.panelJugador3.setBackground(c);
        this.panelJugador4.setBackground(c);
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel.add(panelJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 226, 110, 110));
        panel.add(panelJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 226, 110, 110));
        panel.add(panelJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 226, 110, 110));
        panel.add(panelJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 226, 110, 110));

        colorJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador1.setBorder(null);
        colorJugador1.setBorderPainted(false);
        colorJugador1.setContentAreaFilled(false);
        colorJugador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colorJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador1ActionPerformed(evt);
            }
        });
        panel.add(colorJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 70, 40));

        colorJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador2.setBorder(null);
        colorJugador2.setBorderPainted(false);
        colorJugador2.setContentAreaFilled(false);
        colorJugador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colorJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador2ActionPerformed(evt);
            }
        });
        panel.add(colorJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 70, 40));

        colorJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador3.setBorder(null);
        colorJugador3.setBorderPainted(false);
        colorJugador3.setContentAreaFilled(false);
        colorJugador3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colorJugador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador3ActionPerformed(evt);
            }
        });
        panel.add(colorJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 70, 40));

        colorJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor_1.png"))); // NOI18N
        colorJugador4.setBorder(null);
        colorJugador4.setBorderPainted(false);
        colorJugador4.setContentAreaFilled(false);
        colorJugador4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colorJugador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJugador4ActionPerformed(evt);
            }
        });
        panel.add(colorJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CartaJugador.png"))); // NOI18N
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CartaJugador.png"))); // NOI18N
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 190, 320));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CJugadorDesactivado.png"))); // NOI18N
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 190, 320));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CartaJugador.png"))); // NOI18N
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 190, 320));
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 60, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnMinimizar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIniciar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 180, 60));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DLGPartida dlgpartida = new DLGPartida(null, true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void colorJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorJugador1ActionPerformed
       StringBuffer colores = new StringBuffer();
        DLGColor dlg = new DLGColor(null, true, colores);

        String coloresPos[] = colores.toString().split(",");
        int coloresInt[] = {
            Integer.parseInt(coloresPos[0]),
            Integer.parseInt(coloresPos[1]),
            Integer.parseInt(coloresPos[2])
        };

        Graphics2D g = (Graphics2D) this.panelJugador1.getGraphics();
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);
        g.setColor(colorJugador);

        g.fillOval(0, 0, 101, 101);
        this.panelJugador1.paintComponents(g);
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

        Graphics2D g = (Graphics2D) this.panelJugador2.getGraphics();
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);
        g.setColor(colorJugador);

        g.fillOval(0, 0, 101, 101);
        this.panelJugador2.paintComponents(g);
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

        Graphics2D g = (Graphics2D) this.panelJugador3.getGraphics();
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);
        g.setColor(colorJugador);

        g.fillOval(0, 0, 101, 101);
        this.panelJugador3.paintComponents(g);
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

        Graphics2D g = (Graphics2D) this.panelJugador4.getGraphics();
        Color colorJugador = new Color(coloresInt[0], coloresInt[1], coloresInt[2]);
        g.setColor(colorJugador);

        g.fillOval(0, 0, 101, 101);
        this.panelJugador4.paintComponents(g);
    }//GEN-LAST:event_colorJugador4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton colorJugador1;
    private javax.swing.JButton colorJugador2;
    private javax.swing.JButton colorJugador3;
    private javax.swing.JButton colorJugador4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelJugador1;
    private javax.swing.JPanel panelJugador2;
    private javax.swing.JPanel panelJugador3;
    private javax.swing.JPanel panelJugador4;
    // End of variables declaration//GEN-END:variables
}
