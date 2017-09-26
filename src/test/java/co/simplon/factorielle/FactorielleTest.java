package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void factorielle_de_1_doit_renvoyer1() {
		
		//Given
		long n= 1;
		Factorielle factorielle = new Factorielle ();
		
		//When
		long resultat = factorielle.calculer(n);
		
		//Then
		assertEquals(1, resultat);
		
		
	}

}
