import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of strings, return a list of the strings, omitting any string that contains a "z"
	public List<String> noZ(List<String> strings) {
		
		strings.removeIf(n -> n.contains("z"));
		
		return strings;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<String> l1 = Arrays.asList("aaa", "bbb", "aza");
		List<String> l2 = Arrays.asList("hziz", "hzello", "hi");
		List<String> l3 = Arrays.asList("hello", "howz", "are", "youz");
		
		System.out.println(o.noZ(l1));
		System.out.println(o.noZ(l2));
		System.out.println(o.noZ(l3));

	}

}
