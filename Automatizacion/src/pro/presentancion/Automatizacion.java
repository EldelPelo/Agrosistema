package pro.presentancion;

import javax.swing.JOptionPane;

import pro.cableado.IAutomatizacion;

public class Automatizacion implements IAutomatizacion{

	@Override
	public void controlarHumedad() {
		JOptionPane.showMessageDialog(null, "controlarHumedar");		
	}

	@Override
	public void controlarLuz() {
		JOptionPane.showMessageDialog(null, "controlarLuz");		
	}

	@Override
	public void controlarpH() {
		JOptionPane.showMessageDialog(null, "controlarpH");				
	}
	
}
