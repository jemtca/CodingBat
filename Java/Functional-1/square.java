import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class functional1 {

	// given a list of integers, return a list where each integer is multiplied with itself
	public List<Integer> rightDigit(List<Integer> nums) {
		
		nums.replaceAll(n -> n * n);
		
		return nums;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(6, 8, -6, -8, 1);
		List<Integer> l3 = new ArrayList<Integer>();
		
		System.out.println(o.rightDigit(l1));
		System.out.println(o.rightDigit(l2));
		System.out.println(o.rightDigit(l3));

	}

}
