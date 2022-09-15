package mypackage;

public class Compte {
	
	private Personne personne;
	private String password;
	
	public Compte (Personne personne, String password) {
		this.personne = personne;
		this.password = password;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Compte [\nPersonne= " + personne.toString() + ", Password=" + password + "\n]";
	}
}
