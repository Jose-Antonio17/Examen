package joseantonio.ceronortiz.examen;

public class Examen {

	public static void main(String[] args) {

		System.out.println("---------------------");
		System.out.println("Creamos la lista de números:");
		int[] numerosLista = UtilidadesExamen.creaArray();

		System.out.println("---------------------");
		System.out.println("Lista de números introducidos:");
		UtilidadesExamen.mostrarArray(numerosLista);

		System.out.println("---------------------");
		System.out.println("Media de los números introducidos:");
		float mediaNumeros = UtilidadesExamen.media(numerosLista);
		System.out.println("La media es " + mediaNumeros);

		System.out.println("---------------------");
		System.out.println("Número mayor y menor de los números introducidos:");
		int[] extremos = UtilidadesExamen.encontrarExtremos(numerosLista);
		System.out.println("El número mayor es " + extremos[0]);
		System.out.println("El número menor es " + extremos[1]);

		System.out.println("---------------------");
		System.out.println("Números mayores de la media");
		int[] numerosMayoresPromedio = UtilidadesExamen.filtrarMayoresQuePromedio(numerosLista, mediaNumeros);
		for (int numero : numerosMayoresPromedio) {
			System.out.println(numero);
		}
	}

}
