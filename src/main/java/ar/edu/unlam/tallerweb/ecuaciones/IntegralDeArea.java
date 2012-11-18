package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstraccion del calculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {

	/**
	 * Calcula el area bajo la curva, utilizando el metodo de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el area bajo la curva
	 */
	public Double calcular(Ecuacion ecuacion, Double inicio, Double fin, Double incremento) 
	{
		
		
		Double resultado = 0.0;
		Double cant_rectangulos = (fin - inicio) / incremento;
		Double area_rectangulo;
		Double base=incremento;
		int i=0;
		
		for (i = 0; i<cant_rectangulos; i++) 
		{
			area_rectangulo = base * (ecuacion.resolver(inicio+(base/2)));
			resultado+=area_rectangulo;
			inicio+=incremento;
		}
		
		System.out.printf("valor de i: "+i);
		System.out.printf("Resultado: "+resultado);
		return resultado;
		
		
		//throw new RuntimeException("No implementado");

	}

}
