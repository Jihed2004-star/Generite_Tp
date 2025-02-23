package generecite_tp;

public class Compte <T> {
	protected T String;
	protected int numeroCompte;
	protected  double solde;
	protected T devise;
	public Compte(int numeroCompte, double solde, T devise) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.devise = devise;
	}
	public void deposer(double montant) {
		solde=solde+montant;
	}
	public void retirer(double montant) {
		solde=solde-montant;
	}
	public void afficherSolde() {
		System.out.println("Votre Solde = "+solde);
	}
	public static<T> void transfer(double montant,Compte e1,Compte e2) {
		e1.solde=e1.solde-montant;
		e2.solde=e2.solde+montant;
	}
}
