package ejercicio;

public class Trayecto implements Comparable <Trayecto> {

	private int id;
	private double duracion;
	private double lConsumidos;
	private String modo;
		
	
	public Trayecto(int id, double duracion, double lConsumidos, String modo) {
		super();
		this.id = id;
		this.duracion = duracion;
		this.lConsumidos = lConsumidos;
		this.modo = modo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public double getlConsumidos() {
		return lConsumidos;
	}
	public void setlConsumidos(double lConsumidos) {
		this.lConsumidos = lConsumidos;
	}
	public String getModo() {
		return modo;
	}
	public void setModo(String modo) {
		this.modo = modo;
	}

	@Override
	public String toString() {
		return "Trayecto [id=" + id + ", duracion=" + duracion + ", lConsumidos=" + lConsumidos + ", modo=" + modo
				+ "]";
	}
	
	public int compareTo(Trayecto t1) {
		return -(t1.getModo().toLowerCase().compareTo(this.modo));
	}
	
	
}
