package mapInterface;

import java.util.HashMap;
import java.util.Map;


//i adde one line here kushal
//this is my commit
public class HashMapDemo {

	public static void main(String[] args) {
		//blank hashMap
		//Map<key, value>   hm= new HashMap<>();
		
		Map<String, String> hm= new HashMap<>();
		//add entry ---->put()
		
		hm.put("Sagar",  "USA");
		hm.put("Dvya","USA");
		hm.put("Shubhadra","Nepal");
		hm.put(null,"Nepal");
		
		System.out.println(hm);
		
		//this is a mapInterface project

	}

}
