package java;

public class Libro extends Escrito{
	String co_autor;
	String editorial;
	String edicion;
	String interpretacion;
	
	public Libro() {}

	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
			String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
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

	public String getCo_autor() {
		return co_autor;
	}

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
