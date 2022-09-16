
package Projeto;

import java.sql.*;

/* ****************************************************************

Classe que armazena todos os metodos que inserem informacoes no BD

*******************************************************************/
public class InsereBD {

    
    public void insereProd(Connection con, double vp, String desc) {
        try {

            
            String sql = "INSERT INTO produto(id_produto, valor_produto, desc_produto)" + "VALUES(null,?,?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setDouble(1, vp);
            
            pstm.setString(2, desc);
            
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }
    }

    
    public void insereSocio(Connection con, String nome, String cnpj) {
        try {
            String sql = "INSERT INTO socios(id_socio, nome_socio, cnpj_socio)" + "VALUES(null,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, nome);
            pstm.setString(2, cnpj);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }
    }

    public void insereCliente(Connection con, String nome, String cnpj, String end) {
        try {
            String sql = "INSERT INTO cliente(nome_cliente, cnpj_cliente, endereco_cliente)" + "VALUES(?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, nome);
            pstm.setString(2, cnpj);
            pstm.setString(3, end);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

    }

    public void inserePedido(Connection con, int id_prod_pedido, int id_cliente_pedido, String data_inst, String data_ped) {
        try {
            String sql = "INSERT INTO pedido (id_pedido, id_produto, id_cliente, data_instalacao, data_pedido)" + "VALUES(null,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_prod_pedido);
            pstm.setInt(2, id_cliente_pedido);
            pstm.setString(3, data_inst);
            pstm.setString(4, data_ped);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

    }

    public void insereNf(Connection con, String nf, int id_pedido_nf) {
        try {
            String sql = "INSERT INTO nota_fiscal (numero_nf, id_pedido)" + "VALUES(?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, nf);
            pstm.setInt(2, id_pedido_nf);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

    }

    public void insereContasReceber(Connection con, int id_pedido_cr, String dt) {
        try {
            String sql = "INSERT INTO contas_receber (id_contas_receber, id_pedido, data_faturamento)" + "VALUES(null,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_pedido_cr);
            pstm.setString(2, dt);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

    }

    public void insereContasPagar(Connection con, double aluguel, double luz, double internet, double telefonia, double tributos, String date) {
        try {
            String sql = "INSERT INTO contas_pagar (id_contas_pagar, aluguel, luz, internet, telefonia, tributos, mes_ref)" + "VALUES(null,?,?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setDouble(1, aluguel);
            pstm.setDouble(2, luz);
            pstm.setDouble(3, internet);
            pstm.setDouble(4, telefonia);
            pstm.setDouble(5, tributos);
            pstm.setString(6, date);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

    }

    public double retornaContasReceber(Connection con, String mes_ref) {

        try {
            String sql1 = "select sum(pr.valor_produto) as total_contas_receber from produto pr, pedido pe, contas_receber c\n"
                    + "where c.id_pedido = pe.id_pedido and pr.id_produto = pe.id_produto and pe.data_pedido like '%"+mes_ref+"%'";
            Statement stml = con.createStatement();
            ResultSet result1 = stml.executeQuery(sql1);
            if (result1.next()) {
                double entrada = result1.getDouble("total_contas_receber");
                return entrada;

            }

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

        return 0;

    }

    public double retornaContasPagar(Connection con, String mes_ref) {

        try {
            
            String sql2 = "select  SUM(aluguel + luz + internet + telefonia + tributos) as total_contas_pagar from contas_pagar where mes_ref like '%"+mes_ref+"%'";
            Statement stml = con.prepareStatement(sql2);
            ResultSet result2 = stml.executeQuery(sql2);
            
            if (result2.next()) {
                double saida = result2.getDouble("total_contas_pagar");

                return saida;
            } else {

                return 0;
            }

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

        return 0;

    }

    public void insereSalario(Connection con, int socio, String mes_ref) {

        try {
            InsereBD ins = new InsereBD();
            double salario = (ins.retornaContasReceber(con,mes_ref) - ins.retornaContasPagar(con,mes_ref)) / 3;

            String sql3 = "INSERT INTO salario(id_salario, id_socio, salario, mes_ref_salario)" + "VALUES(null,?,?,?)";
            PreparedStatement pstm3 = con.prepareStatement(sql3);

            pstm3.setInt(1, socio);
            pstm3.setDouble(2, salario);
            pstm3.setString(3, mes_ref);
            pstm3.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }
    }

    public int retornaPrimaryKey(Connection con) {
        try {

            PreparedStatement pstmAux = con.prepareStatement("Select @@identity");
            ResultSet rs = pstmAux.executeQuery();
            int codigo = 0;

            if (rs != null) {
                rs.next();
                codigo = rs.getInt(1);
                return codigo;
            }

        } catch (Exception e) {
            System.out.println("Erro ao inserir!" + e);
        }

        return 0;

    }

}
