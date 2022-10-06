package java;

public class Periodico extends Escrito{
	String fecha;
	String primicia;
	String interpretacion;
	
	public Periodico() {}

	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int nose) {
		// TODO Auto-generated method stub
		return super.palabrasTotales(nose);
	}

	@Override
	String interpretacion() {
		return this.interpretacion();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
