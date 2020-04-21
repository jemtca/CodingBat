import java.util.List;
import java.util.Arrays;

public class functional1 {

	// given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together
	public List<String> copies3(List<String> strings) {
		
		strings.replaceAll(n -> n + n + n);
		
		return strings;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<String> l1 = Arrays.asList("a", "bb", "ccc");
		List<String> l2 = Arrays.asList("24", "a", "");
		List<String> l3 = Arrays.asList("hello", "there");
		
		System.out.println(o.copies3(l1));
		System.out.println(o.copies3(l2));
		System.out.println(o.copies3(l3));

	}

}
