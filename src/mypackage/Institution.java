package mypackage;

public class Institution {

	public static void main(String[] args) {
		
		Administrateur p1 = new Administrateur("John", "0711222333", "john@admin.com");
		
		System.out.println(p1.toString());
		
		Employe p2 = new Employe("Mark", "0744555666", "mark@institution.com");
		
		System.out.println(p2.toString());
		
		Client p3 = new Client("Ana", "0700999999", "ana@gmail.com");
		
		System.out.println(p3.toString());
		
		System.out.println("On va creer un compte:");
		Compte c1 = new Compte(p2, "parola123");
		System.out.println(c1.toString() + "\n");
		
		p1.addCompte(c1);
		p1.addCompte(new Compte(p3, "altaparola"));
		p1.addCompte(new Compte(new Client("Brian", "0734555666", "brian@yahoo.com"), "cealaltaparola"));
		
		p1.showCompte("Mark");
		p1.showCompte("Eusebiu");
		p1.showCompte();
		
		Formulaire f1 = new Formulaire("10.01.2022", "scop", "1");
		Formulaire f2 = new Formulaire("12.01.2022", "1");


		p3.createFormulaire(f1);
		p3.createFormulaire(new Formulaire("11.01.2022", "altscop", "4"));
		p2.createFormulaire(f2);
		p2.createFormulaire(new Formulaire("11.01.2022", "5"));
		
		System.out.println("\nFormulaires initiales:");
		p2.printList();
		p1.printList();
		
		System.out.println("Formulaires apres la verification du status:");
		p1.setStatus(f2, "0");
		p2.setStatus(f1, "1");
		
		p2.printList();
		p1.printList();
		
		Statistique stats = new Statistique();
		
		Formulaire f3 = new Formulaire("13.10.2021", "1");
		Formulaire f4 = new Formulaire("15.10.2021", "2");
		Formulaire f5 = new Formulaire("10.08.2021", "3");
		Formulaire f6 = new Formulaire("27.10.2020", "4");
		Formulaire f7 = new Formulaire("27.10.2020", "5");
		Formulaire f8 = new Formulaire("03.12.2020", "5");
		Formulaire f9 = new Formulaire("19.11.2021", "4");
		Formulaire f10 = new Formulaire("19.11.2021", "1");
		Formulaire f11 = new Formulaire("19.11.2021", "2");

		p2.createFormulaire(f3);
		p2.createFormulaire(f4);
		p2.createFormulaire(f5);
		p2.createFormulaire(f6);
		p2.createFormulaire(f7);
		p2.createFormulaire(f8);
		p2.createFormulaire(f9);
		p2.createFormulaire(f10);
		p2.createFormulaire(f11);

		stats.display();

	}
}
