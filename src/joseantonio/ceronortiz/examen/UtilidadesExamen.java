package joseantonio.ceronortiz.examen;

import java.util.Scanner;

public class UtilidadesExamen {

	public static int[] creaArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique la cantidad de números que va ingresar:");
		int tamanyo = scan.nextInt();
		int[] numeros = new int[tamanyo];
		for (int i = 0; i < numeros.length; i++) {
			scan = new Scanner(System.in);
			System.out.println("Introduce el número " + (i + 1)+" :");
			numeros[i] = scan.nextInt();
		}
		return numeros;
	}

	public static void mostrarArray(int[] numeros) {
		for (int numeroArray : numeros) {
			System.out.println(numeroArray);
		}
	}

	public static float media(int[] numeros) {
		float suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		float media = suma/numeros.length;
		return media;
	}

	public static int[] encontrarExtremos(int[] numeros) {
		int[] extremos = new int[2];
		int mayor = 0;
		for (int numeroMayor : numeros) {
			if (numeroMayor > mayor)
				mayor = numeroMayor;
		}
		int menor = mayor;
		for (int numeroMenor : numeros) {
			if (numeroMenor < menor)
				menor = numeroMenor;
		}
		extremos[0] = mayor;
		extremos[1] = menor;
		return extremos;
	}

	public static int[] filtrarMayoresQuePromedio(int[] numeros, float media) {

		int contador = 0;
		for (int numeroMayor : numeros) {
			if (numeroMayor > media) {
				contador++;
			}
		}
		int[] numerosMayoresDelPromedio = new int[contador];

		for (int i = 0, j = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				numerosMayoresDelPromedio[j] = numeros[i];
				j++;
			}
		}
		return numerosMayoresDelPromedio;
	}
}
