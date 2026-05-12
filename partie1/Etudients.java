package partie1;

public class Etudients {
	int id;
	String nom;
	double moyenne;
	
	public Etudients(int id,String nom,double moyenne) {
		this.id=id;
		this.nom=nom;
		this.moyenne=moyenne;
		
	}
	
	public String afficher() {
		return "ID : "+ id +"| NOM : "+ nom +"|MOYENNE : "+ moyenne ;
	}

}

