package test;
public class Auto {
	public String modelo;
	public int precio;
	public Asiento asientos[];
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int contador = 0;
		for (int i = 0; i<asientos.length; i++) {
			if (asientos[i] instanceof Asiento)
				contador++; 
		}
		return contador;
	}
	public String verificarIntegridad() {
		String resultado = "Auto original";
		if (registro != motor.registro)
			resultado = "Las piezas no son originales";
		else
			for (int i = 0; i<asientos.length; i++) {
					if (asientos[i] == null)
						continue;
					else if ( registro != asientos[i].registro)
						resultado = "Las piezas no son originales";
				}
		return resultado;
	}
}
