package Ej3P1;

public class Lista {
	Nodo lista;
	private int cantDatos;
	
	public Lista() {
		lista = null;
		cantDatos = 0;
	}
	
	//Buscar un elemento en una posicion dada
		public int buscarElemEnPos(int pos) {
			Nodo cursor = lista;
			int cont = 1;
			while((cont <= cantDatos)&&(pos != cont)) {
				cont++;
				cursor = cursor.get_next();
			}
			if(pos == cont)
				return cursor.get_info();
			else return -1;
		}
	
	//agrega al principio
	public void agregar(int dato) {
		Nodo nuevo = new Nodo(dato, null);
		if (lista == null) 
			lista = nuevo;
		else if(lista != null) {
				nuevo.set_siguiente(lista);
				lista = nuevo;
		  }
		cantDatos++;
	}
	
	public boolean es_vacia() {
		return cantDatos == 0;
	}
	
	public int cantElementos() {
		return cantDatos;
	}
	
	public int getDato() {
		return lista.get_info();
	}
	
	public String toString() {
		String datos = "";
		while (lista != null) {
			datos = datos + lista.get_info() + " ";
			lista = lista.get_next();
		}
		return datos;
	}
	
	
	public void eliminar(int dato) {
		Nodo pos = lista;
		if(lista != null){
			if(dato == lista.get_info()) {
				lista = lista.get_next();
				cantDatos--;
			}
			else { while((pos.get_next() != null)&&(dato != pos.get_next().get_info()))
						pos = lista.get_next();
				   if(dato == pos.get_next().get_info()){
					   pos.set_siguiente(pos.get_next().get_next());
					   cantDatos--;
				   }
			}
		}
	}
}


