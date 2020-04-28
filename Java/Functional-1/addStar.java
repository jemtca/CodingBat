import java.util.List;
import java.util.Arrays;


public class functional1 {

	// given a list of strings, return a list where each string has "*" added at its end
	public List<String> addStar(List<String> strings) {
		
		strings.replaceAll( n -> n + "*");
		
		return strings;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<String> l1 = Arrays.asList("a", "bb", "ccc");
		List<String> l2 = Arrays.asList("hello", "there");
		List<String> l3 = Arrays.asList("*");
		
		System.out.println(o.addStar(l1));
		System.out.println(o.addStar(l2));
		System.out.println(o.addStar(l3));

	}

}
