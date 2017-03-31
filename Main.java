package Ej3P1;

public class Main {
	public static void main(String[] args) {
		Pila p = new Pila();
		
		if(p.vacia())
			System.out.println("La pila esta vacia");
		
		p.apilar(4);
		p.apilar(7);
		
		p.desapilar();
		
		p.apilar(6);
		p.apilar(3);
		
		p.desapilar();
		
		if(p.vacia())
			System.out.println("La pila esta vacia");
		
		System.out.println("El tope es: "+p.ver_tope());
		
	}
}
