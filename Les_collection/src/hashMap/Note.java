package hashMap;
import java.util.HashMap;
import java.util.Map;

public class Note {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> not=new HashMap<>();
		not.put("nom1",19.5);
		not.put("nom2",14.5);
		not.put("nom3",12.5);
		not.put("nom4",15.5);
		not.put("nom5",18.5);
		
		for(Map.Entry<String,Double> n : not.entrySet()) {
			System.out.println(n.getKey()+" : "+n.getValue());
		}
		System.out.println("=========================");
		for(Double n : not.values()) {
			System.out.println("afichage de note");
			System.out.println(n);
		}
		System.out.println("=========================");
		not.put("nom4", 11.4);
		System.out.println("Modifier une valeur "+not.get("naom4"));
		System.out.println("=========================");
	
		not.remove("nom3");
		System.out.println("afichage apres la suppression");
		for(Map.Entry<String,Double> n : not.entrySet()) {
			System.out.println(n.getKey()+" : "+n.getValue());
		}
		System.out.println("=========================");
		double somme=0;
		for(Double n : not.values()) {
			somme+=n;
		}
		double moyenne=somme/not.size();
		System.out.println("la moyenne est : "+ moyenne);
	}

}
