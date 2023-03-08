package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coche {

	private List<Trayecto> conduccion;

	public Coche(List<Trayecto> conduccion) {
		super();
		this.conduccion = conduccion;
	}

	public List<Trayecto> getConduccion() {
		return conduccion;
	}

	public void setConduccion(List<Trayecto> conduccion) {
		this.conduccion = conduccion;
	}

	@Override
	public String toString() {
		return "Coche [conduccion=" + conduccion + "]";
	}

	public List<Trayecto> buscarPorModo(String id) {
		Trayecto t;
		List<Trayecto> tra = new ArrayList<Trayecto>();
		Iterator<Trayecto> it = conduccion.iterator();
		while (it.hasNext()) {
			t = it.next();
			if (t.getModo().equalsIgnoreCase(id))
				tra.add(t);
		}
		return tra;
	}

	public List<Trayecto> buscarPorConsumo(double consumo) {
		List<Trayecto> tra = new ArrayList<Trayecto>();
		Trayecto tray;
		for (Trayecto t : conduccion) {
			tray = t;
			if (tray.getlConsumidos() == consumo)
				tra.add(tray);
		}
		return tra;
	}

	public Trayecto buscarPorId(int id) {
		for (int i = 0; i < conduccion.size(); i++) {
			if (conduccion.get(i).getId() == id)
				return conduccion.get(i);
		}
		return null;
	}

	public void modificarTrayecto(Trayecto t1, String nuevoModo) {
		t1.setModo(nuevoModo);
	}

	public void imprimirTrayectos() {
		Iterator<Trayecto> it = conduccion.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	public double mediaConsumo() {
		double consumoT = 0;
		for (int i = 0; i < conduccion.size(); i++) {
			consumoT += conduccion.get(i).getlConsumidos();
		}

		return consumoT / conduccion.size();
	}

	public Trayecto trayectoMayorDuracion() {
		Trayecto t1 = conduccion.get(0);
		for(int i = 0; i<conduccion.size(); i++) {
			if(conduccion.get(i).getDuracion()>t1.getDuracion())
				t1=conduccion.get(i);
		}
		return t1;
	}
	
	public Trayecto menorConsumo() {		
		Trayecto t1 = conduccion.get(0);
		for(int i = 0; i<conduccion.size(); i++) {
			if(conduccion.get(i).getlConsumidos()<t1.getlConsumidos())
				t1=conduccion.get(i);
		}
		return t1;
	}
}
