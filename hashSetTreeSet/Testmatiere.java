package hashSetTreeSet;
import java.util.HashSet;
import java.util.TreeSet;

public class Testmatiere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> matiere = new HashSet<>();
		matiere.add("Math");
		matiere.add("Francais ");
		matiere.add("Java");
		matiere.add("arabe");
		matiere.add("java");
		matiere.add("arabe");
        
		System.out.println("===== verification si il ya des doublons=====");
		for(String m: matiere) {
			System.out.println("les matiere son doublons = "+m);
			
		}
		System.out.println("===== copier les matiere dans Treeset =====");
		TreeSet<String> matierecopie= new TreeSet<>(matiere);
		for(String copie: matierecopie) {
			System.out.println("les matiere trie par orde alphabitheque = "+ copie);
			
		}
		
	}

}
