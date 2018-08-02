package package1;

public class Prof extends Personne {
public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public boolean isAgregation() {
		agregation = false;
		return agregation;
	}
	public void setAgregation(boolean agregation) {
		this.agregation = agregation;
	}
	public int getNbreClasse() {
		return nbreClasse;
	}
	public void setNbreClasse(int nbreClasse) {
		this.nbreClasse = nbreClasse;
	}
	public String getComportement() {
		return comportement;
	}
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	public boolean isRemplacant() {
		return remplacant;
	}
	public void setRemplacant(boolean remplacant) {
		this.remplacant = remplacant;
	}
	
String matiere;
boolean agregation = false;
int nbreClasse;
String comportement;
boolean remplacant;
}
