package pro.presentancion;

import javax.swing.JOptionPane;

import pro.cableado.IGestionInsumos;

public class GestionInsumos implements IGestionInsumos{

	@Override
	public void actualizarInsumos() {
		JOptionPane.showMessageDialog(null, "actualizarInsumos");		
	}

}
