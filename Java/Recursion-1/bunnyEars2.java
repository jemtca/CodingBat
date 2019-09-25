
public class recursion1 {
	
	// we have bunnies standing in a line, numbered 1, 2, ...
	// the odd bunnies (1, 3, ..) have the normal 2 ears
	// the even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot
	// return the number of "ears" in the bunny line 1, 2, ... n
	public int bunnyEars2(int bunnies) {
		
		if (bunnies == 0) {
			return 0;
		}
		
		if (bunnies % 2 == 0) {
			return 3 + bunnyEars2(bunnies-1);
		}
		else {
			return 2 + bunnyEars2(bunnies-1);
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.bunnyEars2(0));
		System.out.println(o.bunnyEars2(1));
		System.out.println(o.bunnyEars2(2));

	}

}
