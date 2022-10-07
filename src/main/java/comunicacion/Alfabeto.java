package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	private static ArrayList<String> letras;
	private String interpretacion;
	
	public Alfabeto(String origen) {
		super(origen);
	}

	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}

	public static int cantidadLetras() {
		return letras.size();
		}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String linea = "";
		for (String letra : letras) {
			linea += letra + ", ";
		}
		return linea;
	}

	public String getInterpretacion() {
		return this.interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public static ArrayList<String> getLetras() {
		return letras;
	}

	public static void setLetras(ArrayList<String> letras) {
		Alfabeto.letras = letras;
	}
	
}
