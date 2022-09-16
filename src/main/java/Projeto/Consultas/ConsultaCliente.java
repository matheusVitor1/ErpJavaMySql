/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Projeto.Consultas;

import Projeto.ConectarBD;
import Projeto.ConsultarBD;

import java.sql.*;

import javax.swing.table.DefaultTableModel;

public class ConsultaCliente extends javax.swing.JInternalFrame {

    ConectarBD con = new ConectarBD();
    Connection conexao = con.connectionMySql();

    public ConsultaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cnpj = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Clientes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CNPJ", "Endereço"
            }
        ));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Método de Consulta");

        jComboBox1.setMaximumRowCount(1);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNPJ" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        limpar.setText("Limpar Consulta");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(pesquisar)
                .addGap(36, 36, 36)
                .addComponent(limpar)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar)
                    .addComponent(limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
        );

        setBounds(600, 30, 1080, 532);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // do nothing
    }//GEN-LAST:event_jTable1ComponentShown

    /**
     * ********************************************************************************
     * metodo que insere os dados do BD na jTable assim que é aberto a tela de
     * Consulta
     * *******************************************************************************
     */

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();

        // conta se existe linha na tabela
        int l = mp1.getRowCount();
        // verifica se houver linha que não seja puxada do BD
        if (l > 0) {
            while (l > 0) {
                // se existir alguma linha que não seja puxada do BD ela é removida
                ((DefaultTableModel) jTable1.getModel()).removeRow(1 - 1);
                l--;
            } // fim do while

        } // fim do if

        try {
            // recebe o resultado que é retornado do método consultaCLiente()
            ResultSet rs = ConsultarBD.consultaCliente(conexao);
            // instanciamento da classe para inserir os dados na jTable1
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            //verifica se tem resultados do retorno da classe ResultSet
            while (rs.next()) {

                // recebe e armazena os dados recebido da classe ResultSet
                int id_cliente = rs.getInt(1);

                String coluna0 = Integer.toString(id_cliente);

                String coluna1 = rs.getString(2);

                String coluna2 = rs.getString(3);

                String coluna3 = rs.getString(4);

                // insere os dados na jTable
                mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3});

            }//fim do while

        } // fim do try
        catch (SQLException e) {
            System.out.println(e);
        } // fim do catch

        //chama o método que redimensiona a coluna ID
        redimensionarColuna();
        jTable1.setAutoCreateRowSorter(true);

    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // do nothing
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * ********************************************************************
     * Metodo do botao Pesquisar e incluir na jTable
     * *******************************************************************
     */

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed

        // armazena o que for digitado no campo CNPJ da Int gráfica
        String cnpj1 = cnpj.getText().trim();

        //verifica se o campo cnpj foi preenchido
        if (cnpj1 != null && !cnpj1.isEmpty()) {
            DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();

            int l = mp1.getRowCount();

            if (l > 0) {
                while (l > 0) {
                    ((DefaultTableModel) jTable1.getModel()).removeRow(1 - 1);
                    l--;
                }

            }

            try {

                // recebe os resultados do metodo consultaCliente() mas e passado o cnpj como parametro
                ResultSet rs = ConsultarBD.consultaClienteSh(conexao, cnpj1);
                DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

                while (rs.next()) {
                    int aux = rs.getInt(1);
                    // recebe e armazena os dados recebido da classe ResultSet
                    int id_cliente = rs.getInt(1);

                    String coluna0 = Integer.toString(id_cliente);

                    String coluna1 = rs.getString(2);

                    String coluna2 = rs.getString(3);

                    String coluna3 = rs.getString(4);

                    // insere os dados na jTable
                    mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3});

                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            //do nothing
        }
        redimensionarColuna();
    }//GEN-LAST:event_pesquisarActionPerformed

    /**
     * ******************************************************
     * metodo responsavel por limpar a tela de pesquisa
     * *****************************************************
     */

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed

        cnpj.setText("");
        DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();

        int l = mp1.getRowCount();

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) jTable1.getModel()).removeRow(1 - 1);
                l--;
            }

        }

        try {
            ResultSet rs = ConsultarBD.consultaCliente(conexao);
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            while (rs.next()) {
                // recebe e armazena os dados recebido da classe ResultSet
                int id_cliente = rs.getInt(1);  
                
                String coluna0 = Integer.toString(id_cliente);
                
                String coluna1 = rs.getString(2);
                
                String coluna2 = rs.getString(3);
                
                String coluna3 = rs.getString(4);

                // insere os dados na jTable
                mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3});

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        redimensionarColuna();
        jTable1.setAutoCreateRowSorter(true);

    }//GEN-LAST:event_limparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnpj;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton pesquisar;
    // End of variables declaration//GEN-END:variables

    // metodo que diminui a coluna ID
    public void redimensionarColuna() {

        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);

    }

}
