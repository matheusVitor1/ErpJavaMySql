package Projeto;

import java.sql.*;

/* *********************************************************************

Classe que armazena todos os metodos que fazem consulta ao BD

Metodos com "Sh" na frente do nome são responsaveis pelo campo Pesquisa
Nas interfaces de consulta Sh = Search

************************************************************************/
public class ConsultarBD {

    public static ResultSet consultaLogin(Connection con) throws SQLException {
        Statement stml = con.createStatement();

        ResultSet rs = stml.executeQuery("select usuario, senha from login ");
        while (rs.next()) {
            return rs;
        }
        return rs;
    }

    public static ResultSet consultaCliente(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from cliente");

        return rs;
    }

    public static ResultSet consultaClienteSh(Connection con, String cnpj) throws SQLException {
        Statement stml = con.createStatement();

        ResultSet rs = stml.executeQuery("select * from cliente where cnpj_cliente = '" + cnpj + "'");
        return rs;
    }

    public static ResultSet consultaProd(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from produto");

        return rs;
    }

    public static ResultSet consultaProdSh(Connection con, int id) throws SQLException {
        Statement stml = con.createStatement();

        ResultSet rs = stml.executeQuery("select * from produto where id_produto = " + id);
        return rs;

    }

    public static ResultSet consultaSocio(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from socios");

        return rs;
    }

    public static ResultSet consultaSocioSh(Connection con, String cnpj) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from socios where cnpj_socio ='" + cnpj + "' ");

        return rs;
    }

    public static ResultSet consultaPedido(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from pedido");

        return rs;
    }

    public static ResultSet consultaPedidoSh(Connection con, int id_ped) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from pedido where id_pedido = '" + id_ped + "'");

        return rs;
    }

    public static ResultSet consultaNf(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from nota_fiscal");

        return rs;
    }

    public static ResultSet consultaNfSh(Connection con, String nf) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from nota_fiscal where numero_nf = '" + nf + "'");

        return rs;
    }

    public static ResultSet consultaCr(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from contas_receber");

        return rs;
    }

    public static ResultSet consultaCrSh(Connection con, int id_cr) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from contas_receber where id_contas_receber = '" + id_cr + "'");

        return rs;
    }

    public static ResultSet consultaContasPagar(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from contas_pagar");

        return rs;
    }

    public static ResultSet consultaContasPagarSh(Connection con, int id_cp) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from contas_receber where id_contas_pagar = '" + id_cp + "'");

        return rs;
    }

    public static ResultSet consultaSalario(Connection con) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from salario");

        return rs;
    }

    public static ResultSet consultaSalarioSh(Connection con, int id_sal) throws SQLException {
        Statement stml = con.createStatement();
        ResultSet rs = stml.executeQuery("select * from salario where id_salario = '"+id_sal+"'");

        return rs;
    }
    
        public double retornaValorProduto(Connection con, int idProd) {

        try {
            String sql1 = "select pr.valor_produto as total_contas_receber from produto pr, pedido pe, contas_receber c\n"
                    + "where c.id_pedido = pe.id_pedido and pr.id_produto = pe.id_produto and pe.id_pedido = '"+idProd+"'";
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

}
