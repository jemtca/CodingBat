
public class logic1 {

	// the squirrels in Palo Alto spend most of the day playing
	// in particular, they play if the temperature is between 60 and 90 (inclusive)
	// unless it is summer, then the upper limit is 100 instead of 90
	// given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise
	public boolean squirrelPlay(int temp, boolean isSummer) {
		
		boolean b = false;
		
		if ((isSummer && temp >= 60 && temp <= 100) || (!isSummer && temp >= 60 && temp <= 90))
			b = true;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.squirrelPlay(70, false));
		System.out.println(o.squirrelPlay(95, false));
		System.out.println(o.squirrelPlay(95, true));

	}

}
