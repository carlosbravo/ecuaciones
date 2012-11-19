package ar.edu.unlam.tallerweb.ecuaciones;
public class EcuacionLineal implements Ecuacion {
	private Double m;
	private Double b;
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
	public EcuacionLineal(final Double m, final Double b) {
		if ((m == null) || (b == null)) {
			throw new RuntimeException("No implementado");
		} else {
			this.m = m;
			this.b = b;
		}
	}
	public final Double resolver(final Double x) {		
		double resultado;
		resultado = (this.m * x) + this.b;
		return resultado;
	}
}