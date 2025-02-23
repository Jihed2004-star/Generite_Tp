package generecite_tp;
class AccesInterditException extends Exception{};

public class CompteCourantSecurise<T> extends CompteCourant<T> implements Securisable {
	private String Id;
	

	public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limite,String id) {
		super(numeroCompte, solde, devise, limite);
		Id = id;
	}


	@Override
	public boolean verifierIdentite(String identifiant) throws AccesInterditException{
		try {
			boolean test=Id.equals(identifiant);
			if (test==true)
				return true;
			else
				throw new AccesInterditException();
				
		}
		
		catch(AccesInterditException e) {
			System.out.println("Impossible Daccess");
		}
		return false;
		
	}

}
