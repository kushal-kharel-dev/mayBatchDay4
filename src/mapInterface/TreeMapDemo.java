package mapInterface;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String>  tm= new TreeMap<>();
								tm.put(1, "Yugta");
								tm.put(2, "Yugta");
								tm.put(3, "Yugta");
								tm.put(4, "Yugta");
								tm.put(5, "Yugta");
								//tm.put(null, "Yugta"); not allowed
								
								System.out.println(tm);
		

	}

}
