package pro.presentancion;

import javax.swing.JOptionPane;

import pro.cableado.IMonitoreo;

public class Monitoreo implements IMonitoreo{

	@Override
	public void medirHumedad() {
		JOptionPane.showMessageDialog(null, "medirHumedad");		
	}

	@Override
	public void medirLuz() {
		JOptionPane.showMessageDialog(null, "medirLuz");		
	}

	@Override
	public void medirpH() {
		JOptionPane.showMessageDialog(null, "medirpH");		
	}

}
