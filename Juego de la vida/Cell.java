package ejercicio2;

public class Cell {

	private boolean estadoActual, estadoSig;
	private List<Cell> ady;

	public Cell(boolean estado) {
		this.estadoActual = estado;
		this.estadoSig = estado;
	}

	public void vecinos(int posX, int posY) {

		// esquinas
		if (posX == 1 && posY == 1) {
			ady += (matriz[0][1] + " " + matriz[1][0] + " " + matriz[1][1]
					+ " " + matriz[0][y] + " " + matriz[1][y] + " "
					+ matriz[x][y] + " " + matriz[x][0] + " " + matriz[x][1]);
		} else if (fila == 1 && columna == matriz[0].length) {
			ady += (matriz[0][y - 1] + " " + matriz[1][y] + " "
					+ matriz[1][y - 1] + " " + matriz[x][y] + " "
					+ matriz[x][y - 1] + " " + matriz[x][0] + " "
					+ matriz[x][1] + " " + matriz[0][0]);
		} else if (fila == matriz.length && columna == 1) {
			ady += (matriz[x - 1][0] + " " + matriz[x - 1][1] + " "
					+ matriz[x][1] + " " + matriz[0][0] + " " + matriz[0][1]
					+ " " + matriz[x][y] + " " + matriz[0][y] + " " + matriz[x - 1][y]);
		} else if (fila == matriz.length && columna == matriz[0].length) {
			ady += (matriz[x - 1][y] + " " + matriz[x - 1][y - 1] + " "
					+ matriz[x][y - 1] + " " + matriz[0][0] + " "
					+ matriz[0][y] + " " + matriz[x - 1][0] + " "
					+ matriz[x][0] + " " + matriz[0][y - 1]);

			// Laterales
		} else if (fila == 1) {
			ady += (matriz[0][columna - 2] + " " + matriz[0][columna] + " "
					+ matriz[1][columna - 2] + " " + matriz[1][columna - 1]
					+ " " + matriz[1][columna] + " " + matriz[x][columna - 2]
					+ " " + matriz[x][columna - 1] + " " + matriz[x][columna]);

		} else if (fila == matriz.length) {
			ady += (matriz[x][columna - 2] + " " + matriz[x][columna] + " "
					+ matriz[x - 1][columna - 2] + " "
					+ matriz[x - 1][columna - 1] + " " + matriz[x - 1][columna]
					+ " " + matriz[0][columna - 2] + " "
					+ matriz[0][columna - 1] + " " + matriz[0][columna]);

		} else if (columna == 1) {
			ady += (matriz[fila - 2][columna - 1] + " "
					+ matriz[fila][columna - 1] + " "
					+ matriz[fila - 2][columna] + " "
					+ matriz[fila - 1][columna] + " " + matriz[fila][columna]
					+ " " + matriz[fila - 2][y] + " " + matriz[fila - 1][y]
					+ " " + matriz[fila][y]);

		} else if (columna == matriz[0].length) {
			ady += (matriz[fila - 2][y] + " " + matriz[fila][y] + "	"
					+ matriz[fila - 2][columna - 2] + " "
					+ matriz[fila - 1][columna - 2] + " "
					+ matriz[fila][columna - 2] + " " + matriz[fila - 2][0]
					+ " " + matriz[fila - 1][0] + " " + matriz[fila][0]);

			// Todos los adyacentes restantes
		} else {
			ady += (matriz[fila - 2][columna - 2] + " "
					+ matriz[fila - 2][columna - 1] + " "
					+ matriz[fila - 2][columna] + " "
					+ matriz[fila - 1][columna - 2] + " "
					+ matriz[fila - 1][columna] + " "
					+ matriz[fila][columna - 2] + " "
					+ matriz[fila][columna - 1] + " " + matriz[fila][columna]);

		}

	}

}
