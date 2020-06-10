import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2
	public List<Integer> two2(List<Integer> nums) {
		
		nums.replaceAll(n -> n * 2);
		nums.removeIf(n -> n % 10 == 2);
		
		return nums;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(2, 6, 11);
		List<Integer> l3 = Arrays.asList(0);
		
		System.out.println(o.two2(l1));
		System.out.println(o.two2(l2));
		System.out.println(o.two2(l3));

	}

}
