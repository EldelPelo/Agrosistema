package pro.presentancion;

import javax.swing.JOptionPane;

import pro.cableado.IGestionPlantas;

public class GestionPlantas implements IGestionPlantas{

	@Override
	public void actualizarInformacion() {
		JOptionPane.showMessageDialog(null, "actualizarInformacion");		
	}

}
