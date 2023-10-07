package semana_05;

public class ArregloPrecios {
	private double [] precio = {240.5, 350.2, 80.4, 100.3, 470.1, 60.0, 330.8, 260.6, 510.9, 200.7};
	
	public ArregloPrecios() {
	}
	
	public int tamanio() {
		return precio.length;
	}
	public double obtener(int i) {
		return precio[i];
	}
	
	//Un método precioPromedio que retorne el promedio de todos los precios.
	public double precioPromedio() {
		double promedio = 0;
		for (int i = 0; i < tamanio(); i++) {
			promedio += precio[i];
		}
		return promedio / tamanio();
	}
	//Un método precioMayor que retorne el mayor de todos los precios.
	public double precioMayor() {
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < precio[i]) {
				mayor = precio[i];
			}
		}
		return mayor;
	}
	//Un método precioMenor que retorne el menor de todos los precios.
	public double precioMenor() {
		double menor = precio[0];
		for (int i = 1; i < tamanio(); i++) {
			if (menor > precio[i]) {
				menor = precio[i];
			}
		}
		return menor;
	}
	//Un método cantMayoresPrecioPromedio que retorne la cantidad de productos
	// cuyo precio es mayor o igual al precio promedio.
	public double cantMayoresPrecioPromedio() {
		int cont =0;
		for(int i=0; i<tamanio();i++) {
			if(precio[i]>=precioPromedio()) {
			cont++;
			}
		}
		return cont;
	}
	//Un método cantMenoresPrecioPromedio que retorne la cantidad de productos 
	//cuyo precio es menor al precio promedio.
	public double cantMenoresPrecioPromedio() {
		int cont =0;
		for(int i=0; i<tamanio();i++) {
			if(precio[i]<precioPromedio()) {
			cont++;
			}
		}
		return cont;
	}
	//Un método posPrimerPrecioMayorAlSegundo que retorne la posición del 
	//primer precio mayor al segundo de los precios. En caso no exista retorne -1.
	public int posPrimerPrecioMayorAlSegundo() {
        for (int i = 1; i < precio.length; i++) {
            if (precio[i] > precio[1]) {
                return i;
            }
        }

        return -1;	
}
	//Un método posUltimoPrecioMenorAlPenultimo que retorne la posición del 
	//último precio menor al penúltimo de los precios. En caso no exista retorne -1.
	public int posUltimoPrecioMenorAlPenultimo() {
		for(int i= precio.length -1; i>=0; i--){
			   if(precio[i] < precio[8]){
				   return i;
			   }
		   }
		   return -1;
    }
	//Un método generarPrecios que remplace los precios actuales por otros 
	//aleatorios comprendidos en el rango de 99.9 a 999.9 (con una cifra decimal).
	public void generarPrecios() {
		for(int i =0; i<tamanio(); i++)
			precio[i] = aleatorio(99.9,999.9);
		
	}
	
	//Creando el metodo aleatorio
	private double aleatorio(double min, double max) {
		return(double)((max-min+1) * Math.random()) + min;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
