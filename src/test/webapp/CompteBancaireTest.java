package cpt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cpt.CompteBancaire;

public class CompteBancaireTest {
	@Test
	public void testInterrogerCompte() {
		CompteBancaire compte = new CompteBancaire("0123456789");
		String verif = "Information du compte:0123456789.\r\n";
		verif += "Votre compte est créditeur de 1000€";
		assertEquals(verif, compte.interrogerCompte("motdepasse"));
	}

	@Test
	public void testCalculSolde() {
		CompteBancaire compte = new CompteBancaire("0123456789");
		Integer verif = 1000;
		assertEquals(verif, compte.retournerSolde());
	}

	@Test
	public void testWrongMDP() {
		CompteBancaire compte = new CompteBancaire("0123456789");
		try {
			String verif = "Information du compte:0123456789.\r\n";
			verif += "Votre compte est créditeur de 1000€";
			assertEquals(verif, compte.interrogerCompte("motdepasse2"));
		} catch (RuntimeException aExp) {
			assert (aExp.getMessage().contains("Erreur non gérée correctement"));
		}
	}
}
