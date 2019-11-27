package ejercicio2;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int num = 1;
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		String s = "", ady = "";
		int capacidad = rnd.nextInt(10) + 3;
		int[][] matriz = new int[capacidad][capacidad];

		int x = matriz.length - 1;
		int y = matriz[0].length - 1;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rnd.nextInt(500) + 1;
			}
		}

		System.out.println("adyacentes de que fila (max= " + capacidad + ")");
		int fila = sc.nextInt();
		System.out.println("columna  (max= " + capacidad + ")");
		int columna = sc.nextInt();

		// esquinas
		if (fila == 1 && columna == 1) {
			ady += (matriz[0][1] + " " + matriz[1][0] + " " + matriz[1][1] + " " + matriz[0][y] + " " + matriz[1][y]
					+ " " + matriz[x][y] + " " + matriz[x][0] + " " + matriz[x][1]);
		} else if (fila == 1 && columna == matriz[0].length) {
			ady += (matriz[0][y - 1] + " " + matriz[1][y] + " " + matriz[1][y - 1] + " " + matriz[x][y] + " "
					+ matriz[x][y - 1] + " " + matriz[x][0] + " " + matriz[x][1] + " " + matriz[0][0]);
		} else if (fila == matriz.length && columna == 1) {
			ady += (matriz[x - 1][0] + " " + matriz[x - 1][1] + " " + matriz[x][1] + " " + matriz[0][0] + " "
					+ matriz[0][1] + " " + matriz[x][y] + " " + matriz[0][y] + " " + matriz[x - 1][y]);
		} else if (fila == matriz.length && columna == matriz[0].length) {
			ady += (matriz[x - 1][y] + " " + matriz[x - 1][y - 1] + " " + matriz[x][y - 1] + " " + matriz[0][0] + " "
					+ matriz[0][y] + " " + matriz[x - 1][0] + " " + matriz[x][0] + " " + matriz[0][y - 1]);

			// Laterales
		} else if (fila == 1) {
			ady += (matriz[0][columna - 2] + " " + matriz[0][columna] + " " + matriz[1][columna - 2] + " "
					+ matriz[1][columna - 1] + " " + matriz[1][columna] + " " + matriz[x][columna - 2] + " "
					+ matriz[x][columna - 1] + " " + matriz[x][columna]);

		} else if (fila == matriz.length) {
			ady += (matriz[x][columna - 2] + " " + matriz[x][columna] + " " + matriz[x - 1][columna - 2] + " "
					+ matriz[x - 1][columna - 1] + " " + matriz[x - 1][columna] + " " + matriz[0][columna - 2] + " "
					+ matriz[0][columna - 1] + " " + matriz[0][columna]);

		} else if (columna == 1) {
			ady += (matriz[fila - 2][columna - 1] + " " + matriz[fila][columna - 1] + " " + matriz[fila - 2][columna]
					+ " " + matriz[fila - 1][columna] + " " + matriz[fila][columna] + " " + matriz[fila - 2][y] + " "
					+ matriz[fila - 1][y] + " " + matriz[fila][y]);

		} else if (columna == matriz[0].length) {
			ady += (matriz[fila - 2][y] + " " + matriz[fila][y] + "	" + matriz[fila - 2][columna - 2] + " "
					+ matriz[fila - 1][columna - 2] + " " + matriz[fila][columna - 2] + " " + matriz[fila - 2][0] + " "
					+ matriz[fila - 1][0] + " " + matriz[fila][0]);

			// Todos los adyacentes restantes
		} else {
			ady += (matriz[fila - 2][columna - 2] + " " + matriz[fila - 2][columna - 1] + " "
					+ matriz[fila - 2][columna] + " " + matriz[fila - 1][columna - 2] + " " + matriz[fila - 1][columna]
					+ " " + matriz[fila][columna - 2] + " " + matriz[fila][columna - 1] + " " + matriz[fila][columna]);

		}

		for (int i = 0; i < matriz.length; i++) {
			for (int t = 0; t < matriz.length; t++) {

				s += matriz[i][t] + "\t|";
			}
			s += "\n";
		}

		System.out.println("los adyacentes del elemento" +(fila) + " "+ (columna) + " " +matriz[fila - 1][columna - 1] + "son: " + ady);

		System.out.println(s);

	}

}

//		00|01|02|03|04
//		10|11|12|13|14
//		20|21|22|23|24
//		30|31|32|33|34
//		40|41|42|43|44

//		x-2 y-2|x-2 y-1|x-2 y
//		x-1 y-2|x-1 y-1|x-1 y
//		x y-2  |x y-1  |x y

//		x-2 y-2 = (x-2 y-1) + (x-2 y) + (x-1 y-2) + (x-1 y-1) + (x-1 y) + (x y-2) + (x y-1) + (x y)

//		x-2 = (x-2 y-1) + (x-2 y)
//		x-1 = (x-1 y-1) + (x-1 y-2) + (x-1 y)
//		x	= (x y) + (x y-1) + (x y-2)
