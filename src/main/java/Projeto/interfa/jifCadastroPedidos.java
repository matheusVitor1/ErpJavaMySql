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
public class jifCadastroPedidos extends javax.swing.JInternalFrame {

    //instanciamento das classes necessárias
    InsereBD ins = new InsereBD();
    ConectarBD con = new ConectarBD();
    DeletaBD del = new DeletaBD();
    EditaBD edit = new EditaBD();
    Connection conexao = con.connectionMySql();
    //variável auxiliar para definir o tipo do botão (novo, editar, excluir)
    int acao;
    //variável auxiliar para o botão editar
    String cod_ped = "";

    public jifCadastroPedidos() {
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
        jPanel2 = new javax.swing.JPanel();
        jcod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id_produto_pedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        id_cliente_pedido = new javax.swing.JTextField();
        data_inst = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        data_ped = new javax.swing.JTextField();
        novo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salvar_edit = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setTitle("Adicionar Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jcod.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setForeground(new java.awt.Color(13, 36, 125));
        jLabel1.setText("Id do Produto:");

        id_produto_pedido.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(13, 36, 125));
        jLabel2.setText("Id do Cliente");

        id_cliente_pedido.setEnabled(false);

        data_inst.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(13, 36, 125));
        jLabel3.setText("Data da Instalação");

        jLabel4.setForeground(new java.awt.Color(13, 36, 125));
        jLabel4.setText("Data do Pedido");

        data_ped.setEnabled(false);

