package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void CanalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUP() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void enlazar(TV tele) {
		tv = tele;
		tv.setControl(this);
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv() {
		return tv;
	}
}
