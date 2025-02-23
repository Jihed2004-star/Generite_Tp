package generecite_tp;
import java.util.HashMap;
class Banque {
    private HashMap<Integer, Compte<?>> comptes = new HashMap<>();


    public void ajouterCompte(Compte<?> compte) {
        comptes.put(compte.numeroCompte, compte);
        System.out.println("Compte ajoute : " + compte.numeroCompte);
    }

    public Compte<?> rechercherCompte(int numeroCompte) {
        return comptes.get(numeroCompte);
    }

    public void supprimerCompte(int numeroCompte) {
        if (comptes.remove(numeroCompte) != null) {
            System.out.println("Compte " + numeroCompte + " supprime");
        } else {
            System.out.println("Compte introuvable");
        }
    }

}
