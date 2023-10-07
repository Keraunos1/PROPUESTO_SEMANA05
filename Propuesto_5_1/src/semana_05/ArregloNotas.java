package semana_05;

public class ArregloNotas {
	private int[] nota = { 11, 10, 16, 18, 15, 13, 20, 12, 19, 17 };

	public ArregloNotas() {
	}

	// Un método tamanio que retorne la cantidad de elementos del arreglo nota
	public int tamanio() {
		return nota.length;
	}

//Un método obtener que reciba una posición y retorne el sueldo registrado en
	// dicha posición.
	public double obtener(int i) {
		return nota[i];
	}

//Un método notaPromedio que retorne el promedio de todas las notas.
	public double notaPromedio() {
		double promedio = 0;
		for (int i = 0; i < tamanio(); i++) {
			promedio += nota[i];
		}
		return promedio / tamanio();
	}

//Un método notaMayor que retorne la mayor de todas las notas.
	public int notaMayor() {
		int mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < nota[i]) {
				mayor = nota[i];
			}
		}
		return mayor;
	}

//Un método notaMenor que retorne la menor de todas las notas.
	public int notaMenor() {
		int menor = nota[0];
		for (int i = 1; i < tamanio(); i++) {
			if (menor > nota[i]) {
				menor = nota[i];
			}
		}
		return menor;
	}

//Un método cantNotasAprobatorias que retorne la cantidad de alumnos
// que obtuvieron de 13 a más.
	public int cantNotasAprobatorias() {
		int aprobados = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] >= 13) {
				aprobados++;
			}
		}
		return aprobados;
	}

//Un método cantNotasDesaprobatorias que retorne la cantidad de alumnos
// que obtuvieron menos de 13.
	public int cantNotasDesaprobatorias() {
		int desaprobados = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] < 13) {
				desaprobados++;
			}
		}
		return desaprobados;
	}

//Un método cantNotasMayoresA15 que retorne la cantidad de alumnos que obtuvieron más de 15.
	public int cantNotasMayoresA15() {
		int mayorA15 = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] > 15) {
				mayorA15++;
			}
		}
		return mayorA15;
	}

	// Un método posPrimeraNotaAprobatoria que retorne la posición de la primera
	// nota mayor
	// o igual a 13. En caso no exista retorne -1
	public int posPrimeraNotaAprobatoria() {
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] >= 13) {
				return i;
			}

		}
		return -1;
	}

	// Un método posPenultimaNotaDesaprobatoria que retorne la posición de la
	// penúltima
//nota menor a 13. En caso no exista retorne -1.
	public int posPenultimaNotaDesaprobatoria() {
		for (int i = tamanio() - 1; i >= 0; i--) {
			if (nota[i] < 13) {
				return i;
			}
		}
		return -1;
	}

	// Un método generarNotas que remplace las notas actuales por otras aleatorias
	// comprendidas
	// en el rango de 0 a 20.
	public void generarNotas() {
		for (int i = 0; i < tamanio(); i++) {
			nota[i] = aleatorio(0, 20);
		}
	}

	private int aleatorio(int min, int max) {
		return (int) ((max - min + 1) * Math.random()) + min;
	}

}
