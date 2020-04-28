import java.util.List;
import java.util.Arrays;


public class functional1 {

	// given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10
	public List<Integer> math1(List<Integer> nums) {
		
		nums.replaceAll(n -> (n + 1) * 10);
		
		return nums;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(6, 8, 6, 8, 1);
		List<Integer> l3 = Arrays.asList(10);
		
		System.out.println(o.math1(l1));
		System.out.println(o.math1(l2));
		System.out.println(o.math1(l3));

	}

}
