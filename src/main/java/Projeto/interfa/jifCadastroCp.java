package Projeto.interfa;

import Projeto.ConectarBD;
import Projeto.DeletaBD;
import Projeto.EditaBD;
import Projeto.InsereBD;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class jifCadastroCp extends javax.swing.JInternalFrame {

    //instanciamento das classes necessárias
    InsereBD ins = new InsereBD();
    ConectarBD con = new ConectarBD();
    DeletaBD del = new DeletaBD();
    EditaBD edit = new EditaBD();
    Connection conexao = con.connectionMySql();
    // variável para auxiliar a identificação dos botões (novo, editar, excluir)
    int acao;
    // variável para auxiliar a edição de contas a pagar
    String codCp = "";

    public jifCadastroCp() {
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
        valor_aluguel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        valor_luz = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valor_internet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        valor_tel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valor_tributos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mes_ref = new javax.swing.JTextField();
        salvar_cp = new javax.swing.JButton();
        cancelar_cp = new javax.swing.JButton();
        novo_cp = new javax.swing.JButton();
        editar_cp = new javax.swing.JButton();
        excluir_cp = new javax.swing.JButton();
        salvar_edit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcod = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro Contas a Pagar");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(13, 36, 125));
        jLabel1.setText("Valor Aluguel");

        valor_aluguel.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(13, 36, 125));
        jLabel2.setText("Valor Luz");

        valor_luz.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(13, 36, 125));
        jLabel3.setText("Valor Internet");

        valor_internet.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(13, 36, 125));
        jLabel4.setText("Valor Telefonia");

        valor_tel.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(13, 36, 125));
        jLabel5.setText("Valor Tributos");

        valor_tributos.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(13, 36, 125));
        jLabel6.setText("Mes e ano de Referência");

        mes_ref.setEnabled(false);

        salvar_cp.setBackground(new java.awt.Color(13, 36, 125));
        salvar_cp.setForeground(new java.awt.Color(255, 255, 255));
        salvar_cp.setText("Salvar");
        salvar_cp.setEnabled(false);
        salvar_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_cpActionPerformed(evt);
            }
        });

        cancelar_cp.setBackground(new java.awt.Color(13, 36, 125));
        cancelar_cp.setForeground(new java.awt.Color(255, 255, 255));
        cancelar_cp.setText("Cancelar");
        cancelar_cp.setEnabled(false);

        novo_cp.setBackground(new java.awt.Color(13, 36, 125));
        novo_cp.setForeground(new java.awt.Color(255, 255, 255));
        novo_cp.setText("Novo");
        novo_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_cpActionPerformed(evt);
            }
        });

        editar_cp.setBackground(new java.awt.Color(13, 36, 125));
        editar_cp.setForeground(new java.awt.Color(255, 255, 255));
        editar_cp.setText("Editar");
        editar_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_cpActionPerformed(evt);
            }
        });

        excluir_cp.setBackground(new java.awt.Color(13, 36, 125));
        excluir_cp.setForeground(new java.awt.Color(255, 255, 255));
        excluir_cp.setText("Excluir");
        excluir_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_cpActionPerformed(evt);
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

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Cod");

        jcod.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(valor_luz, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(valor_aluguel)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valor_internet, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(valor_tributos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelar_cp)
                                    .addComponent(salvar_cp)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(valor_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(mes_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novo_cp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editar_cp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir_cp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvar_edit)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor_aluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_internet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_tributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salvar_cp)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(cancelar_cp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor_luz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(novo_cp)
                            .addComponent(editar_cp)
                            .addComponent(excluir_cp)
                            .addComponent(salvar_edit)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
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

        setBounds(600, 20, 646, 261);
    }// </editor-fold>//GEN-END:initComponents

    private void novo_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_cpActionPerformed

        //chama o método que habilita os campos para cadastro
        novo();
        //variável auxiliar para identificar qual botão estamos utilizando
        acao = 1;
    }//GEN-LAST:event_novo_cpActionPerformed

    private void editar_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_cpActionPerformed

        editar();
        acao = 2;
    }//GEN-LAST:event_editar_cpActionPerformed

    private void excluir_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_cpActionPerformed

        excluir();
        acao = 3;
    }//GEN-LAST:event_excluir_cpActionPerformed

    private void salvar_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_cpActionPerformed

        int cod;
        // verifica qual botão foi selecionado
        if (acao == 1) {
            try {
                //armazena os valores digitados nos campos do formulário
                String aluguel = valor_aluguel.getText().trim();
                String luz = valor_luz.getText().trim();
                String net = valor_internet.getText().trim();
                String tel = valor_tel.getText().trim();
                String tri = valor_tributos.getText().trim();
                String mes = mes_ref.getText().trim();

                //coverte os valores de string para Double
                double aluguel1 = Double.parseDouble(aluguel);
                double luz1 = Double.parseDouble(luz);
                double net1 = Double.parseDouble(net);
                double tel1 = Double.parseDouble(tel);
                double tri1 = Double.parseDouble(tri);

                // verifica se algum campo ficou vazio
                if (aluguel != null && !aluguel.isEmpty() && luz != null && !luz.isEmpty() && net != null && !net.isEmpty()
                        && tel != null && !tel.isEmpty() && tri != null && !tri.isEmpty() && mes != null && !mes.isEmpty()) {

                    // chama a função que insere os dados no BD e passa os valores armazenados como parâmetro
                    ins.insereContasPagar(conexao, aluguel1, luz1, tri1, tel1, tri1, mes);
                    //variável que recebe a primary key do CLiente
                    cod = ins.retornaPrimaryKey(conexao);
                    //Insere na interface gráfica o valor da primary key
                    jcod.setText(String.valueOf(cod));
                    JOptionPane.showMessageDialog(null, "Inserido com sucesso");

                    // chama o método que desabilita os campos de texto e alguns botões
                    salvar();

                } else {
                    JOptionPane.showMessageDialog(null, "Favor Prencher todos os Campos");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir!" + e);
            }

            // os códigos seguintes seguem o padrão do anterior
        } else if (acao == 2) {

            try {

                if (codCp != null && !codCp.isEmpty()) {
                    int cod1 = Integer.parseInt(codCp);

                    String aluguel = valor_aluguel.getText().trim();
                    String luz = valor_luz.getText().trim();
                    String net = valor_internet.getText().trim();
                    String tel = valor_tel.getText().trim();
                    String tri = valor_tributos.getText().trim();
                    String mes = mes_ref.getText().trim();

                    double aluguel1 = Double.parseDouble(aluguel);
                    double luz1 = Double.parseDouble(luz);
                    double net1 = Double.parseDouble(net);
                    double tel1 = Double.parseDouble(tel);
                    double tri1 = Double.parseDouble(tri);

                    if (aluguel != null && !aluguel.isEmpty() && luz != null && !luz.isEmpty() && net != null && !net.isEmpty()
                            && tel != null && !tel.isEmpty() && tri != null && !tri.isEmpty()) {

                        edit.editaCp(conexao, aluguel1, luz1, net1, tel1, tri1, mes, cod1);
                        JOptionPane.showMessageDialog(null, "Editado com sucesso");
                        salvar();

                    } else {
                        JOptionPane.showMessageDialog(null, "Favor Prencher todos os Campos");

                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Editar!" + e);
            }

        } else if (acao == 3) {

            try {

                if (codCp != null && !codCp.isEmpty()) {

                    int cod1 = Integer.parseInt(codCp);
                    del.deletaCp(conexao, cod1);

                    JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
                    salvar();
                } else {
                    JOptionPane.showMessageDialog(null, "Favor Prencher o campo CNPJ! ");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar!" + e);
            }
        }
    }//GEN-LAST:event_salvar_cpActionPerformed

    private void salvar_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_editActionPerformed

        codCp = jcod.getText().trim();
        JOptionPane.showMessageDialog(null, "Favor Inserir dados das Contas!");
        editarSegundaTela();
    }//GEN-LAST:event_salvar_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar_cp;
    private javax.swing.JButton editar_cp;
    private javax.swing.JButton excluir_cp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jcod;
    private javax.swing.JTextField mes_ref;
    private javax.swing.JButton novo_cp;
    private javax.swing.JButton salvar_cp;
    private javax.swing.JButton salvar_edit;
    private javax.swing.JTextField valor_aluguel;
    private javax.swing.JTextField valor_internet;
    private javax.swing.JTextField valor_luz;
    private javax.swing.JTextField valor_tel;
    private javax.swing.JTextField valor_tributos;
    // End of variables declaration//GEN-END:variables

    public void novo() {
        jcod.setEnabled(false);
        cancelar_cp.setEnabled(true);
        salvar_cp.setEnabled(true);
        salvar_edit.setEnabled(false);
        valor_aluguel.setEnabled(true);
        valor_internet.setEnabled(true);
        valor_luz.setEnabled(true);
        valor_tel.setEnabled(true);
        valor_tributos.setEnabled(true);
        mes_ref.setEnabled(true);
        valor_aluguel.setText("");
        valor_internet.setText("");
        valor_luz.setText("");
        valor_tel.setText("");
        valor_tributos.setText("");
        mes_ref.setText("");
    }

    public void editar() {
        jcod.setEnabled(true);
        cancelar_cp.setEnabled(true);
        editar_cp.setEnabled(true);
        excluir_cp.setEnabled(true);
        salvar_cp.setEnabled(false);
        cancelar_cp.setEnabled(false);
        salvar_edit.setEnabled(true);
        valor_aluguel.setEnabled(false);
        valor_internet.setEnabled(false);
        valor_luz.setEnabled(false);
        valor_tel.setEnabled(false);
        valor_tributos.setEnabled(false);
        mes_ref.setEnabled(false);
        valor_aluguel.setText("");
        valor_internet.setText("");
        valor_luz.setText("");
        valor_tel.setText("");
        valor_tributos.setText("");
        mes_ref.setText("");
    }

    public void editarSegundaTela() {
        jcod.setEnabled(false);
        cancelar_cp.setEnabled(true);
        editar_cp.setEnabled(true);
        excluir_cp.setEnabled(true);
        salvar_cp.setEnabled(true);
        cancelar_cp.setEnabled(true);
        salvar_edit.setEnabled(false);
        valor_aluguel.setEnabled(true);
        valor_internet.setEnabled(true);
        valor_luz.setEnabled(true);
        valor_tel.setEnabled(true);
        valor_tributos.setEnabled(true);
        mes_ref.setEnabled(true);

    }

    public void excluir() {
        jcod.setEnabled(true);
        cancelar_cp.setEnabled(true);
        editar_cp.setEnabled(true);
        excluir_cp.setEnabled(true);
        salvar_cp.setEnabled(true);

        salvar_edit.setEnabled(false);
        valor_aluguel.setEnabled(false);
        valor_internet.setEnabled(false);
        valor_luz.setEnabled(false);
        valor_tel.setEnabled(false);
        valor_tributos.setEnabled(false);
        mes_ref.setEnabled(false);
        valor_aluguel.setText("");
        valor_internet.setText("");
        valor_luz.setText("");
        valor_tel.setText("");
        valor_tributos.setText("");
        mes_ref.setText("");
    }

    public void cancelar() {

        editar_cp.setEnabled(true);
        excluir_cp.setEnabled(true);
        novo_cp.setEnabled(true);
        salvar_cp.setEnabled(false);
        cancelar_cp.setEnabled(false);
        salvar_edit.setEnabled(false);
        valor_aluguel.setEnabled(false);
        valor_internet.setEnabled(false);
        valor_luz.setEnabled(false);
        valor_tel.setEnabled(false);
        valor_tributos.setEnabled(false);
        mes_ref.setEnabled(false);
        valor_aluguel.setText("");
        valor_internet.setText("");
        valor_luz.setText("");
        valor_tel.setText("");
        valor_tributos.setText("");
        mes_ref.setText("");
    }

    public void salvar() {

        editar_cp.setEnabled(true);
        excluir_cp.setEnabled(true);
        novo_cp.setEnabled(true);
        salvar_cp.setEnabled(false);
        cancelar_cp.setEnabled(false);
        salvar_edit.setEnabled(false);
        valor_aluguel.setEnabled(false);
        valor_internet.setEnabled(false);
        valor_luz.setEnabled(false);
        valor_tel.setEnabled(false);
        valor_tributos.setEnabled(false);
        mes_ref.setEnabled(false);

    }

}
