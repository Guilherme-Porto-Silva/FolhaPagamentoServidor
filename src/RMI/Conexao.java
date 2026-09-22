package RMI;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public Connection link;

    public void conectar () {

        try {
            Class.forName(System.getenv("RMI_CLASS_NAME"));

            String url = System.getenv("RMI_URL");

            String usuario = System.getenv("RMI_USER");

            String senha = System.getenv("RMI_PASSWORD");

            link = DriverManager.getConnection(url, usuario, senha);
        }

        catch (Exception variaveisAmbienteNaoDeclaradas) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost/rmi_guigui_chan";

                String usuario = "root";

                String senha = "123456";

                link = DriverManager.getConnection(url, usuario, senha);
            }

            catch (Exception e) {

                System.out.println("\nNão achei a classe.");

                System.out.println(e.getMessage());
            }
        }
    }
}