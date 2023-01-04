package taller3.televisores;
//package televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	
	Control control;
	
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca brand) {
		this.marca = brand;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control cont) {
		this.control = cont;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int price) {
		this.precio = price;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		this.volumen = vol;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int channel) {
		if (channel >=1 && channel <=120 && this.estado == true)
			this.canal = channel;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (this.canal>=1 && this.canal<120 && this.estado == true)
			this.canal ++;
	}
	public void canalDown() {
		if (this.canal >1 && this.canal <=120 && this.estado == true)
			this.canal--;
	}
	public void volumenUp() {
		if (this.volumen >=0 && this.volumen <7 && this.estado == true)
			this.volumen++;
				
	}
	public void volumenDown() {
		if(this.volumen >0 && this.volumen <=7 && this.estado == true)
			this.volumen--;
	}
	public static void setNumTV(int num) {
		TV.numTV = num;
	}
	
}
