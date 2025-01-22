package joseantonio.ceronortiz.examen;

public class Examen {

	public static void main(String[] args) {

		System.out.println("---------------------");
		System.out.println("Creamos la lista de numeros:");
		int[] numerosLista = UtilidadesExamen.creaArray();

		System.out.println("---------------------");
		System.out.println("Lista de numeros introducidos:");
		UtilidadesExamen.mostrarArray(numerosLista);

		System.out.println("---------------------");
		System.out.println("Media de los numeros introducidos:");
		float mediaNumeros = UtilidadesExamen.media(numerosLista);
		System.out.println("La media es " + mediaNumeros);

		System.out.println("---------------------");
		System.out.println("Numero mayor y menor de los numeros introducidos:");
		int[] extremos = UtilidadesExamen.encontrarExtremos(numerosLista);
		System.out.println("El numero mayor es " + extremos[0]);
		System.out.println("El numero menor es " + extremos[1]);

		System.out.println("---------------------");
		System.out.println("Numeros mayores de la media");
		int[] numerosMayoresPromedio = UtilidadesExamen.filtrarMayoresQuePromedio(numerosLista, mediaNumeros);
		for (int numero : numerosMayoresPromedio) {
			System.out.println(numero);
		}
	}

}
