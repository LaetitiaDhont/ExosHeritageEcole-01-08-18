package package1;

public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prof Athanasia = new Prof();
		
		
		Athanasia.setNom("Katsouraki");
		Athanasia.setPrenom("Athanasia");
		Athanasia.setAge(31);
		Athanasia.setAdresse("4 rue serpollet 75020 Paris");
		Athanasia.setAgregation(true);
		Athanasia.setSalaire(10000);
		Athanasia.setNbreClasse(1);
		Athanasia.setRemplacant(false);
		Athanasia.setComportement("Super!!!");
		Athanasia.setMatiere("Java");
		Athanasia.setMail("akatsouraki@simplon.co");
		
		
		
		System.out.println("\nLe professeur de cette classe s'appelle " + " " + Athanasia.getPrenom() + " " + Athanasia.getNom() );
		System.out.println("\nElle a " + Athanasia.getAge() + " " + "elle habite " + " " + Athanasia.getAdresse() + " " + "elle a " + Athanasia.getNbreClasse() + " classe");
		System.out.println("\n Si vous souhaitez la contacter, son adresse mail c'est : " + Athanasia.getMail() + " " + "Son comportement avec ses élèves est " + Athanasia.getComportement() );
		System.out.println("\n Elle enseigne le " + Athanasia.getMatiere() );
		
	}

}
