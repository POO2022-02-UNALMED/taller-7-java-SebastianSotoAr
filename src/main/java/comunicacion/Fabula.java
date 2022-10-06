package java;

public class Fabula extends Escrito {
	String ensenanza;
	String interpretacion;
	
	public Fabula() {}

	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
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

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
