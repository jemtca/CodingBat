import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of strings, return a list of the strings, omitting any string length 3 or 4
	public List<String> noLong(List<String> strings) {
		
		strings.removeIf(n -> n.length() == 3 || n.length() == 4);
		
		return strings;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<String> l1 = Arrays.asList("a", "bb", "ccc");
		List<String> l2 = Arrays.asList("a", "bb", "ccc", "dddd");
		List<String> l3 = Arrays.asList("ccc", "dddd", "apple");
		
		System.out.println(o.noLong(l1));
		System.out.println(o.noLong(l2));
		System.out.println(o.noLong(l3));

	}

}
