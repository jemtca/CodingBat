
public class logic1 {

	// when squirrels get together for a party, they like to have cigars
	// a squirrel party is successful when the number of cigars is between 40 and 60, inclusive
	// unless it is the weekend, in which case there is no upper bound on the number of cigars
	// return true if the party with the given values is successful, or false otherwise
	public boolean cigarParty(int cigars, boolean isWeekend) {
		
		boolean b = false;
		
		if (!isWeekend && (cigars >= 40 && cigars <= 60))
			b = true;
		else if (isWeekend && cigars >= 40)
			b = true;
		
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.cigarParty(30, false));
		System.out.println(o.cigarParty(50, false));
		System.out.println(o.cigarParty(70, true));

	}

}
