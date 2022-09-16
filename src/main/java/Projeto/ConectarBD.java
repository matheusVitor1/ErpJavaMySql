
package Projeto;
import java.sql.*;

public class ConectarBD {
    
    private static Connection conexao_MySql = null;
    
    private static String localBD = "localhost";
    
    private static String LINK = "jdbc:mysql://" + localBD + ":3306/vmr";
    
    private static final String usuario = "root";
    
    private static final String senha = "";
    
        public Connection connectionMySql() {

        try {
            conexao_MySql = DriverManager.getConnection(LINK, usuario, senha);
            System.out.println("conexão OK");

        } catch (SQLException e) {
            throw new RuntimeException("Ocorreu um problema na conexão com o BD", e);

        }
        return conexao_MySql;

    }   
    
 
   
    public void closeConnectionMySql (Connection con) {
        
            try{
                if (con != null){
                    con.close();
                    System.out.println("Fechamento OK");
                }
            } catch (SQLException e){
                throw new RuntimeException("Ocorreu um problema para encerrar a conexão com o BD", e);
            }
        }
    
    
    
}
