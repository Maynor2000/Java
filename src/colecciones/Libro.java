package colecciones;

public class Libro {
	public Libro(String tit,String aut,int ISBN) {
		titulo=tit;
		autor=aut;
		isbn=ISBN;
	}
	public String getDatos() {
		return "el titulo es: "+titulo+" El autor es: "+autor+" el ISBN es: "+isbn;
	}
	/*
	public boolean equals(Object obj) {
		if(obj instanceof Libro) {
			Libro otro =(Libro)obj;
			if(isbn==otro.isbn) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public int getisbn() {
		return isbn;
	}
	*/
	
	private String titulo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}

	private String autor;
	private int isbn;
}
