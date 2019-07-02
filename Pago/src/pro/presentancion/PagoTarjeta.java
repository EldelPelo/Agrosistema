package pro.presentancion;

import javax.swing.JOptionPane;

import pro.cableado.IPago;

public class PagoTarjeta implements IPago{

	@Override
	public void capturarPago() {
		JOptionPane.showMessageDialog(null, "capturarPago");
		JOptionPane.showMessageDialog(null, "capturarPago");
	}

}
