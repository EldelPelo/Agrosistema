package pro.presentancion;

import pro.cableado.IPago;

public class CompraTarjeta extends Compra{

	@Override
	public IPago crearCompra() {
		return new PagoTarjeta();
	}

}
