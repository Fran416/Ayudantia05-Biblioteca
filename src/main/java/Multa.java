public class Multa {

	private int monto;
	private String fechaGeneracion;
	private boolean multaPagada;
	private Prestamo prestamoAsociado;

	public int getMonto() {
		return this.monto;
	}

	/**
	 * 
	 * @param monto
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getFechaGeneracion() {
		return this.fechaGeneracion;
	}

	/**
	 * 
	 * @param fechaGeneracion
	 */
	public void setFechaGeneracion(String fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public boolean getMultaPagada() {
		// TODO - implement Multa.getMultaPagada
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param multaPagada
	 */
	public void setEstado(boolean multaPagada) {
		// TODO - implement Multa.setEstado
		throw new UnsupportedOperationException();
	}

	public Prestamo getPrestamoAsociado() {
		return this.prestamoAsociado;
	}

	/**
	 * 
	 * @param prestamoAsociado
	 */
	public void setPrestamoAsociado(Prestamo prestamoAsociado) {
		this.prestamoAsociado = prestamoAsociado;
	}

}