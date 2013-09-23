package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public static Connection getConexao() {

        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/SIGEN", "postgres", "senha");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            throw new RuntimeException(ex);
        }
    }
}
