package pro.main;

import java.sql.Connection;
import java.sql.SQLException;

import con.conexion.Conexion;
import pro.cableado.IAutomatizacion;
import pro.cableado.IGestionInsumos;
import pro.cableado.IPago;
import pro.cableado.IGestionPlantas;
import pro.cableado.IMonitoreo;
import pro.cableado.ICatalogo;

import pro.utilidades.Cargador;

public class Agrosistema {

	public static void main(String[] args) {
		Cargador cb=new Cargador("back", ClassLoader.getSystemClassLoader());
		Class cls = null;
		try {
			System.out.println("Entro back");
			cls=cb.cargarUnaClaseDesdeSuDirectorio(pro.cableado.IGestionInsumos.class.getName());
			if(cls!=null) {
				System.out.println("GesIn");
				IGestionInsumos igi = (IGestionInsumos)cls.newInstance();
				igi.actualizarInsumos();
			}
			cls=cb.cargarUnaClaseDesdeSuDirectorio(pro.cableado.IGestionPlantas.class.getName());
			if(cls!=null) {
				System.out.println("GesPla");
				IGestionPlantas igp= (IGestionPlantas)cls.newInstance();
				igp.actualizarInformacion();
			}
			cls=cb.cargarUnaClaseDesdeSuDirectorio(pro.cableado.IPago.class.getName());
			if(cls!=null) {
				System.out.println("Pag");
				IPago ir = (IPago)cls.newInstance();
				ir.capturarPago();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		Cargador cf=new Cargador("front", ClassLoader.getSystemClassLoader());
		try {
			cls=cf.cargarUnaClaseDesdeSuDirectorio(pro.cableado.IMonitoreo.class.getName());
			System.out.println("Entro front");
			if(cls!=null) {
				IMonitoreo im = (IMonitoreo)cls.newInstance();
				im.medirLuz();
				im.medirHumedad();
				im.medirpH();
			}
			cls=cf.cargarUnaClaseDesdeSuDirectorio(pro.cableado.IAutomatizacion.class.getName());
			if(cls!=null) {
				IAutomatizacion ia = (IAutomatizacion)cls.newInstance();
				ia.controlarLuz();
				ia.controlarpH();
				ia.controlarHumedad();
			}
			cls=cf.cargarUnaClaseDesdeSuDirectorio(pro.cableado.ICatalogo.class.getName());
			if(cls!=null) {
				ICatalogo ip = (ICatalogo)cls.newInstance();
				ip.publicarInsumos();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}