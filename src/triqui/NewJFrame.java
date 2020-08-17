package triqui;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javafx.scene.paint.Color;

public class NewJFrame extends javax.swing.JFrame {

    int turno = 1;
    int matriz[][] = new int[3][3];
    Boolean ganador = false;

    public NewJFrame() {
        initComponents();
        
     	lblTurno_1.setText("Jugardor 1");
    	java.awt.Color c = new java.awt.Color(179, 0, 0, 100); 
    	lblTurno_1.setForeground(c);
    }

    private void initComponents() {

        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText("TRIQUI");
        
        JLabel lblTurno = new JLabel();
        lblTurno.setText("Turno:");
        lblTurno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
        
        lblTurno_1 = new JLabel();
        lblTurno_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(20, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblTurno, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblTurno_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(b4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        						.addGap(34)
        						.addComponent(b5, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        						.addGap(31)
        						.addComponent(b6, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(b1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        								.addGap(34)
        								.addComponent(b2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
        						.addGap(31)
        						.addComponent(b3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(b7, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)
        					.addComponent(b8, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        					.addGap(31)
        					.addComponent(b9, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
        			.addGap(82))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(b3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addComponent(b1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addComponent(b2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
        					.addGap(30)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(b6, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addComponent(b4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addComponent(b5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
        					.addGap(28)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(b9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addComponent(b7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addComponent(b8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(25)
        					.addComponent(lblTurno, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblTurno_1)))
        			.addContainerGap(94, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
    private void validarEmpate() {
        int cuenta = 0;

        for (int j = 0; j <= 2; j++) {
            for (int k = 0; k <= 2; k++) {
            	cuenta = cuenta + matriz[j][k];
            }
        }
        if (cuenta == 1380 || cuenta == 1536) {
            JOptionPane.showMessageDialog(rootPane, "Empate");
            reiniciar();
        }
    }

    private void reiniciar() {
        b1.setText("");
        b1.setEnabled(true);
        b2.setText("");
        b2.setEnabled(true);
        b3.setText("");
        b3.setEnabled(true);
        b4.setText("");
        b4.setEnabled(true);
        b5.setText("");
        b5.setEnabled(true);
        b6.setText("");
        b6.setEnabled(true);
        b7.setText("");
        b7.setEnabled(true);
        b8.setText("");
        b8.setEnabled(true);
        b9.setText("");
        b9.setEnabled(true);

        for (int x = 0; x <= 2; x++) {
            for (int i = 0; i <= 2; i++) {
                matriz[x][i] = 0;
            }
        }
        
        turno = 1;
     	lblTurno_1.setText("Jugardor 1");
    	java.awt.Color c = new java.awt.Color(179, 0, 0, 100); 
    	lblTurno_1.setForeground(c);
    	ganador = true;
    }
    
    private void cambiarTurno() {
        if(ganador) {
        	ganador = false;
        }else
        {
            if (turno == 1) {
            	lblTurno_1.setText("Jugardor 2");
            	java.awt.Color c = new java.awt.Color(41, 41, 163, 100);
            	lblTurno_1.setForeground(c);
                turno = 2;
            } else {
            	lblTurno_1.setText("Jugardor 1");
            	java.awt.Color c = new java.awt.Color(179, 0, 0, 100);  
            	lblTurno_1.setForeground(c);
            	turno = 1;
            }        	
        }
    } 

    private void validarGanador(int cuenta) {
        if (cuenta == 252) {
            JOptionPane.showMessageDialog(null, "JUGADOR 1 GANO");
            reiniciar();
        }
        if (cuenta == 720) {
            JOptionPane.showMessageDialog(null, "JUGADOR 2 GANO");
            reiniciar();
        }
    }
    
    private void linea1() {
    	validarGanador(matriz[0][0] + matriz[0][1] + matriz[0][2]);
    }

    private void linea2() {
    	validarGanador(matriz[1][0] + matriz[1][1] + matriz[1][2]);
    }

    private void linea3() {
    	validarGanador(matriz[2][0] + matriz[2][1] + matriz[2][2]);
    }

    private void linea4() {
    	validarGanador(matriz[0][0] + matriz[1][0] + matriz[2][0]);
    }

    private void linea5() {
        validarGanador(matriz[0][1] + matriz[1][1] + matriz[2][1]);
    }

    private void linea6() {
    	validarGanador(matriz[0][2] + matriz[1][2] + matriz[2][2]);
    }

    private void lineaX() {
    	validarGanador(matriz[0][0] + matriz[1][1] + matriz[2][2]);
    	validarGanador(matriz[2][0] + matriz[1][1] + matriz[0][2]);
    }
    
    
    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        if (turno == 1) {
            b1.setText("X");
            matriz[0][0] = 84;
            b1.setEnabled(false);
        } else {
            b1.setText("O");
            matriz[0][0] = 240;
            b1.setEnabled(false);
        }

        validarEmpate();
        linea1();
        linea4();
        lineaX();
        cambiarTurno();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        if (turno == 1) {
            b2.setText("X");
            matriz[0][1] = 84;
            b2.setEnabled(false);
        } else {
           
            b2.setText("O");
            matriz[0][1] = 240;
            b2.setEnabled(false);

        }

        validarEmpate();
        linea1();
        linea5();
        lineaX();
        cambiarTurno();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        if (turno == 1) {
            b3.setText("X");
            matriz[0][2] = 84;
            b3.setEnabled(false);

        } else {
            b3.setText("O");
            matriz[0][2] = 240;
            b3.setEnabled(false);
        }

        validarEmpate();
        linea1();
        linea2();
        linea4();
        lineaX();
        linea6();
        cambiarTurno();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        if (turno == 1) {
            b4.setText("X");
            matriz[1][0] = 84;
            b4.setEnabled(false);

        } else {
            b4.setText("O");
            matriz[1][0] = 240;
            b4.setEnabled(false);
        }

        validarEmpate();
        linea2();
        linea4();
        lineaX();
        linea6();
        cambiarTurno();
    }//GEN-LAST:event_b4ActionPerformed
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

        if (turno == 1) {
            b5.setText("X");
            matriz[1][1] = 84;
            b5.setEnabled(false);
        } else {
            b5.setText("O");
            matriz[1][1] = 240;
            b5.setEnabled(false);
        }

        validarEmpate();
        linea2();
        linea5();
        lineaX();
        cambiarTurno();
    }

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {

        if (turno == 1) {
            b6.setText("X");
            matriz[1][2] = 84;
            b6.setEnabled(false);
        } else {
            b6.setText("O");
            matriz[1][2] = 240;
            b6.setEnabled(false);
        }

        validarEmpate();
        linea2();
        linea4();
        linea6();
        lineaX();
        cambiarTurno();
    }

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {

        if (turno == 1) {
            b7.setText("X");
            matriz[2][0] = 84;
            b7.setEnabled(false);
        } else {
            b7.setText("O");
            matriz[2][0] = 240;
            b7.setEnabled(false);
        }

        validarEmpate();
        linea3();
        linea4();
        lineaX();
        cambiarTurno();
    }

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {

        if (turno == 1) {
            b8.setText("X");
            matriz[2][1] = 84;
            b8.setEnabled(false);
        } else {
            b8.setText("O");
            matriz[2][1] = 240;
            b8.setEnabled(false);
        }

        validarEmpate();
        linea3();
        linea5();
        lineaX();
        cambiarTurno();
    }

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {

        if (turno == 1) {
            b9.setText("X");
            matriz[2][2] = 84;
            b9.setEnabled(false);
        } else {
            b9.setText("O");
            matriz[2][2] = 240;
            b9.setEnabled(false);
        }

        validarEmpate();
        linea3();
        linea4();
        linea6();
        lineaX();
        cambiarTurno();
    }

    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel4;
    private JLabel lblTurno_1;
}
