package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuacion lineal del tipo f(x) = mx + b
 */
 
public class EcuacionLineal implements Ecuacion {
	
	private Double m;
	private Double b;
	
	//Genero los getters y setters
	public Double getM() {
		return m;
	}

	public void setM(Double m) {
		this.m = m;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param m la pendiente
	 * @param b la ordenada al origen
	 *
	 */
	public EcuacionLineal(Double m, Double b) {
		this.m = m;
		this.b = b;
		//throw new RuntimeException("No implementado");
	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) {
		
		double resultado;
		resultado=(this.m*x)+this.b;
		return resultado;
		//throw new RuntimeException("No implementado");

	}

}
