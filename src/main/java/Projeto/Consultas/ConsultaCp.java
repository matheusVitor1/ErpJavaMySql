/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Projeto.Consultas;

import Projeto.ConectarBD;
import Projeto.ConsultarBD;
import Projeto.InsereBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsultaCp extends javax.swing.JInternalFrame {

    ConectarBD con = new ConectarBD();
    InsereBD ins = new InsereBD();
    Connection conexao = con.connectionMySql();

    public ConsultaCp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        limpar_cosulta = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consultas Contas Pagar");
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Alguel", "Luz", "Internet", "Telefonia", "Tributos", "Mês de Referência", "Total"
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
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID" }));
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

        limpar_cosulta.setText("Limpar Consulta");
        limpar_cosulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_cosultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(limpar_cosulta)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar)
                    .addComponent(limpar_cosulta))
                .addGap(0, 421, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 70, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setBounds(600, 30, 1098, 501);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // do nothing
    }//GEN-LAST:event_jTable1ComponentShown

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
        String id1 = id.getText().trim();

        //verifica se o campo ID foi preenchido
        if (id1 != null && !id1.isEmpty()) {
            DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();

            int l = mp1.getRowCount();

            if (l > 0) {
                while (l > 0) {
                    ((DefaultTableModel) jTable1.getModel()).removeRow(1 - 1);
                    l--;
                }

            }

            try {

                int idAux = Integer.parseInt(id1);

                // recebe os resultados do metodo consultaPedido() passado o id do pedido como parametro
                ResultSet rs = ConsultarBD.consultaContasPagarSh(conexao, idAux);
                DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

                while (rs.next()) {
                    int id_contas = rs.getInt(1);
                    String coluna0 = Integer.toString(id_contas);

                    double aluguel = rs.getDouble(2);
                    String coluna1 = Double.toString(aluguel);

                    double luz = rs.getDouble(3);
                    String coluna2 = Double.toString(luz);

                    double internet = rs.getDouble(4);
                    String coluna3 = Double.toString(internet);

                    double telefonia = rs.getDouble(5);
                    String coluna4 = Double.toString(telefonia);

                    double tributos = rs.getDouble(6);
                    String coluna5 = Double.toString(tributos);

                    String coluna6 = rs.getString(6);

                    double total = ins.retornaContasPagar(conexao, coluna6);
                    String coluna7 = Double.toString(total);

                    mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3, coluna4, coluna5, coluna6, coluna7});

                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } // fim do If
        else {
            //do nothing
        }
        redimensionarColuna();
    }//GEN-LAST:event_pesquisarActionPerformed

    /**
     * ************************************************************************
     * metodo responsavel por limpar a tela de pesquisa
     * ************************************************************************
     */

    private void limpar_cosultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_cosultaActionPerformed

        id.setText("");

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
            // recebe o resultado que é retornado do método consultaPedido()
            ResultSet rs = ConsultarBD.consultaContasPagar(conexao);
            // instanciamento da classe para inserir os dados na jTable1
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            //verifica se tem resultados do retorno da classe ResultSet
            while (rs.next()) {

                int id_contas = rs.getInt(1);
                String coluna0 = Integer.toString(id_contas);

                double aluguel = rs.getDouble(2);
                String coluna1 = Double.toString(aluguel);

                double luz = rs.getDouble(3);
                String coluna2 = Double.toString(luz);

                double internet = rs.getDouble(4);
                String coluna3 = Double.toString(internet);

                double telefonia = rs.getDouble(5);
                String coluna4 = Double.toString(telefonia);

                double tributos = rs.getDouble(6);
                String coluna5 = Double.toString(tributos);

                String coluna6 = rs.getString(6);

                double total = ins.retornaContasPagar(conexao, coluna6);
                String coluna7 = Double.toString(total);

                mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3, coluna4, coluna5, coluna6, coluna7});

            }//fim do while

        } // fim do try
        catch (SQLException e) {
            System.out.println(e);
        } // fim do catch

        //chama o método que redimensiona a coluna ID
        redimensionarColuna();
        jTable1.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_limpar_cosultaActionPerformed

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
            // recebe o resultado que é retornado do método consultaPedido()
            ResultSet rs = ConsultarBD.consultaContasPagar(conexao);
            // instanciamento da classe para inserir os dados na jTable1
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            //verifica se tem resultados do retorno da classe ResultSet
            while (rs.next()) {

                int id_contas = rs.getInt(1);
                String coluna0 = Integer.toString(id_contas);

                double aluguel = rs.getDouble(2);
                String coluna1 = Double.toString(aluguel);

                double luz = rs.getDouble(3);
                String coluna2 = Double.toString(luz);

                double internet = rs.getDouble(4);
                String coluna3 = Double.toString(internet);

                double telefonia = rs.getDouble(5);
                String coluna4 = Double.toString(telefonia);

                double tributos = rs.getDouble(6);
                String coluna5 = Double.toString(tributos);

                String coluna6 = rs.getString(7);

                double total = ins.retornaContasPagar(conexao, coluna6);
                String coluna7 = Double.toString(total);

                mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3, coluna4, coluna5, coluna6, coluna7});

            }//fim do while

        } // fim do try
        catch (SQLException e) {
            System.out.println(e);
        } // fim do catch

        //chama o método que redimensiona a coluna ID
        redimensionarColuna();
        jTable1.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpar_cosulta;
    private javax.swing.JButton pesquisar;
    // End of variables declaration//GEN-END:variables

    public void redimensionarColuna() {

        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);

    }

}
