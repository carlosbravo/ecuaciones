package ar.edu.unlam.tallerweb.ecuaciones;
public class EcuacionCuadratica implements Ecuacion {
	private Double a;
	private Double b;
	private Double c;
	public Double getA() {
		return a;
	}
	public void setA(Double a) {
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
	public EcuacionCuadratica(Double a,
			final Double b, final Double c) {
		if ((a == null) || (b == null) || (c == null)) {
			throw new RuntimeException("No implementado");
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	public final Double resolver(final Double x) {
		Double resultado;
		resultado = (this.a * (x * x)) + (this.b * x) + this.c;
		return resultado;
	}
}
