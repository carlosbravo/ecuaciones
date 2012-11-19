package ar.edu.unlam.tallerweb.ecuaciones;
import java.util.ArrayList;
import java.util.List;
public class EcuacionPolinomica implements Ecuacion {
	List <Double> coeficientes = new ArrayList <Double>();
	public final List <Double> getCoeficientes() {
		return coeficientes;
	}
	public final void setCoeficientes(final List <Double> coeficientes) {
		this.coeficientes = coeficientes;
	}
	public EcuacionPolinomica(final List <Double> coeficientes) {
		if (coeficientes == null) {
			throw new RuntimeException("No implementado");
		} else {
			this.coeficientes = coeficientes;
		}
	}
	public Double resolver(final Double x) {
		double resultado = 0;
		for (int i = 0; i < this.coeficientes.size(); i++) {
			resultado += this.coeficientes.get(i) * Math.pow(x, i);
		}
		return resultado;
	}
}