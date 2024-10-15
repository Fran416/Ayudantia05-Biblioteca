public class Libro {

	private String titulo;
	private String autor;
	private String isbn;
	private int anoPublicacion;

	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	/**
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return this.isbn;
	}

	/**
	 * 
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnoPublicacion() {
		return this.anoPublicacion;
	}

	/**
	 * 
	 * @param anoPublicacion
	 */
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	/**
	 * 
	 * @param titulo
	 * @param autor
	 * @param isbn
	 * @param anoPublicacion
	 */
	public Libro(String titulo, String autor, String isbn, String anoPublicacion) {
		// TODO - implement Libro.Libro
		throw new UnsupportedOperationException();
	}

}