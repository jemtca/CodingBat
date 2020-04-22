import java.util.List;
import java.util.Arrays;

public class functional1 {

	// given a list of non-negative integers, return an integer list of the rightmost digits
	public List<Integer> rightDigit(List<Integer> nums) {
		
		nums.replaceAll(n -> n % 10);
		
		return nums;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<Integer> l1 = Arrays.asList(1, 2, 93);
		List<Integer> l2 = Arrays.asList(16, 8, 886, 8, 1);
		List<Integer> l3 = Arrays.asList(10, 0);
		
		System.out.println(o.rightDigit(l1));
		System.out.println(o.rightDigit(l2));
		System.out.println(o.rightDigit(l3));

	}

}
