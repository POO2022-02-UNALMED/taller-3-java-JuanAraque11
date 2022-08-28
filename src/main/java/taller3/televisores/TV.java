package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	private TV(Marca mar, boolean esta) {
		numTV ++;
		marca = mar;
		estado = esta;
		canal=1;
		precio=500;
		volumen=1;
	}
	public void setMarca(Marca mar) {
		marca = mar;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control con) {
		control = con;
	}
	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int pre) {
		precio = pre;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volu) {
		volumen = volu;
	}
	public int getVolmuen() {
		return volumen;
	}
	
	public void setCanal(int can) {
		canal = can;
	}
	public int getCanal() {
		return canal;
	}
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public void volumenUp() {
		if (estado == true && volumen>=0 && volumen<7) {
		    volumen = volumen + 1;
		}
	}
	public void volumenDown() {
		if (estado == true && volumen>0 && volumen<=7) {
		    volumen = volumen - 1;
		}
	}
	
	public void canalUp() {
		if (estado == true && canal>=1 && canal<120) {
			canal = canal + 1;
		}
	}
	public void canalDown() {
		if (estado == true && canal>1 && canal<=120) {
		    canal = canal - 1;
		}
	}
	
}
