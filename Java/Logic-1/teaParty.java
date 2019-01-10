
public class logic1 {

	// we are having a party with amounts of tea and candy
	// return the int outcome of the party encoded as 0=bad, 1=good, or 2=great
	// a party is good (1) if both tea and candy are at least 5
	// however, if either tea or candy is at least double the amount of the other one, the party is great (2)
	// however, in all cases, if either tea or candy is less than 5, the party is always bad (0)
	public int teaParty(int tea, int candy) {
		
		int x = 0;

		if (tea >= 5 && candy >= 5)
			x = 1;
		if (tea >= candy * 2 || candy >= tea * 2)
			x = 2;
		if (tea < 5 || candy < 5)
			x = 0;

		return x;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.teaParty(6, 8));
		System.out.println(o.teaParty(3, 8));
		System.out.println(o.teaParty(20, 6));

	}

}
