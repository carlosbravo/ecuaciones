package ar.edu.unlam.tallerweb.ecuaciones;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;



/**
 * Agregue los tests que considere necesarios. Se proporciona un test
 * a modo de testigo.
 *
 */
public class EcuacionTest {
	
	//TESTS PARA LA ECUACION LINEAL
	
	@Test
	public void crearNuevaEcuacionLineal()
	{
		Double m=2.0;
		Double b=3.0;
		
		EcuacionLineal lineal = new EcuacionLineal(m,b);
		Assert.assertEquals(m,lineal.getM());
		Assert.assertEquals(b,lineal.getB());

	}
	
	@Test
	public void testEcuacionLineal() 
	{
		Double resultObtenido;
		Double resultEsperado=11.0;//2x+3
		EcuacionLineal lineal = new EcuacionLineal(2.0,3.0);
		resultObtenido=lineal.resolver(4.0);
		Assert.assertEquals(resultEsperado,resultObtenido);
		System.out.printf("El resultado de la operacion es: " + resultObtenido + " y el esperado es: " + resultEsperado + "\n");
		//fail("No implementado");
	}
	
	//FINALIZAN LOS TESTS DE LA ECUACION LINEAL
	
	//TESTS PARA LA ECUACION CUADRATICA
	@Test
	public void crearNuevaEcuacionCuadratica()
	{
		Double a=3.0;
		Double b=5.0;
		Double c=8.0;
		
		EcuacionCuadratica cuadratica = new EcuacionCuadratica(a,b,c);
		Assert.assertEquals(a,cuadratica.getA());
		Assert.assertEquals(b,cuadratica.getB());
		Assert.assertEquals(c,cuadratica.getC());
		c=9.0;
		cuadratica.setC(9.0);
		Assert.assertEquals(c,cuadratica.getC());
	}
	
	@Test
	public void testEcuacionCuadratica()
	{
		Double resultObtenido;
		Double resultEsperado=29.0;//3x^2+5x+7
		EcuacionCuadratica cuadratica = new EcuacionCuadratica(3.0,5.0,7.0);
		resultObtenido=cuadratica.resolver(2.0);//Donde x=2
		Assert.assertEquals(resultEsperado,resultObtenido);
		System.out.printf("El resultado de la operacion es: " + resultObtenido + " y el esperado es: " + resultEsperado + "\n");
	}
	
	//FINALIZAN LOS TESTS DE LA ECUACION CUADRATICA
	
	//TESTS PARA LA ECUACION POLINOMICA
	
	@Test
	public void crearNuevaEcuacionPolinomica()
	{
		Double elementoActual,elementoRecibido;

		List<Double> listaRecibida = new ArrayList<Double>();//Va almacenar la lista que reciba del getter getCoeficientes de la clase EcuacionPolinomica		
		List<Double> listaDeCoeficientes = new ArrayList<Double>();
		
		listaDeCoeficientes.add(7.0);
		listaDeCoeficientes.add(5.0);
		listaDeCoeficientes.add(3.0);
		
		EcuacionPolinomica polinomica = new EcuacionPolinomica(listaDeCoeficientes);
		
		listaRecibida=polinomica.getCoeficientes();
		
		Iterator i = listaDeCoeficientes.iterator();
		Iterator j = listaRecibida.iterator();
		 
		while(i.hasNext() && j.hasNext())
		{
			elementoActual=(Double)(i.next());
			elementoRecibido=(Double)(j.next());
			Assert.assertEquals (elementoActual, elementoRecibido);
		}
		
	}
	
	@Test
	public void testEcuacionPolinomica()
	{
		Double resultObtenido;
		Double resultEsperado=15.0;//3x^3+2x^2+5x^1+2x^0;
		List<Double> listaDeCoeficientes = new ArrayList<Double>();
		listaDeCoeficientes.add(2.0);
		listaDeCoeficientes.add(3.0);
		listaDeCoeficientes.add(1.0);
		//listaDeCoeficientes.add(2.0);
		
		EcuacionPolinomica polinomica= new EcuacionPolinomica(listaDeCoeficientes);
		resultObtenido=polinomica.resolver(2.0);//Donde x=2
		Assert.assertEquals(resultEsperado,resultObtenido);
		System.out.printf("El resultado de la operacion es: " + resultObtenido + " y el esperado es: " + resultEsperado + "\n");
	}
	
	//FINALIZAN LOS TESTS DE LA ECUACION POLINOMICA
}