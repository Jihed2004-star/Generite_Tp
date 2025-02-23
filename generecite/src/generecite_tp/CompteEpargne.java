package generecite_tp;

public class CompteEpargne<T> extends Compte<T> {
	private double tauxInteret;

	public CompteEpargne(int numeroCompte, double solde, T devise, double tauxInteret) {
		super(numeroCompte, solde, devise);
		this.tauxInteret = tauxInteret;
	}
	public void calculerInteret() {
		solde=solde+solde*tauxInteret;
	}
	public void afficherSolde() {
		System.out.println("Compte Eparge- Solde :"+solde+" "+devise);
		
	}

}
