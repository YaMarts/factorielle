package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTest {

	
	@Test
	@Ignore
	public void factorielle_de_0_doit_renvoyer1() {

		// Given
		long n = 0;
		Factorielle factorielle = new Factorielle();

		// When
		long resultat = factorielle.calculer(n);

		// Then
		assertEquals(1, resultat);

	}@Test
	public void factorielle_de_1_doit_renvoyer1() {

		// Given
		long n = 1;
		Factorielle factorielle = new Factorielle();

		// When
		long resultat = factorielle.calculer(n);

		// Then
		assertEquals(1, resultat);

	}
	@Test
	public void factorielle_de_2_doit_renvoyer_2() {
		
		// Given
		long n = 2;
		Factorielle factorielle = new Factorielle();

		// When
		long resultat = factorielle.calculer(n);
		
		// Then
		assertEquals(2, resultat);
		
	}
		
		@Test
		public void factorielle_de_4_doit_renvoyer_24() {
			
			// Given
			long n = 4;
			Factorielle factorielle = new Factorielle();

			// When
			long resultat = factorielle.calculer(n);
			
			// Then
			assertEquals(24, resultat);
		}
			@Test
			public void factorielle_de__19_doit_renvoyer_121645100408832000() {
				
				// Given
				long n = 19;
				Factorielle factorielle = new Factorielle();

				// When
				long resultat = factorielle.calculer(n);
				
				// Then
				assertEquals(121645100408832000l, resultat);

	}

}
