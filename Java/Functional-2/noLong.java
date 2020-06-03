import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of strings, return a list of the strings, omitting any string length 4 or more
	public List<String> noLong(List<String> strings) {
		
		strings.removeIf(n -> n.length() >= 4);
		
		return strings;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<String> l1 = Arrays.asList("this", "not", "too", "long");
		List<String> l2 = Arrays.asList("a", "bbb", "cccc");
		List<String> l3 = Arrays.asList("cccc", "cccc", "cccc");
		
		System.out.println(o.noLong(l1));
		System.out.println(o.noLong(l2));
		System.out.println(o.noLong(l3));

	}

}
