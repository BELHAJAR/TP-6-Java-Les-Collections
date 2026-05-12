package partie1;
import java.util.ArrayList;
import java.util.Scanner ;
public class TestEtudient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayList<Etudients> Listes= new ArrayList<>();
		Listes.add(new Etudients(1,"nom1",13.1));
		Listes.add(new Etudients(2,"nom2",15.1));
		Listes.add(new Etudients(3,"nom3",18.1));
		Listes.add(new Etudients(4,"nom4",13.1));
		Listes.add(new Etudients(5,"nom5",10.1));
		System.out.println("Afficher tous les étudiants");
		for(Etudients l:Listes) {
			System.out.println("=============================");
			System.out.println("numero de id : " + l.id);
			System.out.println("nom : "+ l.nom);
			System.out.println("la moyenne : " + l.moyenne);
		}
		System.out.println("Rechercher un étudiant par son nom ");
		String nomrech= sc.nextLine();
		boolean trouve=false;
		for(Etudients l:Listes) {
			if(l.nom.equalsIgnoreCase(nomrech)) {
				System.out.println("numero de id : " + l.id);
				System.out.println("nom : "+ l.nom);
				System.out.println("la moyenne : " + l.moyenne);
				trouve=true;
			}	
		}
		if(!trouve){
			System.out.println("Il n y a pas ce nom ");
		}
		int idsupp= sc.nextInt();
		boolean suprime=false;
		for(int i=0 ; i< Listes.size();i++) {
			if(Listes.get(i).id == idsupp) {
				Listes.remove(i);
				suprime=true;	
			}
		}
		for(Etudients l:Listes) {
		if(suprime) {
			System.out.println("Etudient supprimer");			
				System.out.println("=============================");
				System.out.println("numero de id : " + l.id);
				System.out.println("nom : "+ l.nom);
				System.out.println("la moyenne : " + l.moyenne);
		}else {
			System.out.println("id introuvable");
		}}
		double max= sc.nextDouble();
		boolean moyennetrouve=false;
		for(Etudients l:Listes) {
			if(l.moyenne<=max) {
				System.out.println("la moyenne : " + l.moyenne);
				moyennetrouve=true;
			}
		}
		if(!moyennetrouve) {
			System.out.println("Aucun etudient trouver" );
		}
		Etudients meilleur=Listes.get(0);
		for(Etudients l:Listes) {
			if(l.moyenne>meilleur.moyenne) {
				meilleur=l;
			}	
		}
		System.out.println("meilleur id:"+meilleur.id );
		System.out.println("meilleur nom:"+meilleur.nom);
		System.out.println("meilleur moyenne:"+meilleur.moyenne );
	}

}
