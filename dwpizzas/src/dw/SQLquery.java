package dw;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruan-Alex
 */
public class SQLquery 
{
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1/dw";
    final private String usuario = "root";
    final private String senha = "root";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;

    public boolean conecta()
    {
        boolean result = true;
        try
        {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Banco de Dados Conectado!");
        }
        catch(ClassNotFoundException Driver)
        {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
            result = false;
        }
        catch(SQLException Fonte)
        {
            JOptionPane.showMessageDialog(null, "Erro na conexão\n com a fonte de dados: \n" + Fonte);
            result = false;
        }
        return result;
    }
    
}