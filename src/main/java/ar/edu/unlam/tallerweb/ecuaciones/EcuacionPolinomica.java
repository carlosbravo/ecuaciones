package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Representa una ecuacion polinomica del tipo
 * f(x) = n + (n-1) x + (n-2) x^2 + ...
 *
 */
public class EcuacionPolinomica implements Ecuacion {

	List<Double> coeficientes = new ArrayList<Double>();
	
	//Genero los getters y setters
	public List<Double> getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes(List<Double> coeficientes) {
		this.coeficientes = coeficientes;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param coeficientes siendo coeficientes[0] el valor que
	 * corresponde al termino independiente.
	 *
	 * e.g.
	 *
	 * f(x) = coeficientes[0]
	 * 		+ coeficientes[1] * x
	 * 		+ coeficientes[2] * x^2
	 * 		+ ...
	 *
	 * coeficientes = [1, 0, 2, 1, -1]
	 * f(x) = 1 x^0 + 0 x^1 + 2 x^2 + 1 x^3 - 1 x^4
	 *
	 */
	
	
	public EcuacionPolinomica(List<Double> coeficientes) {
		if (coeficientes == null) {
			throw new RuntimeException("No implementado");
		} else {
			this.coeficientes = coeficientes;
		}
	}

	

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) 
	{
		Iterator i = this.coeficientes.iterator();
		Double resultado=0.0;
		Double elemento;
		int exponente=(this.coeficientes.size())-1;
		while(i.hasNext())
		{
			elemento=(Double)(i.next()); //hay que castear lo que trae el iterador, porque por defecto es un Object
			resultado += elemento*(Math.pow(x, exponente));
			exponente--;
		}
		
		return resultado;
		//throw new RuntimeException("No implementado");
		
	}

}
