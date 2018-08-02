package package1;

public class Secretaire extends Personne {

public int getNbreDossier() {
		return nbreDossier;
	}
	public void setNbreDossier(int nbreDossier) {
		this.nbreDossier = nbreDossier;
	}
	public int getNbreSurveillant() {
		return nbreSurveillant;
	}
	public void setNbreSurveillant(int nbreSurveillant) {
		this.nbreSurveillant = nbreSurveillant;
	}
	public int getNbreProf() {
		return nbreProf;
	}
	public void setNbreProf(int nbreProf) {
		this.nbreProf = nbreProf;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getAcademie() {
		return academie;
	}
	public void setAcademie(String academie) {
		this.academie = academie;
	}
int nbreDossier;
int nbreSurveillant;
int nbreProf;
String departement;
String academie;
}
