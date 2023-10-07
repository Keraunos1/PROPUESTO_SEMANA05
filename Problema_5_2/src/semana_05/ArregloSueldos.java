package semana_05;

public class ArregloSueldos {

	// valores de inicialización
	private double[] sueldo = { 2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7 };

	// Un Constructor que no haga nada.
	public ArregloSueldos() {

	}

	// Un método tamanio que retorne la cantidad de elementos del arreglo sueldo.
	public int tamanio() {
		return sueldo.length;
	}

	// Un método obtener que reciba una posición y retorne el sueldo registrado en
	// dicha posición.
	public double obtener(int i) {
		return sueldo[i];
	}

	// Un método sueldoPromedio que retorne el promedio de todos los sueldos.
	// Ver si este codigo diferente al original funciona
	public double sueldoPromedio() {
		double suma = 0;
		for (int i = 0; i < tamanio(); i++) {
			suma += sueldo[i];
		}
		return suma / tamanio();
	}

	// Un método sueldoMayor que retorne el mayor de todos los sueldos.
	public double sueldoMayor() {
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < sueldo[i]) {
				mayor = sueldo[i];
			}
		}
		return mayor;
	}

	// Un método sueldoMenor que retorne el menor de todos los sueldos
	// Para hallar sueldo menor la variable se inicializa en sueldo[0];
	// y el i, en i=1; --tambien se cambian los signos if(menor>sueldo[i])
	public double sueldoMenor() {
		double menor = sueldo[0];
		for (int i = 1; i < tamanio(); i++) {
			if (menor > sueldo[i]) {
				menor = sueldo[i];
			}
		}
		return menor;
	}

	// Un método cantMayoresSueldoPromedio que retorne la cantidad de empleados cuyo
	// sueldo es mayor o igual al sueldo promedio.
	public int cantMayoresSueldoPromedio() {
		int cantidadEmpleados = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (sueldoPromedio() <= sueldo[i]) {
				cantidadEmpleados++;
			}
		}
		return cantidadEmpleados;
	}

	// Un método cantMenoresSueldoPromedio que retorne la cantidad de empleados cuyo
	// sueldo
	// es menor al sueldo promedio.
	public int cantMenoresSueldoPromedio() {
		int cantidadEmpleados = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (sueldoPromedio() > sueldo[i]) {
				cantidadEmpleados++;
			}
		}
		return cantidadEmpleados;
	}

	// Un método posSegundoSueldoMayorAlMinimo que retorne la posición del segundo
	// sueldo mayor
	// a 850.0. En caso no exista retorne -1.
	public int posSegundoSueldoMayorAlMinimo() {
		int segundoSueldo = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (sueldo[i] > 850) {
				segundoSueldo++;
			}
			if (segundoSueldo == 2) {
				return i;
			}
		}
		return -1;
	}

	// Un método posUltimoSueldoMenorAlMinimo que retorne la posición del último
	// sueldo menor
	// a 850.0. En caso no exista retorne -1.
	public int posUltimoSueldoMenorAlMinimo() {
		for (int i = tamanio() - 1; i >= 0; i--) {
			if (sueldo[i] < 850) {
				return i;
			}

		}
		return -1;
	}

	// Un método generarSueldos que remplace los sueldos actuales por otros
	// aleatorios comprendidos
	// en el rango de 799.9 a 4999.9 (con una cifra decimal).
	public void generarSueldos() {
		for(int i =0; i<tamanio(); i++)
			sueldo[i] = aleatorio(799.9,4999.9);
	}
	
	//Creando el metodo aleatorio
	private double aleatorio(double min, double max) {
		return(double)((max-min+1) * Math.random()) + min;
	}

}
