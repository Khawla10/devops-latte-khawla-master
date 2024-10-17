import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatriceTest {
	Calculatrice calcul = new Calculatrice();

	@Test
	public void testSomme() {
		assertEquals(25, calcul.Somme(10, 15));
	}

	@Test
	public void testDivision() {
		assertEquals(4, calcul.division(40, 10));
	}
}
