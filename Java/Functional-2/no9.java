import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of non-negative integers, return a list of those numbers except omitting any that end with 9
	public List<Integer> noNeg(List<Integer> nums) {
		
		nums.removeIf(n-> n % 10 == 9);
		
		return nums;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<Integer> l1 = Arrays.asList(1, 2, 19);
		List<Integer> l2 = Arrays.asList(9, 19, 29, 3);
		List<Integer> l3 = Arrays.asList(1, 2, 3);
		
		System.out.println(o.noNeg(l1));
		System.out.println(o.noNeg(l2));
		System.out.println(o.noNeg(l3));

	}

}
