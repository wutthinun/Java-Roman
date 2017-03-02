import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class Roman {

	static Map<Integer, String> m = new TreeMap<Integer, String>(Collections.reverseOrder());
	
	public static void main(String[] args) {
		m.put(1000,"M");
		m.put(900,"CM");
		m.put(500,"D");
		m.put(400,"CD");
		m.put(100,"C");
		m.put(90,"IC");
		m.put(50,"L");
		m.put(40,"XL");
		m.put(10,"X");
		m.put(9,"IX");
		m.put(5,"V");
		m.put(4,"IV");
		m.put(1,"I");
		
		String s = roman(1655);
		System.out.println(s);


	}
	
	public static String roman(Integer number) {
		for(Map.Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();

			if(number >= key ) {
				return value + roman(number-key);
			}
		}	
		return "";
	}

}
