package Ej3P1;

public class Nodo {
	private Integer dato;
	private Nodo siguiente;

	
	public Nodo() {
		siguiente = null;
	}
	
	public Nodo(Integer dato, Nodo siguiente) {
		this.dato = dato;
		this.siguiente = siguiente;
	}
	
	public void set_info(Integer dato) {
		this.dato = dato;
	}
	
	public void set_siguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public Integer get_info() {
		return this.dato;
	}
	
	public Nodo get_next() {
		return siguiente;
	}
	
	public void eliminar() {
		this.dato = null;
		this.siguiente = null;
	}
}

