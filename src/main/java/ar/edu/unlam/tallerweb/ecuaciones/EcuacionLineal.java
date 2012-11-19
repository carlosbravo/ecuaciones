package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuacion lineal del tipo f(x) = mx + b
 */
 
public class EcuacionLineal implements Ecuacion {
	
	private Double m;
	private Double b;
	
	//Genero los getters y setters
	public final Double getM() {
		return m;
	}

	public final void setM(final Double m) {
		this.m = m;
	}

	public final Double getB() {
		return b;
	}

	public final void setB(final Double b) {
		this.b = b;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param m la pendiente
	 * @param b la ordenada al origen
	 *
	 */
	
	public EcuacionLineal(final Double m, final Double b) {
		if ((m == null) || (b == null)) {
			throw new RuntimeException("No implementado");
		} else {
			this.m = m;
			this.b = b;
		}
	}
	
	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public final Double resolver(final Double x) {
		
		double resultado;
		resultado=(this.m*x)+this.b;
		return resultado;
		//throw new RuntimeException("No implementado");

	}

}
