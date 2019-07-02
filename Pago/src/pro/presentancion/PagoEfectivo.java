package pro.presentancion;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import con.conexion.Conexion;
import pro.cableado.IPago;

public class PagoEfectivo implements IPago{
	
	@Override
	public void capturarPago(String ID_Producto) {
		Connection con = Conexion.obtenerConexion();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT Cantidad_Disponible FROM Insumos WHERE ID_Producto='"+ID_Producto+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
