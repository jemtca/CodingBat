
public class array2 {
	
	// we want make a package of goal kilos of chocolate
	// we have small bars (1 kilo each) and big bars (5 kilos each)
    // return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done
	public int makeChocolate(int small, int big, int goal) {
		
		int x = -1;
        int howManyBigOnes = goal / 5;

        if (goal <= small + (big * 5)) {
        	if (goal == big * 5) {
        		x  = 0;
        	}
        	else if (goal < big * 5 && small >= goal - (howManyBigOnes * 5)) {
        		x = goal - (howManyBigOnes * 5);
        	}
        	else if (goal > big * 5) {
        		if (goal > big * 5 && small >= goal - (big * 5)) {
        			x = goal - (big * 5);
        		}
        	}
        }

		return x;
		
	}

	public static void main(String[] args) {

		array2 o = new array2();
		
		System.out.println(o.makeChocolate(4, 1, 9));
		System.out.println(o.makeChocolate(4, 1, 10));
		System.out.println(o.makeChocolate(4, 1, 7));
		

	}

}
