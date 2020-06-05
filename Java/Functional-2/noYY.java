import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere
	public List<String> noYY(List<String> strings) {
		
		strings.replaceAll(n -> n + "y");
		strings.removeIf(n -> n.contains("yy"));
		
		return strings;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<String> l1 = Arrays.asList("a", "b", "c");
		List<String> l2 = Arrays.asList("a", "b", "cy");
		List<String> l3 = Arrays.asList("xx", "ya", "zz");
		
		System.out.println(o.noYY(l1));
		System.out.println(o.noYY(l2));
		System.out.println(o.noYY(l3));

	}

}
