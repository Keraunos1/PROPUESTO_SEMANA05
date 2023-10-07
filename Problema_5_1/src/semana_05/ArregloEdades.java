package semana_05;

public class ArregloEdades {
	private int[] edad = { 27, 22, 13, 12, 25, 11, 29, 70, 15, 21 };

	// Un Constructor que no haga nada.
	public ArregloEdades() {
	}

	// Un método tamanio que retorne la cantidad de elementos del arreglo edad.
	public int tamanio() {
		return edad.length;
	}

	// Un método obtener que reciba una posición y retorne la edad registrada en
	// dicha posición.
	public int obtener(int i) {
		return edad[i];
	}

	// Un método edadPromedio que retorne el promedio de todas las edades.
	public double edadPromedio() {
		int suma = 0;
		for (int i = 0; i < tamanio(); i++) {
			suma += edad[i];
		}
		return suma / tamanio();
	}

	// Un método edadMayor que retorne la mayor de todas las edades.
	public int edadMayor() {
		int mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < edad[i]) {
				mayor = edad[i];
			}
		}
		return mayor;
	}

	// Un método edadMenor que retorne la menor de todas las edades.
	public int edadMenor() {
		int menor = edad[0];
		for (int i = 1; i < tamanio(); i++) {
			if (menor > edad[i]) {
				menor = edad[i];
			}
		}
		return menor;

	}

	// Un método cantMayoresEdad que retorne la cantidad de personas mayores de
	// edad.
	public int cantMayoresEdad() {
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (edad[i] >= 18) {
				cont++;
			}

		}

		return cont;
	}

	// Un método cantMenoresEdad que retorne la cantidad de personas menores de
	// edad.
	public int cantMenoresEdad() {
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (edad[i] <= 18) {
				cont++;
			}

		}

		return cont;
	}

	// Un método posPrimeraEdadAdolescente que retorne la posición de la primera
	// edad encontrada
	// en el rango de 12 a 20 años. En caso no exista retorne -1.
	public int posPrimeraEdadAdolescente() {
		for (int i = 0; i < tamanio(); i++) {
			if (edad[i] >= 12 && edad[i] <= 20) {
				return i;
			}
		}
		return -1;
	}

	// Un método posUltimaEdadAdolescente que retorne la posición de la última edad
	// encontrada en
	// el rango de 12 a 20 años. En caso no exista retorne -1. RECORRIDO INVERSO
	public int posUltimaEdadAdolescente() {
		for (int i = tamanio() - 1; i >= 0; i--) {
			if (edad[i] >= 12 && edad[i] <= 20) {
				return i;
			}
		}
		return -1;
	}
	
	/*Un método generarEdades que remplace las edades actuales por otras aleatorias
    comprendidas en el rango de 10 a 90 años. Haga uso del método:
	private int aleatorio(int min, int max) {
	return (int)((max - min + 1) * Math.random()) + min;
	} 
	*/
	public void generarEdades(){
		for(int i=tamanio()-1; i>=0; i--){
		edad[i] = aleatorio(10,90);	
		} 
	}
	
	private int aleatorio(int min, int max) {
		return (int)((max - min + 1) * Math.random()) + min;
		} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
