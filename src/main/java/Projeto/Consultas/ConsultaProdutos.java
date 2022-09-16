package Projeto.Consultas;

import Projeto.ConectarBD;
import Projeto.ConsultarBD;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ConsultaProdutos extends javax.swing.JInternalFrame {

    ConectarBD con = new ConectarBD();
    Connection conexao = con.connectionMySql();

    public ConsultaProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pesquisar = new javax.swing.JButton();
        limpar_pesquisa = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta de Produtos");
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

        jLabel1.setText("Método de Consulta");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID" }));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Valor", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        limpar_pesquisa.setText("Limpar Pesquisa");
        limpar_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_pesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpar_pesquisa)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar)
                    .addComponent(limpar_pesquisa))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(600, 30, 846, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // do nothing
    }//GEN-LAST:event_idActionPerformed

    /**
     * ********************************************************************************
     * metodo que insere os dados do BD na jTable assim que é aberto a tela de
     * Consulta
     * *******************************************************************************
     */

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();

        int l = mp1.getRowCount();

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) jTable1.getModel()).removeRow(1 - 1);
                l--;
            }

        }

        try {
            ResultSet rs = ConsultarBD.consultaProd(conexao);
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            while (rs.next()) {
                int id_prod = rs.getInt(1);
                String coluna0 = Integer.toString(id_prod);

                double valor = rs.getDouble(2);
                String coluna1 = Double.toString(valor);

                String coluna3 = rs.getString(3);

                mp.addRow(new String[]{coluna0, coluna1, coluna3});

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        redimensionarColuna();
        jTable1.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_formInternalFrameOpened

    /**
     * ********************************************************************
     * Metodo do botao Pesquisar e incluir na jTable
     * *******************************************************************
     */

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed

        String id1 = id.getText().trim();

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
                int id2 = Integer.parseInt(id1);

                ResultSet rs = ConsultarBD.consultaProdSh(conexao, id2);
                DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

                while (rs.next()) {
                    int id_prod = rs.getInt(1);
                    String coluna0 = Integer.toString(id_prod);

                    double valor = rs.getDouble(2);
                    String coluna1 = Double.toString(valor);

                    String coluna3 = rs.getString(3);

                    mp.addRow(new String[]{coluna0, coluna1, coluna3});

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

    private void limpar_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_pesquisaActionPerformed
        DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();

        int l = mp1.getRowCount();

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) jTable1.getModel()).removeRow(1 - 1);
                l--;
            }

        }

        try {
            ResultSet rs = ConsultarBD.consultaProd(conexao);
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();

            while (rs.next()) {
                int id_prod = rs.getInt(1);
                String coluna0 = Integer.toString(id_prod);

                double valor = rs.getDouble(2);
                String coluna1 = Double.toString(valor);

                String coluna3 = rs.getString(3);

                mp.addRow(new String[]{coluna0, coluna1, coluna3});

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        redimensionarColuna();
        jTable1.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_limpar_pesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpar_pesquisa;
    private javax.swing.JButton pesquisar;
    // End of variables declaration//GEN-END:variables

    public void redimensionarColuna() {

        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);

    }

}
