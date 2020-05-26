import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of integers, return a list of the integers, omitting any that are less than 0
	public List<Integer> noNeg(List<Integer> nums) {
		
		nums.removeIf(n -> n < 0);
		
		return nums;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<Integer> l1 = Arrays.asList(1, -2);
		List<Integer> l2 = Arrays.asList(-3, -3, 3, 3);
		List<Integer> l3 = Arrays.asList(-1, -1, -1);
		
		System.out.println(o.noNeg(l1));
		System.out.println(o.noNeg(l2));
		System.out.println(o.noNeg(l3));

	}

}
