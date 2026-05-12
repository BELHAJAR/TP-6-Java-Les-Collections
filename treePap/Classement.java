package treePap;
import java.util.Map;
import java.util.TreeMap;
public class Classement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> cl=new TreeMap<>();
		cl.put(5,"Nom 5");
		cl.put(302,"Nom 3");
		cl.put(215,"Nom 2");
		cl.put(10,"Nom 1");
		cl.put(450,"Nom 4");
		cl.put(100,"Nom 1");
		for(Map.Entry<Integer,String> n : cl.entrySet()) {
			System.out.println(n.getValue()+" : "+n.getKey());
		}
		System.out.println("============================");
		System.out.println("Le premiet element : "+cl.firstKey());
		System.out.println("Le dernier element : "+cl.lastKey());
		System.out.println("============================");
		for(Map.Entry<Integer,String> n : cl.tailMap(101).entrySet()) {
			System.out.println(n.getValue()+" : "+n.getKey());
		}
	}

}
