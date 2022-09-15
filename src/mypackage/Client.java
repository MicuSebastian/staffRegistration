package mypackage;

public class Client extends Personne{
	
	private String role = "Client";
	
	public Client(String nomme, String telephone, String email) {
		super(nomme, telephone, email);
		super.setRole(role);
	}

	public String getRole() {
		return role;
	}
	
	public void createFormulaire(Formulaire form) {}

	@Override
	public String toString() {
		return "Client [\nRole=" + role + ", \nNomme=" + getNomme() + ", \nTelephone=" + getTelephone()
		+ ", \nEmail=" + getEmail() + "\n]\n";
	}
}
