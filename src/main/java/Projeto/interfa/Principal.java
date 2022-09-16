/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Projeto.interfa;

import Projeto.Consultas.ConsultaCliente;
import Projeto.Consultas.ConsultaCp;
import Projeto.Consultas.ConsultaCr;
import Projeto.Consultas.ConsultaNf;
import Projeto.Consultas.ConsultaPedidos;
import Projeto.Consultas.ConsultaProdutos;
import Projeto.Consultas.ConsultaSalario;
import Projeto.Consultas.ConsultaSocios;

/**
 *
 * @author Matheus Alves
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuProdutos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuSocio = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuPedidos = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuNf = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuCr = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuCp = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuSalario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("vmr");
        setBackground(new java.awt.Color(13, 39, 77));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matheus Alves\\Desktop\\Senai\\Desenvolvimento Web\\vmr\\img\\297030.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jdpPrincipal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPrincipalLayout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 660, Short.MAX_VALUE))
        );

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(-400, 0, 2665, 1377);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(13, 39, 77));
        jMenuBar1.setMargin(new java.awt.Insets(0, -7, 0, 0));
        jMenuBar1.add(jMenu6);

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matheus Alves\\Downloads\\logo-removebg-preview.png")); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(3, -4, 3, 6));
        jMenuBar1.add(jMenu1);

        jMenu3.setForeground(new java.awt.Color(13, 36, 125));
        jMenu3.setText("Clientes");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(3, 30, 3, 30));

        jMenuCliente.setForeground(new java.awt.Color(13, 36, 125));
        jMenuCliente.setText("   Cadastrar / Editar / Excluir");
        jMenuCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuCliente.setMargin(new java.awt.Insets(3, 9, 3, 6));
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCliente);
        jMenu3.add(jSeparator2);

        jMenuItem1.setForeground(new java.awt.Color(13, 36, 125));
        jMenuItem1.setText("Consultar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(13, 36, 125));
        jMenu4.setText("Produtos");
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuProdutos.setForeground(new java.awt.Color(13, 36, 125));
        jMenuProdutos.setText("Cadastrar / Editar / Excluir");
        jMenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutosActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuProdutos);
        jMenu4.add(jSeparator3);

        jMenuItem2.setForeground(new java.awt.Color(13, 36, 125));
        jMenuItem2.setText("Consulta Produtos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(13, 36, 125));
        jMenu5.setText("Socios");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuSocio.setForeground(new java.awt.Color(13, 36, 125));
        jMenuSocio.setText("Cadastrar/Editar/Excluir");
        jMenuSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSocioActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuSocio);
        jMenu5.add(jSeparator4);

        jMenuItem3.setForeground(new java.awt.Color(13, 36, 125));
        jMenuItem3.setText("Consulta Socio");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu7.setForeground(new java.awt.Color(13, 36, 125));
        jMenu7.setText("Pedidos");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(3, 30, 3, 30));

        jMenuPedidos.setForeground(new java.awt.Color(13, 36, 125));
        jMenuPedidos.setText("Cadastra/Editar/Excluir");
        jMenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPedidosActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuPedidos);
        jMenu7.add(jSeparator5);

        jMenuItem4.setForeground(new java.awt.Color(13, 36, 125));
        jMenuItem4.setText("Consulta Pedidos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenuBar1.add(jMenu7);

        jMenu9.setForeground(new java.awt.Color(13, 36, 125));
        jMenu9.setText("Nota Fiscal");
        jMenu9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu9.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuNf.setForeground(new java.awt.Color(13, 36, 125));
        jMenuNf.setText("Cadastrar/Editar/Excluir");
        jMenuNf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNfActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuNf);
        jMenu9.add(jSeparator6);

        jMenuItem5.setForeground(new java.awt.Color(13, 36, 125));
        jMenuItem5.setText("Consultar Nota Fiscal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenuBar1.add(jMenu9);

        jMenu11.setForeground(new java.awt.Color(13, 36, 125));
        jMenu11.setText("Contas a Receber");
        jMenu11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu11.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu11ActionPerformed(evt);
            }
        });

        jMenuCr.setForeground(new java.awt.Color(13, 36, 125));
        jMenuCr.setText("Cadastrar/Editar/Excluir");
        jMenuCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCrActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuCr);
        jMenu11.add(jSeparator7);

        jMenuItem6.setForeground(new java.awt.Color(13, 36, 125));
        jMenuItem6.setText("Consultar Contas a Receber");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem6);

        jMenuBar1.add(jMenu11);

        jMenu13.setForeground(new java.awt.Color(13, 36, 125));
        jMenu13.setText("Contas a Pagar");
        jMenu13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu13.setMargin(new java.awt.Insets(3, 30, 3, 30));

        jMenuCp.setForeground(new java.awt.Color(13, 36, 125));
        jMenuCp.setText("Cadastrar/Editar/Excluir");
        jMenuCp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCpActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuCp);
        jMenu13.add(jSeparator8);

        jMenuItem7.setForeground(new java.awt.Color(13, 36, 123));
        jMenuItem7.setText("Consulta Contas a Pagar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem7);

        jMenuBar1.add(jMenu13);

        jMenu15.setForeground(new java.awt.Color(13, 36, 125));
        jMenu15.setText("Salarios");
        jMenu15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu15.setMargin(new java.awt.Insets(3, 30, 3, 30));

        jMenuSalario.setForeground(new java.awt.Color(13, 36, 125));
        jMenuSalario.setText("Cadastra/Editar/Excluir");
        jMenuSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalarioActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuSalario);
        jMenu15.add(jSeparator1);
        jMenu15.add(jSeparator9);

        jMenuItem8.setForeground(new java.awt.Color(13, 36, 125));
        jMenuItem8.setText("Consultar Salario");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem8);

        jMenuBar1.add(jMenu15);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        jifCadastroCliente obj = new jifCadastroCliente();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSocioActionPerformed
        // TODO add your handling code here:
        jifCadastroSocios obj = new jifCadastroSocios();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuSocioActionPerformed

    private void jMenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPedidosActionPerformed
        // TODO add your handling code here:
        jifCadastroPedidos obj = new jifCadastroPedidos();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuPedidosActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        jifCadastroProdutos obj = new jifCadastroProdutos();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuNfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNfActionPerformed
        // TODO add your handling code here:
        jifCadastroNf obj = new jifCadastroNf();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuNfActionPerformed

    private void jMenuCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCrActionPerformed
        // TODO add your handling code here:
        jifCadastroCr obj = new jifCadastroCr();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuCrActionPerformed

    private void jMenuCpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCpActionPerformed
        // TODO add your handling code here:
        jifCadastroCp obj = new jifCadastroCp();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuCpActionPerformed

    private void jMenuSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalarioActionPerformed
        // TODO add your handling code here:
        jifCadastroSalarios obj = new jifCadastroSalarios();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuSalarioActionPerformed

    private void jMenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosActionPerformed
        // TODO add your handling code here:
        jifCadastroProdutos obj = new jifCadastroProdutos();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuProdutosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ConsultaCliente obj = new ConsultaCliente();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ConsultaProdutos obj = new ConsultaProdutos();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
          //do nothing
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConsultaSocios obj = new ConsultaSocios();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ConsultaPedidos obj = new ConsultaPedidos();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        //do nothing
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ConsultaNf obj = new ConsultaNf();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu11ActionPerformed
        //do nothing
    }//GEN-LAST:event_jMenu11ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ConsultaCr obj = new ConsultaCr();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         ConsultaCp obj = new ConsultaCp();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         ConsultaSalario obj = new ConsultaSalario();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuCp;
    private javax.swing.JMenuItem jMenuCr;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuNf;
    private javax.swing.JMenuItem jMenuPedidos;
    private javax.swing.JMenuItem jMenuProdutos;
    private javax.swing.JMenuItem jMenuSalario;
    private javax.swing.JMenuItem jMenuSocio;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
