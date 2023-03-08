package ejercicio;

import java.util.Comparator;

public class CompararPorDuracion implements Comparator<Trayecto> {

	public int compare(Trayecto t1, Trayecto t2) {
		if (t1.getDuracion() < t2.getDuracion()) {
			return 1;
		}
		if (t1.getDuracion() > t2.getDuracion()) {
			return -1;
		}
		return 0;
	}
}
