package pro.presentancion;

import pro.cableado.IPago;

public class CompraEfectivo extends Compra{

	@Override
	public IPago crearCompra() {
		return new PagoEfectivo();
	}
}
