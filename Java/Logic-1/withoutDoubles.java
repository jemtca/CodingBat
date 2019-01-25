
public class logic1 {

	// return the sum of two 6-sided dice rolls, each in the range 1..6
	// however, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		
		int sum = 0;
		
		if (!noDoubles || die1 != die2) {
			sum = die1 + die2;
		}
		else {
            if (die1 >= 1 && die1 <= 5) {
                die1++;
                sum = die1 + die2;
            }
            else {
                die1 = 1;
                sum = die1 + die2;
            }
		}

		return sum;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.withoutDoubles(2, 3, true));
		System.out.println(o.withoutDoubles(3, 3, true));
		System.out.println(o.withoutDoubles(3, 3, false));

	}

}
