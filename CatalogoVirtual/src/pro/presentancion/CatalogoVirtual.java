package pro.presentancion;

import javax.swing.JOptionPane;

import pro.cableado.ICatalogo;

public class CatalogoVirtual implements ICatalogo{

	@Override
	public void publicarInsumos() {
		JOptionPane.showMessageDialog(null, "publicarInsumos");
		
	}

}
