package taller3.televisores;

public class Marca {
	private String nombre;
	private Marca (String nom) {
		nombre = nom;
	}
	public void setNombre(String nom) {
		nombre = nom;
	}
	public String getNombre() {
		return nombre;
	}
}
