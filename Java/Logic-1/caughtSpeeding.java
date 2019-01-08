
public class logic1 {

	// you are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket
	// if speed is 60 or less, the result is 0
	// if speed is between 61 and 80 inclusive, the result is 1
	// if speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases
	public int caughtSpeeding(int speed, boolean isBirthday) {
		
		int x = 0;
		
		if (!isBirthday) {
			if (speed >= 61 && speed <= 80)
				x = 1;
			else if (speed >= 81)
				x = 2;
		}
		else if (isBirthday) {
			if (speed >= 66 && speed <= 85)
				x = 1;
			else if (speed >= 86)
				x = 2;
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.caughtSpeeding(60, false));
		System.out.println(o.caughtSpeeding(65, false));
		System.out.println(o.caughtSpeeding(65, true));

	}

}
