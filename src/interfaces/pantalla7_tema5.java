package interfaces;

import logica.funcionBotones;

/**
 *
 * @author Gabriela Es
 */
public class pantalla7_tema5 extends javax.swing.JFrame {

    private funcionBotones funcionBotones = new funcionBotones();

    public pantalla7_tema5() {
        initComponents();
        transparenceButton();
        this.setLocationRelativeTo(null);
    }

    public void transparenceButton() {
        menu.setOpaque(false);
        menu.setContentAreaFilled(false);
        menu.setBorderPainted(false);
        traductor.setOpaque(false);
        traductor.setContentAreaFilled(false);
        traductor.setBorderPainted(false);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorderPainted(false);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuDesplegable = new javax.swing.JPopupMenu();
        contenido = new javax.swing.JMenuItem();
        tema1 = new javax.swing.JMenuItem();
        tema2 = new javax.swing.JMenuItem();
        tema3 = new javax.swing.JMenuItem();
        tema4 = new javax.swing.JMenuItem();
        tema5 = new javax.swing.JMenuItem();
        tema6 = new javax.swing.JMenuItem();
        tema7 = new javax.swing.JMenuItem();
        tema8 = new javax.swing.JMenuItem();
        quiz = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        traductor = new javax.swing.JButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();

        contenido.setText("CONTENIDO");
        contenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contenidoActionPerformed(evt);
            }
        });
        menuDesplegable.add(contenido);

        tema1.setText("Tema 1");
        tema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema1ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema1);

        tema2.setText("Tema 2");
        tema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema2ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema2);

        tema3.setText("Tema 3");
        tema3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema3ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema3);

        tema4.setText("Tema 4");
        tema4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema4ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema4);

        tema5.setText("Tema 5");
        tema5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema5ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema5);

        tema6.setText("Tema 6");
        tema6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema6ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema6);

        tema7.setText("Tema 7");
        tema7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema7ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema7);

        tema8.setText("Tema 8");
        tema8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tema8ActionPerformed(evt);
            }
        });
        menuDesplegable.add(tema8);

        quiz.setText("QUIZ");
        menuDesplegable.add(quiz);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMenu.png"))); // NOI18N
        menu.setComponentPopupMenu(menuDesplegable);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 16, 33, 32));

        traductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconTraductor.png"))); // NOI18N
        traductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traductorActionPerformed(evt);
            }
        });
        jPanel2.add(traductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 33, 32));

        next.setText("->");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel2.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 10, 50, 40));

        back.setText("<-");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 50, 40));

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setFont(new java.awt.Font("Arial", 3, 22)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Sistemas de Almacenamiento Masivo");
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 60));

        title2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("TEMA 5");
        jPanel1.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        int x = menu.getX();
        int y = menu.getY() + menu.getHeight();
        menuDesplegable.show(this, x, y);

    }//GEN-LAST:event_menuActionPerformed

    private void traductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_traductorActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        pantalla8_tema6 panel8 = new pantalla8_tema6();
        funcionBotones.botonContinuar(panel8);
        this.dispose();

    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        pantalla6_tema4 panel6 = new pantalla6_tema4();
        funcionBotones.botonContinuar(panel6);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void contenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contenidoActionPerformed
        // TODO add your handling code here:
        pantalla2 panel2 = new pantalla2();
        funcionBotones.botonContinuar(panel2);
        this.dispose();
    }//GEN-LAST:event_contenidoActionPerformed

    private void tema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema1ActionPerformed
        // TODO add your handling code here:
        pantalla3_tema1 panel3 = new pantalla3_tema1();
        funcionBotones.botonContinuar(panel3);
        this.dispose();
    }//GEN-LAST:event_tema1ActionPerformed

    private void tema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema2ActionPerformed
        // TODO add your handling code here:
        pantalla4_tema2 panel4 = new pantalla4_tema2();
        funcionBotones.botonContinuar(panel4);
        this.dispose();
    }//GEN-LAST:event_tema2ActionPerformed

    private void tema3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema3ActionPerformed
        // TODO add your handling code here:
        pantalla5_tema3 panel5 = new pantalla5_tema3();
        funcionBotones.botonContinuar(panel5);
        this.dispose();
    }//GEN-LAST:event_tema3ActionPerformed

    private void tema4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema4ActionPerformed
        // TODO add your handling code here:
        pantalla6_tema4 panel6 = new pantalla6_tema4();
        funcionBotones.botonContinuar(panel6);
        this.dispose();
    }//GEN-LAST:event_tema4ActionPerformed

    private void tema5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema5ActionPerformed
        // TODO add your handling code here:
        pantalla7_tema5 panel7 = new pantalla7_tema5();
        funcionBotones.botonContinuar(panel7);
        this.dispose();
    }//GEN-LAST:event_tema5ActionPerformed

    private void tema6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema6ActionPerformed
        // TODO add your handling code here:
        pantalla8_tema6 panel8 = new pantalla8_tema6();
        funcionBotones.botonContinuar(panel8);
        this.dispose();
    }//GEN-LAST:event_tema6ActionPerformed

    private void tema7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema7ActionPerformed
        // TODO add your handling code here:
        pantalla9_tema7 panel9 = new pantalla9_tema7();
        funcionBotones.botonContinuar(panel9);
        this.dispose();
    }//GEN-LAST:event_tema7ActionPerformed

    private void tema8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tema8ActionPerformed
        // TODO add your handling code here:
        pantalla10_tema8 panel10 = new pantalla10_tema8();
        funcionBotones.botonContinuar(panel10);
        this.dispose();
    }//GEN-LAST:event_tema8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JMenuItem contenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton menu;
    private javax.swing.JPopupMenu menuDesplegable;
    private javax.swing.JButton next;
    private javax.swing.JMenuItem quiz;
    private javax.swing.JMenuItem tema1;
    private javax.swing.JMenuItem tema2;
    private javax.swing.JMenuItem tema3;
    private javax.swing.JMenuItem tema4;
    private javax.swing.JMenuItem tema5;
    private javax.swing.JMenuItem tema6;
    private javax.swing.JMenuItem tema7;
    private javax.swing.JMenuItem tema8;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JButton traductor;
    // End of variables declaration//GEN-END:variables
}
