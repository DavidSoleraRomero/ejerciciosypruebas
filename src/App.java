/* Programa probando múltiples cosas */

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/alumnos";
        String usuario = "david";
        String clave = "davidsolera";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection _conn = DriverManager.getConnection(url, usuario, clave);
            _conn.close();
        } catch (Exception e) {
            System.out.println("Error en la conexión con la BBDD");
            e.printStackTrace();
        }
    }
}
