import java.util.List;
import java.util.Arrays;


public class functional1 {

	// given a list of strings, return a list where each string has all its "x" removed
	public List<String> noX(List<String> strings) {
		
		strings.replaceAll(n -> n.replace("x", ""));
		
		return strings;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<String> l1 = Arrays.asList("ax", "bb", "cx");
		List<String> l2 = Arrays.asList("xxax", "xbxbx", "xxcx");
		List<String> l3 = Arrays.asList("x");
		
		System.out.println(o.noX(l1));
		System.out.println(o.noX(l2));
		System.out.println(o.noX(l3));

	}

}
