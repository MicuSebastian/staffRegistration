package mypackage;

public class Statistique {
	
	public Statistique() {}
	
	public void display() {
		double vax = 0;
		double nvax = 0;
		double pas = 0;
		double test = 0;
		double exc = 0;
		double size = Administrateur.listaFormulaires.size();
		
		for (Formulaire f : Administrateur.listaFormulaires) {
			if (f.getCertificatVerde() == StatusMedical.VACCINEE) {
				vax++;
			}
			
			if (f.getCertificatVerde() == StatusMedical.NEVACCINEE) {
				nvax++;
			}
			
			if (f.getCertificatVerde() == StatusMedical.GUERIE) {
				pas++;
			}
			
			if (f.getCertificatVerde() == StatusMedical.TESTEE) {
				test++;
			}
			
			if (f.getCertificatVerde() == StatusMedical.EXCEPTEE) {
				exc++;
			}
		}
		
		System.out.println("Les pourcentages dans l'institution sont: [\nPersonnes vaccinees: " + Math.round(vax/size*10000)/100.0 + "%\nPersonnes nevaccinees: " + Math.round(nvax/size*10000)/100.0  + "%\nPersonnes gueries: " + Math.round(pas/size*10000)/100.0  + "%\nPersonnes testees: " + Math.round(test/size*10000)/100.0  + "%\nPersonnes exceptees: " + Math.round(exc/size*10000)/100.0  + "%\n]");
	}
}
