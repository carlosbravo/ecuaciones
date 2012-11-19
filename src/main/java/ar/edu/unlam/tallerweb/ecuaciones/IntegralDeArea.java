package ar.edu.unlam.tallerweb.ecuaciones;
public class IntegralDeArea {
	public final Double calcular(final Ecuacion ecuacion, Double inicio, final Double fin, final Double incremento) 
	{
		if (inicio > fin) {
			throw new RuntimeException("El inicio no puede ser mayor que el fin");
		} else {
			Double resultado = 0.0;
			Double cantRectangulos = (fin - inicio) / incremento;
			Double areaRectangulo;
			Double base = incremento;
			int i = 0;
			for (i = 0; i < cantRectangulos; i++) 
			{
				areaRectangulo =  Math.abs (base * (ecuacion.resolver(inicio + (base/2))));
				resultado += areaRectangulo;
				inicio+=incremento;
			}
			System.out.printf("valor de i: " + i);
			System.out.printf("Resultado: " + resultado);
			return resultado;
		}
	}
}
