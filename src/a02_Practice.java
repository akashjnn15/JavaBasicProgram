import java.util.HashMap;
import java.util.Map;

class a02_Practice {
	
	public static void main(String[] args) {
		String x = "Akash";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < x.length(); i++) {
			if (hm.containsKey(x.charAt(i))) {
				int count = hm.get(x.charAt(i)) + 1;
				hm.put(x.charAt(i), count);
			} else {
				hm.put(x.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() > 1) // for occurring of duplicate/greater than 1
				System.out.println(hm1.getKey() + " = " + hm1.getValue());
		}

	}
}