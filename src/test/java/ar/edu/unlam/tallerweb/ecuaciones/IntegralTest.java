package ar.edu.unlam.tallerweb.ecuaciones;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test a modo de
 * testigo.
 * 
 */
public class IntegralTest {

	@Test
	public void areaBajoLaIdentidad() {

		Ecuacion ecuacion = new EcuacionLineal(1.0, 0.0);

		IntegralDeArea integral = new IntegralDeArea();
		Double incremento = 0.01;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 1.0, incremento);

		
		Double precision = 0.01;
		Double areaEsperada = 0.5;
		assertEquals(
				"Se espera que el area bajo la recta identidad entre 0 y 1 sea 1/2",
				areaEsperada, areaObtenida.doubleValue(), precision);
		
		
		//El mismo test de arriba con otros valores
		/*Ecuacion ecuacion = new EcuacionLineal(1.0000, 2.0000);

		IntegralDeArea integral = new IntegralDeArea();
		Double incremento = 1.00000;
		Double areaObtenida = integral.calcular(ecuacion, 1.0000, 3.0000, incremento);

		
		Double precision = 0.01;
		Double areaEsperada = 8.0000;
		assertEquals(
				"Se espera que el area bajo la recta identidad entre 0 y 1 sea 1/2",
				areaEsperada, areaObtenida.doubleValue(), precision);*/

	}

}
