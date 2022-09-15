package mypackage;

import java.util.*;

public class Employe extends Personne{
	
	private String role = "Employe";
	public static ArrayList<Formulaire> listaFormulaires = new ArrayList<Formulaire>();
	public static ArrayList<StatusFormular> status = new ArrayList<StatusFormular>();
	
	public Employe(Formulaire form, StatusFormular sf) {
		Employe.listaFormulaires.add(form);
		status.add(sf);
	}
	
	public Employe(String nomme, String telephone, String email) {
		super(nomme, telephone, email);
		super.setRole(role);
	}
	
	public void setStatus (Formulaire form, String verdict) {
		int counter = 0;
		for (Formulaire f : listaFormulaires) {
			if (f == form) {
				if (verdict == "0") {
					status.set(counter, StatusFormular.VALIDEE);
				} else {
					status.set(counter, StatusFormular.NEVALIDEE);
				}
			}
			counter++;
		}
	}

	public String getRole() {
		return role;
	}
	
	public void printList() {
		System.out.println("\nFormulaires dans la gestion des employees: \n");
		
		ListIterator<Formulaire> iter = listaFormulaires.listIterator();
		int counter = 0;
		while (iter.hasNext()) {
			Formulaire c = iter.next();
			System.out.println(c.toString());
			System.out.println("Status= " + status.get(counter) + "\n");
			counter++;
		}
	}
	
	public void createFormulaire(Formulaire form) {}
	
	public int getNoFormulaires() {
		return listaFormulaires.size();
	}
	
	public String verifStatusAttendant(Formulaire f) {
		ListIterator<Formulaire> iter = listaFormulaires.listIterator();
		int counter = 0;
		while (iter.hasNext()) {
			Formulaire c = iter.next();
			if (c == f) {
				if (status.get(counter) == StatusFormular.ATTENDANT) {
					return "true";
				}
			}
			counter++;
		}
		return "false";
	}

	@Override
	public String toString() {
		return "Employe [\nRole=" + role + ", \nNomme=" + getNomme() + ", \nTelephone=" + getTelephone()
		+ ", \nEmail=" + getEmail() + "\n]\n";
	}
}
