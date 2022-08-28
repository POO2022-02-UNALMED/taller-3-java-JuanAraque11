package taller3.televisores;

public class Marca {
	private String nombre;
	private Marca (String nom) {
		nombre = nom;
	}
	void setNombre(String nom) {
		nombre = nom;
	}
	String getNombre() {
		return nombre;
	}
}
