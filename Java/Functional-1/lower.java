import java.util.List;
import java.util.Arrays;


public class functional1 {

	// given a list of strings, return a list where each string is converted to lower case
	public List<String> lower(List<String> strings) {
		
		strings.replaceAll(n -> n.toLowerCase());
		
		return strings;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<String> l1 = Arrays.asList("Hello", "Hi");
		List<String> l2 = Arrays.asList("AAA", "BBB", "ccc");
		List<String> l3 = Arrays.asList("KitteN", "ChocolaTE");
		
		System.out.println(o.lower(l1));
		System.out.println(o.lower(l2));
		System.out.println(o.lower(l3));

	}

}
