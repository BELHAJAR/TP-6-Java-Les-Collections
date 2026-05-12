package miniprojet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class  TestProjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       ArrayList<SystemGestion> gestion=new ArrayList<>();
       gestion.add(new SystemGestion(1, "titre 1", "auteur 1",2013));
       gestion.add(new SystemGestion(5, "titre 5", "auteur 5",2006));
       gestion.add(new SystemGestion(3, "titre 3", "auteur 3",2003));
       gestion.add(new SystemGestion(8, "titre 8", "auteur 8",2021));
       gestion.add(new SystemGestion(10, "titre 10", "auteur 10",2015));
       HashSet<String> categorie= new HashSet<>();
       HashMap<String,SystemGestion> liste= new HashMap<>();
       String rechLivre="titre 1";
       for(SystemGestion l : gestion) {
    	   if(l.Titre.equals(rechLivre)) {
    		   System.out.println("le Livre est trouver"+l);
        	   System.out.println("=======================");

    	   }
       }
       gestion.removeIf(l -> l.ISBN == 3);
       for(SystemGestion li : gestion) {
    	   System.out.println("le ISBN : " +li.ISBN);
    	   System.out.println("le titre : "+li.Titre);
    	   System.out.println("Lauteur"+li.Auteur);
    	   System.out.println("Lannee"+li.année);
    	   System.out.println("=======================");


       }
	}

}
