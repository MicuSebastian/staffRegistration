package mypackage;

public class Formulaire {
	
	private String date;
	private String raison = "";
	private StatusMedical CertificatVerde;
	
	public Formulaire(String date, String CertificatVerde) {
		this.date = date;
		
		if (CertificatVerde == "1") {
			this.CertificatVerde = StatusMedical.VACCINEE;
		}
		
		if (CertificatVerde == "2") {
			this.CertificatVerde = StatusMedical.NEVACCINEE;
		}
		
		if (CertificatVerde == "3") {
			this.CertificatVerde = StatusMedical.GUERIE;
		}
		
		if (CertificatVerde == "4") {
			this.CertificatVerde = StatusMedical.TESTEE;
		}
		
		if (CertificatVerde == "5") {
			this.CertificatVerde = StatusMedical.EXCEPTEE;
		}
		
		Administrateur adm = new Administrateur(this, StatusFormular.ATTENDANT);
	}
	
	public Formulaire(String date, String raison, String CertificatVerde) {
		this.date = date;
		this.raison = raison;
		
		if (CertificatVerde == "1") {
			this.CertificatVerde = StatusMedical.VACCINEE;
		}
		
		if (CertificatVerde == "2") {
			this.CertificatVerde = StatusMedical.NEVACCINEE;
		}
		
		if (CertificatVerde == "3") {
			this.CertificatVerde = StatusMedical.GUERIE;
		}
		
		if (CertificatVerde == "4") {
			this.CertificatVerde = StatusMedical.TESTEE;
		}
		
		if (CertificatVerde == "5") {
			this.CertificatVerde = StatusMedical.EXCEPTEE;
		}
		
		Employe emp = new Employe(this, StatusFormular.ATTENDANT);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	public StatusMedical getCertificatVerde() {
		return CertificatVerde;
	}

	public void setCertificatVerde(StatusMedical certificatVerde) {
		CertificatVerde = certificatVerde;
	}

	@Override
	public String toString() {
		if (this.raison == "") {
			return "Formulaire [\nDate=" + date + ", \nCertificatVerde=" + CertificatVerde + "\n]";
		} else {
			return "Formulaire [\nDate=" + date + ", \nRaison= " + raison + ", \nCertificatVerde=" + CertificatVerde + "\n]";
		}
	}
}
