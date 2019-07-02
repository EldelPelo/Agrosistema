package con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/Agrosistema";
	private static final String USER = "postgres";
	private static final String PASS = "postgres";
	private static Connection conexion = null;
	public static Connection obteneConexion() {
		try {
			if(conexion==null) {
				Class.forName("org.postgresql.Driver");
				conexion = DriverManager.getConnection(URL, USER, PASS);
				System.out.println("Conexion exitosa.");
			}
		}catch (Exception e) {
			System.out.println("No se pudo conectar a la base de datos.");
		}
		return conexion;
	}
	private static void cargarDriver() {
		try {
			Class.forName("org.postgresql.Driver");
		}catch (Exception e) {
			System.out.println("Fallo al cargar el driver org.postgresql.Driver");
		}
	}
	private static void cargarConexion() {
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
        }
        catch (SQLException e) {
        	System.out.println("Fallo al conectarse a la base de datos");         
        }
	}
	public static Connection obtenerConexion() {
        if (conexion == null) {
            cargarDriver();
            cargarConexion();
            System.out.println("Conectando...");
        }
        return conexion;
	}
	public static void cerrarConexion() {
        if (conexion == null) {
            System.out.println("No existe conexion");
        }
        else {
            try {
                conexion.close();
                conexion = null;
                System.out.println("Desconectando...");
            }
            catch (SQLException e) {
                System.out.println("Fallo al cerrar la conexion");
            }
        }
	}
}
