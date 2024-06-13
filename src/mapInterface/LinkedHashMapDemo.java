package mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> LinkedHM = new LinkedHashMap<>();
		LinkedHM.put(1, "Yougendra");
		LinkedHM.put(2, "Sugendra");
		LinkedHM.put(3, "Vugendra");
		LinkedHM.put(4, "Lugendra");
		LinkedHM.put(5, "Bigendra");
		LinkedHM.put(6, "Tugendra");
		LinkedHM.put(7, "Hegendra");
		LinkedHM.put(null, "Nagendra");
		
		System.out.println(LinkedHM);
		
		}

}
