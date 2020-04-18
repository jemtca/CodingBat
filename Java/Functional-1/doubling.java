import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class functional1 {

	// given a list of integers, return a list where each integer is multiplied by 2
	public List<Integer> doubling(List<Integer> nums) {
		
		nums.replaceAll(n -> n * 2);
		
		return nums;
		
	}
	
	public static void main(String[] args) {
	
		functional1 o = new functional1();
		
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(6, 8, 6, 8, -1);
		List<Integer> l3 = new ArrayList<Integer>(); // l3.add();
		
		System.out.println(o.doubling(l1));
		System.out.println(o.doubling(l2));
		System.out.println(o.doubling(l3));

	}

}
