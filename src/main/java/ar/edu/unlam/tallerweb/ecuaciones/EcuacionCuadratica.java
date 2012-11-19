package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuacion cuadratica del tipo
 * f(x) = ax^2 + bx + c
 *
 */
public class EcuacionCuadratica implements Ecuacion {

	private Double a;
	private Double b;
	private Double c;
	
	//Genero los getters y setters
	public final Double getA() {
		return a;
	}

	public final void setA(final Double a) {
		this.a = a;
	}

	public final Double getB() {
		return b;
	}

	public final void setB(final Double b) {
		this.b = b;
	}

	public final Double getC() {
		return c;
	}

	public final void setC(final Double c) {
		this.c = c;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param a
	 * @param b
	 * @param c
	 *
	 */
	
	public EcuacionCuadratica(final Double a, final Double b, final Double c) {
		if ((a == null) || (b == null) || (c == null)) {
			throw new RuntimeException("No implementado");
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public final Double resolver(final Double x) {

		Double resultado;
		resultado=(this.a * (x * x)) + (this.b * x) + this.c;//x*x representa x al cuadrado: x^2
		return resultado;
		//throw new RuntimeException("No implementado");

	}
}
