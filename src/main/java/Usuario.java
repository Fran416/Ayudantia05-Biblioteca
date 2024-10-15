import java.util.ArrayList;

public class Usuario {

	private String nombre;
	private String identificacion;
	private ArrayList<Prestamo> listaPrestamos;
	private ArrayList<Multa> listaMultas;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	/**
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public ArrayList<Prestamo> getListaPrestamos() {
		return this.listaPrestamos;
	}

	/**
	 * 
	 * @param listaPrestamos
	 */
	public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}

	public ArrayList<Multa> getListaMultas() {
		return this.listaMultas;
	}

	/**
	 * 
	 * @param listaMultas
	 */
	public void setListaMultas(ArrayList<Multa> listaMultas) {
		this.listaMultas = listaMultas;
	}

}