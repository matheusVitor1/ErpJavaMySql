package Projeto.Consultas;

import Projeto.ConectarBD;
import Projeto.ConsultarBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsultaCr extends javax.swing.JInternalFrame {

    ConectarBD con = new ConectarBD();
    ConsultarBD cns = new ConsultarBD();
    Connection conexao = con.connectionMySql();

    public ConsultaCr() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notaFiscal = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        limpar_pesquisa = new javax.swing.JButton();
        combo_box = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Consulta Contas a Receber");
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

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
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
                "ID", "ID Pedido", "Data Faturamento", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Método de Consulta");

        limpar_pesquisa.setText("Limpar Pesquisa");
        limpar_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_pesquisaActionPerformed(evt);
            }
        });

        combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NF" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(limpar_pesquisa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar_pesquisa)
                    .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
        );

        setBounds(600, 30, 795, 530);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * ********************************************************************
     * Metodo do botao Pesquisar e incluir na jTable
     * *******************************************************************
     */

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed

        // armazena o que for digitado no campo nf da Int gráfica
        String nf = notaFiscal.getText();

        //verifica se o campo ID foi preenchido
        if (nf != null && !nf.isEmpty()) {
            DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();

            int l = mp1.getRowCount();

            if (l > 0) {
                while (l > 0) {
                    ((DefaultTableModel) jTable1.getModel()).removeRow(1 - 1);
                    l--;
                }

            }

            try {
                int nfAuxi = Integer.parseInt(nf);

                // recebe os resultados do metodo consultaNf() passado o id do pedido como parametro
                ResultSet rs = ConsultarBD.consultaCrSh(conexao, nfAuxi);
                DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

                while (rs.next()) {
                    int id_cr = rs.getInt(1);
                    String coluna0 = Integer.toString(id_cr);
                    
                    int id_ped = rs.getInt(2);
                    String coluna1 = Integer.toString(id_ped);
                    
                    String coluna2 = rs.getString(3);
                    
                    double valor = cns.retornaValorProduto(conexao, id_ped);
                    String coluna3 = Double.toString(valor);

                    // insere os dados na jTable
                    mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3});

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
     * ******************************************************
     * metodo responsavel por limpar a tela de pesquisa
     * *****************************************************
     */

    private void limpar_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_pesquisaActionPerformed

        notaFiscal.setText("");

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
            ResultSet rs = ConsultarBD.consultaCr(conexao);
            // instanciamento da classe para inserir os dados na jTable1
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            //verifica se tem resultados do retorno da classe ResultSet
            while (rs.next()) {

                    int id_cr = rs.getInt(1);
                    String coluna0 = Integer.toString(id_cr);
                    
                    int id_ped = rs.getInt(2);
                    String coluna1 = Integer.toString(id_ped);
                    
                    String coluna2 = rs.getString(3);
                    
                    double valor = cns.retornaValorProduto(conexao, id_ped);
                    String coluna3 = Double.toString(valor);

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
    }//GEN-LAST:event_limpar_pesquisaActionPerformed

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
            ResultSet rs = ConsultarBD.consultaCr(conexao);
            // instanciamento da classe para inserir os dados na jTable1
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            //verifica se tem resultados do retorno da classe ResultSet
            while (rs.next()) {

                // recebe e armazena os dados recebido da classe ResultSet
                    int id_cr = rs.getInt(1);
                    String coluna0 = Integer.toString(id_cr);
                    
                    int id_ped = rs.getInt(2);
                    String coluna1 = Integer.toString(id_ped);
                    
                    String coluna2 = rs.getString(3);
                    
                    double valor = cns.retornaValorProduto(conexao, id_ped);
                    String coluna3 = Double.toString(valor);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpar_pesquisa;
    private javax.swing.JTextField notaFiscal;
    private javax.swing.JButton pesquisar;
    // End of variables declaration//GEN-END:variables

    public void redimensionarColuna() {

        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);

    }

}
