package linkedlistes;
import java.util.LinkedList;

public class Testclient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Client> c= new LinkedList<>();
		c.add(new Client(1,"nom1"));
		c.add(new Client(2,"nom2"));
		c.add(new Client(3,"nom3"));
		System.out.println("Aficher la liste de client");
		for(Client e:c) {
			System.out.println("le numero ="+e.numero);
			System.out.println("le nom ="+e.nom);
		}
		Client servi=c.removeFirst();
		System.out.println("=========Le premier client========== ");
		System.out.println("Le numero = "+ servi.numero);
		System.out.println("Le nom = "+ servi.nom);
        
		System.out.println("=========Ajoute dun autre dossier au fin de file========");
		c.addLast(new Client(4,"nom4"));
		Client afichedernier=c.getLast();
		System.out.println(afichedernier.numero);
		System.out.println(afichedernier.nom);
		System.out.println("=========Ajoute dun autre dossier au tete de file========");
		Client afichepremierclient=c.getFirst();
		System.out.println(afichepremierclient.numero);
		System.out.println(afichepremierclient.nom);
		System.out.println("======La nouvelle liste de client=========");
		for(Client e:c) {
			System.out.println("le numero ="+e.numero);
			System.out.println("le nom ="+e.nom);
		}


	}

}
