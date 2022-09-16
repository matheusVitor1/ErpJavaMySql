package Projeto;

import java.sql.*;

/* ****************************************************************

Classe que armazena todos os metodos que fazem a exclusao de dados no BD

*******************************************************************/

public class DeletaBD {

    public void deletaCliente(Connection con, String cnpj) {
        try {
            String sql = "delete from cliente where cnpj_cliente = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, cnpj);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }

    public void deletaCp(Connection con, int id_cp) {
        try {
            String sql = "delete from contas_pagar where mes_ref = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_cp);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }

    public void deletaProd(Connection con, int id_prod) {
        try {
            String sql = "delete from produtos where id_produto = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_prod);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }

    public void deletaSocio(Connection con, String cnpj) {
        try {
            String sql = "delete from socios where cnpj_socio = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, cnpj);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }

    public void deletaPedido(Connection con, int id_p) {
        try {
            String sql = "delete from pedido where id_pedido = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_p);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }

    public void deletaNf(Connection con, int id_nf) {
        try {
            String sql = "delete from nota_fiscal where id_nf = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_nf);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }

    public void deletaCr(Connection con, int id_cr) {
        try {
            String sql = "delete from contas_receber where id_contas_receber = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_cr);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }
    public void deletaSalario(Connection con, int id_cr) {
        try {
            String sql = "delete from salario where id_salario = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_cr);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Deletar!" + e);
        }
    }
}
