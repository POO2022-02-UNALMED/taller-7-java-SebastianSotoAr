package java;

import java.util.ArrayList;

public class Tesis extends Escrito {
	String idea;
	static ArrayList<String> argumentos;
	String conclusion;
	String referencias;
	String interpretacion;

	public Tesis() {}

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int nose) {
		// TODO Auto-generated method stub
		return super.palabrasTotales(nose);
	}

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

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public static ArrayList<String> getArgumentos() {
		return argumentos;
	}

	public static void setArgumentos(ArrayList<String> argumentos) {
		Tesis.argumentos = argumentos;
	}
	
}
