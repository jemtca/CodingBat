
public class logic2 {

	// we want to make a row of bricks that is goal inches long
	// we have a number of small bricks (1 inch each) and big bricks (5 inches each)
	// return true if it is possible to make the goal by choosing from the given bricks
	public boolean makeBricks(int small, int big, int goal) {
		
		boolean b = false;
		int howManyBigOnes = Math.round((float)big * 5 / goal);

	    if (big * 5 == goal)
	      b = true;
	    else if (big * 5 < goal && small + big * 5 >= goal)
	      b = true;
	    else if (big * 5 > goal)
	      if (small + howManyBigOnes * 5 >= goal)
	        b = true;

		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.makeBricks(3, 1, 8));
		System.out.println(o.makeBricks(3, 1 ,9));
		System.out.println(o.makeBricks(3, 2, 10));
		
	}

}
