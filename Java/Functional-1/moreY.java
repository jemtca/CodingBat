import java.util.List;
import java.util.Arrays;


public class functional1 {

	// given a list of strings, return a list where each string has "y" added at its start and end
	public List<String> rightDigit(List<String> strings) {
		
		strings.replaceAll(n -> "y" + n + "y");
		
		return strings;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<String> l1 = Arrays.asList("a", "b", "c");
		List<String> l2 = Arrays.asList("hello", "there");
		List<String> l3 = Arrays.asList("yyayy");
		
		System.out.println(o.rightDigit(l1));
		System.out.println(o.rightDigit(l2));
		System.out.println(o.rightDigit(l3));

	}

}
