package Megarwin;

import java.util.HashMap;
import java.util.Map;

public class mapping {

	public static void main(String[] args) {
        String name = "megarwin jaya rajaa";

        Map<Character, Integer> count = new HashMap<Character, Integer>();

        
        name = name.replaceAll(" ", "");

        
        for (char c : name.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
	
	
	
	
}
