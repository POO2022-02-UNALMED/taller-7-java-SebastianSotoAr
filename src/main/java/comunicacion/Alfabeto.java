package java;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	static ArrayList<String> letras;
	String interpretacion;
	
	public Alfabeto() {}

	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}

	int cantidadLetras() {return 1060;}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return super.interpretacion();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getInterpretacion() {
		return interpretacion;
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
