package mypackage;

public class Personne {
	private String role;
	private String nomme;
	private String telephone;
	private String email;
	
	public Personne() {}
	
	public Personne(String nomme, String telephone, String email) {
		this.nomme = nomme;
		this.telephone = telephone;
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNomme() {
		return nomme;
	}

	public void setNomme(String nomme) {
		this.nomme = nomme;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Personne [nomme= " + nomme + ", telephone= " + telephone + ", email= " + email + " ]";
	}
}
