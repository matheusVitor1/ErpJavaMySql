package Projeto;

import java.sql.*;

/* ****************************************************************

Classe que armazena todos os metodos que fazem edicoes no BD

*******************************************************************/

public class EditaBD {

    public void editaCliente(Connection con, String nome, String cnpj, String end, int id_cliente) {
        try {
            String sql = "update cliente  set nome_cliente = ?, cnpj_cliente = ?, endereco_cliente = ? where id_cliente = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, nome);
            pstm.setString(2, cnpj);
            pstm.setString(3, end);
            pstm.setInt(4, id_cliente);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

    public void editaCp(Connection con, double va, double vl, double vi, double vtel, double vtri, String mes_ref, int id_cp) {
        try {
            String sql = "update contas_pagar  set aluguel = ?, luz = ?, internet = ?, telefonia = ?, tributos = ?, mes_ref = ? where id_contas_pagar = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setDouble(1, va);
            pstm.setDouble(2, vl);
            pstm.setDouble(3, vi);
            pstm.setDouble(4, vtel);
            pstm.setDouble(5, vtri);
            pstm.setString(6, mes_ref);
            pstm.setDouble(7, id_cp);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

    public void editaProd(Connection con, double vp, String desc, int id_prod) {
        try {
            String sql = "update produto  set valor_produto = ?, desc_produto = ? where id_produto = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setDouble(1, vp);
            pstm.setString(2, desc);
            pstm.setInt(3, id_prod);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

    public void editaSocio(Connection con, String nome, String cnpj, int id_socio) {
        try {
            String sql = "update socios  set nome_socio = ?, cnpj_socio = ? where id_socio = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, nome);
            pstm.setString(2, cnpj);
            pstm.setInt(3, id_socio);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

    public void editaPedido(Connection con, int id_prod, int id_cli, String dataI, String dataP, int id_ped) {
        try {
            String sql = "update pedido  set id_produto = ?, id_cliente = ?, data_instalacao = ?, data_pedido = ? where id_pedido = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_prod);
            pstm.setInt(2, id_cli);
            pstm.setString(3, dataI);
            pstm.setString(4, dataP);
            pstm.setInt(5, id_ped);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

    public void editaNf(Connection con, String nf, int idPed, int id_nf) {
        try {
            String sql = "update nota_fiscal  set numero_nf = ?, id_pedido = ? where id_nf = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, nf);
            pstm.setInt(2, idPed);
            pstm.setInt(3, id_nf);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

    public void editaCr(Connection con, String dt, int idPed, int id_cr) {
        try {
            String sql = "update contas_receber set data_faturamento = ?, id_pedido = ? where id_contas_receber = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, dt);
            pstm.setInt(2, idPed);
            pstm.setInt(3, id_cr);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

    public void editaSalario(Connection con, int id_socio, String mes_ref, int id_cr) {
        try {
            String sql = "update salario set id_socio = ?, mes_ref_salario where id_salario = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, id_socio);
            pstm.setString(2, mes_ref);
            pstm.setInt(3, id_cr);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Erro ao Editar!" + e);
        }
    }

}
