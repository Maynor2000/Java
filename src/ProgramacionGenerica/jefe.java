package ProgramacionGenerica;

public class jefe <T>{
	private T dato;
	public  jefe() {
		dato=null;
	}
	public void asignaValor(T dato) {
		this.dato=dato;
	}
	public T devuelveValor() {
		return dato;
	}
}
