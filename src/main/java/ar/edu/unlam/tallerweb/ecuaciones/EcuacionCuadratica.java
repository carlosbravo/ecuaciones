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
	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
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
	
	public EcuacionCuadratica(Double a, Double b, Double c) {
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
	public Double resolver(Double x) {

		Double resultado;
		resultado=(this.a * (x * x)) + (this.b * x) + this.c;//x*x representa x al cuadrado: x^2
		return resultado;
		//throw new RuntimeException("No implementado");

	}
}
