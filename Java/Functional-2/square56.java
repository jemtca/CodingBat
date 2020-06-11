import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6
	public List<Integer> square56 (List<Integer> nums) {
		
		nums.replaceAll(n -> (n * n) + 10);
		nums.removeIf(n -> (n % 10 == 5) || (n % 10 == 6));
		
		return nums;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<Integer> l1 = Arrays.asList(3, 1, 4);
		List<Integer> l2 = Arrays.asList(1);
		List<Integer> l3 = Arrays.asList(2);
		
		System.out.println(o.square56 (l1));
		System.out.println(o.square56 (l2));
		System.out.println(o.square56 (l3));

	}

}
