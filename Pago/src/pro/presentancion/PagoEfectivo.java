package pro.presentancion;

import javax.swing.JOptionPane;

import pro.cableado.IPago;

public class PagoEfectivo implements IPago{

	@Override
	public void capturarPago() {
		JOptionPane.showMessageDialog(null, "capturarPago");
	}

}
