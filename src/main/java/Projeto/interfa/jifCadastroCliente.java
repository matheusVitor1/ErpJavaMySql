/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Projeto.interfa;

import Projeto.ConectarBD;
import Projeto.DeletaBD;
import Projeto.EditaBD;
import Projeto.InsereBD;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Alves
 */
public class jifCadastroCliente extends javax.swing.JInternalFrame {

    //instanciamento das classes necessárias
    InsereBD ins = new InsereBD();
    ConectarBD con = new ConectarBD();
    DeletaBD del = new DeletaBD();
    EditaBD edit = new EditaBD();
    Connection conexao = con.connectionMySql();
    //variável auxiliar para definir o tipo do botão (novo, editar, excluir)
    int acao;
    //variável auxiliar para o botão editar
    String cod_cliente = "";

    public jifCadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cnpj_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        end_cliente = new javax.swing.JTextField();
        novo_cliente = new javax.swing.JButton();
        excluir_cliente = new javax.swing.JButton();
        salvar_cliente = new javax.swing.JButton();
        cancelar_cliente = new javax.swing.JButton();
        editar_cliente = new javax.swing.JButton();
        salvar_edit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcod = new javax.swing.JTextField();

        setBackground(new java.awt.Color(13, 39, 77));
        setClosable(true);
        setTitle("Cadastro de Clientes");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(13, 36, 125));
        jLabel1.setText("Nome:");

        nome_cliente.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(13, 36, 125));
        jLabel2.setText("CNPJ:");

        cnpj_cliente.setEnabled(false);
        cnpj_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpj_clienteActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(13, 36, 125));
        jLabel3.setText("Enderço:");

        end_cliente.setEnabled(false);
        end_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_clienteActionPerformed(evt);
            }
        });

        novo_cliente.setBackground(new java.awt.Color(13, 36, 125));
        novo_cliente.setForeground(new java.awt.Color(255, 255, 255));
        novo_cliente.setText("Novo");
        novo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_clienteActionPerformed(evt);
            }
        });

        excluir_cliente.setBackground(new java.awt.Color(13, 36, 125));
        excluir_cliente.setForeground(new java.awt.Color(255, 255, 255));
        excluir_cliente.setText("Excluir");
        excluir_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_clienteActionPerformed(evt);
            }
        });

        salvar_cliente.setBackground(new java.awt.Color(13, 36, 125));
        salvar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        salvar_cliente.setText("Salvar");
        salvar_cliente.setEnabled(false);
        salvar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_clienteActionPerformed(evt);
            }
        });

        cancelar_cliente.setBackground(new java.awt.Color(13, 36, 125));
        cancelar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        cancelar_cliente.setText("Cancelar");
        cancelar_cliente.setEnabled(false);
        cancelar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_clienteActionPerformed(evt);
            }
        });

        editar_cliente.setBackground(new java.awt.Color(13, 36, 125));
        editar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        editar_cliente.setText("Editar");
        editar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_clienteActionPerformed(evt);
            }
        });

        salvar_edit.setBackground(new java.awt.Color(13, 36, 125));
        salvar_edit.setForeground(new java.awt.Color(255, 255, 255));
        salvar_edit.setText("Salvar Edit");
        salvar_edit.setEnabled(false);
        salvar_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_editActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Cod");

        jcod.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cnpj_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(end_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nome_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(novo_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluir_cliente))
                            .addComponent(jcod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cancelar_cliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(salvar_cliente, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(salvar_edit))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(salvar_cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar_cliente)
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvar_edit)
                            .addComponent(excluir_cliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpj_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(end_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(novo_cliente)
                            .addComponent(editar_cliente))))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(600, 20, 612, 323);
    }// </editor-fold>//GEN-END:initComponents

    private void salvar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_clienteActionPerformed
        //variável que recebe a primary key do BD
        int cod;
        //condição que verifica o tipo do botão (nesse caso, botão novo)
        if (acao == 1) {

            try {
                //armazenamento do que foi digitado nos campos em váriáveis
                String nome = nome_cliente.getText().trim();
                String cnpj = cnpj_cliente.getText().trim();
                String end = end_cliente.getText().trim();
                // verifica se os campos estão nulos
                if (nome != null && !nome.isEmpty() && cnpj != null && !cnpj.isEmpty() && end != null && !end.isEmpty()) {
                    //passando por parametros para a função que insere os clientes no BD
                    ins.insereCliente(conexao, nome, cnpj, end);
                    //variável que recebe a primary key do CLiente
                    cod = ins.retornaPrimaryKey(conexao);
                    //Insere na interface gráfica o valor da primary key
                    jcod.setText(String.valueOf(cod));

                    JOptionPane.showMessageDialog(null, "Inserido com sucesso");
                    salvar();

                    //caso tenha algum campo vazio apresenta uma mensagem informando para inserir todos os campos e o BD não é preenchido    
                } else {
                    JOptionPane.showMessageDialog(null, "Favor Prencher todos os Campos");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir!" + e);
            }

            // segue o padrão anterior  (verificação do botão Editar)
        } else if (acao == 2) {

            try {

                if (cod_cliente != null && !cod_cliente.isEmpty()) {

                    int cod1 = Integer.parseInt(cod_cliente);
                    String nome = nome_cliente.getText().trim();
                    String cnpj = cnpj_cliente.getText().trim();
                    String end = end_cliente.getText().trim();

                    edit.editaCliente(conexao, nome, cnpj, end, cod1);

                    JOptionPane.showMessageDialog(null, "Cliente Editado com sucesso");
                    salvar();
                } else {
                    JOptionPane.showMessageDialog(null, "Favor Prencher o campo CNPJ! ");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Editar!" + e);
            }
            // segue o padrão anterior  (verificação do botão Excluir)            

        } else if (acao == 3) {

            try {

                String cnpj = cnpj_cliente.getText().trim();

                if (cnpj != null && !cnpj.isEmpty()) {

                    del.deletaCliente(conexao, cnpj);

                    JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
                    salvar();
                } else {
                    JOptionPane.showMessageDialog(null, "Favor Prencher o campo CNPJ! ");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar!" + e);
            }

        }
    }//GEN-LAST:event_salvar_clienteActionPerformed

    private void novo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_clienteActionPerformed
        //configuração do botão novo
        novo();
        acao = 1;

    }//GEN-LAST:event_novo_clienteActionPerformed

    private void cnpj_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpj_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpj_clienteActionPerformed

    private void editar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_clienteActionPerformed
        //configuração do botão editar
        editar();
        acao = 2;

    }//GEN-LAST:event_editar_clienteActionPerformed

    private void excluir_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_clienteActionPerformed
        //configuração do botão excluir
        excluir();
        acao = 3;
    }//GEN-LAST:event_excluir_clienteActionPerformed

    private void cancelar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_clienteActionPerformed
        //configuração do botão cancelar
        cancelar();
    }//GEN-LAST:event_cancelar_clienteActionPerformed

    private void salvar_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_editActionPerformed
        //configuralçao da segunda tela do editar que realiza a edição no BD
        cod_cliente = jcod.getText().trim();
        JOptionPane.showMessageDialog(null, "Favor Inserir dados do Cliente!");
        editarSegundaTela();
    }//GEN-LAST:event_salvar_editActionPerformed

    private void end_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end_clienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar_cliente;
    private javax.swing.JTextField cnpj_cliente;
    private javax.swing.JButton editar_cliente;
    private javax.swing.JTextField end_cliente;
    private javax.swing.JButton excluir_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jcod;
    private javax.swing.JTextField nome_cliente;
    private javax.swing.JButton novo_cliente;
    private javax.swing.JButton salvar_cliente;
    private javax.swing.JButton salvar_edit;
    // End of variables declaration//GEN-END:variables

    public void novo() {
        cnpj_cliente.setEnabled(true);
        end_cliente.setEnabled(true);
        nome_cliente.setEnabled(true);
        salvar_cliente.setEnabled(true);
        excluir_cliente.setEnabled(true);
        cancelar_cliente.setEnabled(true);
        salvar_edit.setEnabled(false);

        nome_cliente.setText("");
        cnpj_cliente.setText("");
        end_cliente.setText("");
    }

    public void editar() {
        cnpj_cliente.setEnabled(false);
        jcod.setEnabled(true);
        end_cliente.setEnabled(false);
        nome_cliente.setEnabled(false);
        salvar_cliente.setEnabled(false);
        excluir_cliente.setEnabled(true);
        cancelar_cliente.setEnabled(true);
        salvar_edit.setEnabled(true);
        nome_cliente.setText("");
        cnpj_cliente.setText("");
        end_cliente.setText("");
    }

    public void editarSegundaTela() {

        jcod.setEnabled(false);
        cnpj_cliente.setEnabled(true);
        end_cliente.setEnabled(true);
        nome_cliente.setEnabled(true);
        salvar_cliente.setEnabled(true);
        excluir_cliente.setEnabled(true);
        cancelar_cliente.setEnabled(true);
        salvar_edit.setEnabled(false);


    }

    public void excluir() {
        cnpj_cliente.setEnabled(true);
        end_cliente.setEnabled(false);
        nome_cliente.setEnabled(false);
        salvar_cliente.setEnabled(true);
        excluir_cliente.setEnabled(true);
        cancelar_cliente.setEnabled(true);
        salvar_edit.setEnabled(false);
        nome_cliente.setText("");
        cnpj_cliente.setText("");
        end_cliente.setText("");
    }

    public void cancelar() {
        cnpj_cliente.setEnabled(false);
        end_cliente.setEnabled(false);
        nome_cliente.setEnabled(false);
        salvar_cliente.setEnabled(false);
        cancelar_cliente.setEnabled(false);
        salvar_edit.setEnabled(false);
        nome_cliente.setText("");
        cnpj_cliente.setText("");
        end_cliente.setText("");
    }

    public void salvar() {
        cnpj_cliente.setEnabled(false);
        end_cliente.setEnabled(false);
        nome_cliente.setEnabled(false);
        salvar_cliente.setEnabled(false);
        cancelar_cliente.setEnabled(false);
        salvar_edit.setEnabled(false);

    }

}
