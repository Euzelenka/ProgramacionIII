package Ej3P1;

public class Pila {
	Lista pila;
	
	public Pila() {
		pila = new Lista();
	}
	
	public void apilar(int elem) {
		pila.agregar(elem);
	}
	
	public int ver_tope() {
		return pila.buscarElemEnPos(1);
	}
	
	public boolean vacia() {
		return pila.es_vacia();
	}
	
	public void desapilar() {
		pila.eliminar(pila.buscarElemEnPos(1));
	}
}
