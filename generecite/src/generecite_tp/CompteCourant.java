package generecite_tp;

public class CompteCourant<T> extends Compte<T>{
	private double limite;

	public CompteCourant(int numeroCompte, double solde, T devise, double limite) {
		super(numeroCompte, solde, devise);
		this.limite = limite;
	}
	public void retirer(double montant) {
		if(montant<limite)
			solde=solde-montant;
		else
			System.out.println("Limite !");
	}
	public void afficherSolde() {
		System.out.println("Compte Courant- Solde :"+solde+" "+devise);
	}

}
