
public class recursion1 {
	
	// we have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively
	public int bunnyEars(int bunnies) {
		
		if (bunnies == 0) {
			return 0;
		}
		
		return 2 + bunnyEars(bunnies-1);
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.bunnyEars(0));
		System.out.println(o.bunnyEars(1));
		System.out.println(o.bunnyEars(2));
		
	}

}
