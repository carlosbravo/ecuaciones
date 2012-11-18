package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Abstraccion que representa todo tipo de ecuacion con
 * una incognita
 *
 */
public interface Ecuacion {

	/**
	 * Nota recordatoria: La interfaz solo contiene la firma de los metodos, no la implementacion
	 * 
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	Double resolver(Double x);

}
