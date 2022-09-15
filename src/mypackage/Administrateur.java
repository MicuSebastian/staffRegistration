package mypackage;

import java.util.*;

public class Administrateur extends Personne{

	private String role = "Administrateur";
	private ArrayList<Compte> listaConturi = new ArrayList<Compte>();
	public static ArrayList<Formulaire> listaFormulaires = new ArrayList<Formulaire>();
	public static ArrayList<StatusFormular> status = new ArrayList<StatusFormular>();
	
	public Administrateur(Formulaire form, StatusFormular sf) {
		Administrateur.listaFormulaires.add(form);
		status.add(sf);
	}
	
	public Administrateur(String nomme, String telephone, String email) {
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

	public void printList() {
		System.out.println("\nFormulaires dans la gestion d'administrateur: \n");
		
		ListIterator<Formulaire> iter = listaFormulaires.listIterator();
		int counter = 0;
		while (iter.hasNext()) {
			Formulaire c = iter.next();
			System.out.println(c.toString());
			System.out.println("Status= " + status.get(counter) + "\n");
			counter++;
		}
	}

	public String getRole() {
		return role;
	}
	
	public void addCompte(Compte compte) {
		listaConturi.add(compte);
	}
	
	public void showCompte(String... name) {
		if (name.length == 0) {
			System.out.println("\nComptes dans la gestion d'administrateur: \n");
			
			ListIterator<Compte> iter = listaConturi.listIterator();
			
			while (iter.hasNext()) {
				Compte c = iter.next();
				System.out.println(c.toString());
			}
		} else {
			ListIterator<Compte> iter = listaConturi.listIterator();
			
			String nomme = Arrays.toString(name);
			nomme = nomme.substring(1, nomme.length() - 1);
			
			boolean checker = true;
			while (iter.hasNext()) {
				Compte c = iter.next();
				if (c.getPersonne().getNomme().equals(nomme)) {
					System.out.println("Le compte existe:\n");
					System.out.println(c.toString());
					checker = false;
				}
			}
			if (checker) {
				System.out.println("\nErreur: Le compte avec le nomme= " + nomme + " n'existe pas!");
			}
		}
		
	}
	
	@Override
	public String toString() {
		return "Administrateur [\nRole=" + role + ", \nNomme=" + getNomme() + ", \nTelephone=" + getTelephone()
		+ ", \nEmail=" + getEmail() + "\n]\n";
	}
}
