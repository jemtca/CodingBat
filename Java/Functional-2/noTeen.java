import java.util.Arrays;
import java.util.List;

public class functional2 {
	
	// given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive
	public List<Integer> noTeen(List<Integer> nums) {
		
		nums.removeIf(n -> n >= 13 && n <= 19);
		
		return nums;
		
	}

	public static void main(String[] args) {
		
		functional2 o = new functional2();
		
		List<Integer> l1 = Arrays.asList(12, 13, 19, 20);
		List<Integer> l2 = Arrays.asList(1, 14, 1);
		List<Integer> l3 = Arrays.asList(15);
		
		System.out.println(o.noTeen(l1));
		System.out.println(o.noTeen(l2));
		System.out.println(o.noTeen(l3));

	}

}