        novo.setBackground(new java.awt.Color(13, 36, 125));
        novo.setForeground(new java.awt.Color(255, 255, 255));
        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(13, 36, 125));
        editar.setForeground(new java.awt.Color(255, 255, 255));
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        excluir.setBackground(new java.awt.Color(13, 36, 125));
        excluir.setForeground(new java.awt.Color(255, 255, 255));
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Cod");

        salvar.setBackground(new java.awt.Color(13, 36, 125));
        salvar.setForeground(new java.awt.Color(255, 255, 255));
        salvar.setText("Salvar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(13, 36, 125));
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(366, 366, 366))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcod, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_inst, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(data_ped, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluir))
                            .addComponent(id_cliente_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(id_produto_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(217, 217, 217)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelar)
                            .addComponent(salvar)
                            .addComponent(salvar_edit))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(id_produto_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salvar))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(id_cliente_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data_inst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(data_ped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo)
                    .addComponent(editar)
                    .addComponent(excluir)
                    .addComponent(salvar_edit))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(602, 602, 602)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(600, 20, 553, 414);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        //variável que recebe a primary key do BD
        int cod;
        //condição que verifica o tipo do botão (nesse caso, botão novo)
        if (acao == 1) {

            try {
                //armazenamento do que foi digitado nos campos em váriáveis
                String id_prod = id_produto_pedido.getText().trim();
                String id_cli = id_cliente_pedido.getText().trim();
                String dataI = data_inst.getText().trim();
                String dataP = data_ped.getText().trim();

                // verifica se os campos estão nulos
                if (id_prod != null && !id_prod.isEmpty() && id_cli != null && !id_cli.isEmpty() && dataI != null && !dataI.isEmpty() && dataP != null && !dataP.isEmpty()) {
                    //passando por parametros para a função que insere os clientes no BD
                    int id_p = Integer.parseInt(id_prod);
                    int id_c = Integer.parseInt(id_cli);
                    ins.inserePedido(conexao, id_p, id_c, dataI, dataP);
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

                if (cod_ped != null && !cod_ped.isEmpty()) {

                    int cod1 = Integer.parseInt(cod_ped);
                    String id_prod = id_produto_pedido.getText().trim();
                    String id_cli = id_cliente_pedido.getText().trim();
                    String dataI = data_inst.getText().trim();
                    String dataP = data_ped.getText().trim();

                    int id_p = Integer.parseInt(id_prod);
                    int id_c = Integer.parseInt(id_cli);

                    edit.editaPedido(conexao, id_p, id_c, dataI, dataP, cod1);

                    JOptionPane.showMessageDialog(null, "Pedido Editado com sucesso");
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

                cod_ped = jcod.getText().trim();

                if (cod_ped != null && !cod_ped.isEmpty()) {

                    int cod1 = Integer.parseInt(cod_ped);
                    del.deletaPedido(conexao, cod1);

                    JOptionPane.showMessageDialog(null, "Socio deletado com sucesso");
                    salvar();
                } else {
                    JOptionPane.showMessageDialog(null, "Favor Prencher o campo CNPJ! ");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar!" + e);
            }

        }

    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        novo();
        acao = 1;
    }//GEN-LAST:event_novoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        editar();
        acao = 2;
    }//GEN-LAST:event_editarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        excluir();
        acao = 3;
    }//GEN-LAST:event_excluirActionPerformed

    private void salvar_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_editActionPerformed
        //configuralçao da segunda tela do editar que realiza a edição no BD
        cod_ped = jcod.getText().trim();
        JOptionPane.showMessageDialog(null, "Favor Inserir dados do Socio!");
        editarSegundaTela();
    }//GEN-LAST:event_salvar_editActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField data_inst;
    private javax.swing.JTextField data_ped;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField id_cliente_pedido;
    private javax.swing.JTextField id_produto_pedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jcod;
    private javax.swing.JButton novo;
    private javax.swing.JButton salvar;
    private javax.swing.JButton salvar_edit;
    // End of variables declaration//GEN-END:variables

    public void novo() {
        jcod.setEnabled(false);
        id_produto_pedido.setEnabled(true);
        id_cliente_pedido.setEnabled(true);
        data_inst.setEnabled(true);
        data_ped.setEnabled(true);
        salvar.setEnabled(true);
        excluir.setEnabled(true);
        cancelar.setEnabled(true);
        salvar_edit.setEnabled(false);
        id_produto_pedido.setText("");
        id_cliente_pedido.setText("");
        data_inst.setText("");
        data_ped.setText("");

    }

    public void editar() {
        jcod.setEnabled(true);
        id_produto_pedido.setEnabled(false);
        id_cliente_pedido.setEnabled(false);
        data_inst.setEnabled(false);
        data_ped.setEnabled(false);
        salvar.setEnabled(false);
        excluir.setEnabled(true);
        cancelar.setEnabled(true);
        salvar_edit.setEnabled(true);
    }

    public void editarSegundaTela() {

        jcod.setEnabled(false);
        id_produto_pedido.setEnabled(true);
        id_cliente_pedido.setEnabled(true);
        data_inst.setEnabled(true);
        data_ped.setEnabled(true);
        salvar.setEnabled(true);
        excluir.setEnabled(true);
        cancelar.setEnabled(true);
        salvar_edit.setEnabled(false);
    }

    public void excluir() {
        jcod.setEnabled(true);
        id_produto_pedido.setEnabled(false);
        id_cliente_pedido.setEnabled(false);
        data_inst.setEnabled(false);
        data_ped.setEnabled(false);
        salvar.setEnabled(true);
        excluir.setEnabled(true);
        cancelar.setEnabled(true);
        salvar_edit.setEnabled(false);
        id_produto_pedido.setText("");
        id_cliente_pedido.setText("");
        data_inst.setText("");
        data_ped.setText("");
    }

    public void cancelar() {
        jcod.setEnabled(false);
        id_produto_pedido.setEnabled(false);
        id_cliente_pedido.setEnabled(false);
        data_inst.setEnabled(false);
        data_ped.setEnabled(false);
        salvar.setEnabled(false);
        excluir.setEnabled(true);
        cancelar.setEnabled(false);
        salvar_edit.setEnabled(false);
        id_produto_pedido.setText("");
        id_cliente_pedido.setText("");
        data_inst.setText("");
        data_ped.setText("");

    }

    public void salvar() {
        jcod.setEnabled(false);
        id_produto_pedido.setEnabled(false);
        id_cliente_pedido.setEnabled(false);
        data_inst.setEnabled(false);
        data_ped.setEnabled(false);
        salvar.setEnabled(false);
        excluir.setEnabled(true);
        cancelar.setEnabled(false);
        salvar_edit.setEnabled(false);

    }

}