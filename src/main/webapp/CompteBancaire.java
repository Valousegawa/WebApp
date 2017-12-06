package cpt;
public class CompteBancaire {
	protected String numeroDeCompte;

	public CompteBancaire(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	public String interrogerCompte(String motdepasse) {
		String resultat = null;
		if (motdepasse.equals("motdepasse")) {
			Integer solde = calculDuSolde();
			resultat = "Information du compte:";
			resultat += numeroDeCompte;
			resultat += ".\r\n";
			resultat += "Votre compte est créditeur de ";
			resultat += solde.toString();
			resultat += "€";
		} else {
			gererErreurDeMotDePasse();
		}
		return resultat;
	}
	
	public Integer retournerSolde() {
		Integer solde = calculDuSolde();
		return solde;
	}

	protected Integer calculDuSolde() {
		Integer solde = new Integer(0);
		solde = 1000;
		solde += 100;
		solde -= 200;
		solde += 400;
		solde -= 300;
		return solde;
	}

	protected void gererErreurDeMotDePasse() {
		throw new RuntimeException("Erreur non gérée correctement");
	}
}