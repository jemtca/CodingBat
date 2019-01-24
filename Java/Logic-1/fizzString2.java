
public class logic1 {

	// given an int n, return the string form of the number followed by "!"
	// so the int 6 yields "6!"
	// except if the number is divisible by 3 use "Fizz!" instead of the number
	// and if the number is divisible by 5 use "Buzz!"
	// and if divisible by both 3 and 5, use "FizzBuzz!"
	public String fizzString2(int n) {
		
		String s = Integer.toString(n) + "!";
		
		if (n % 3 == 0 && n % 5 == 0)
			s = "FizzBuzz!";
		else if (n % 3 == 0)
			s = "Fizz!";
		else if (n  % 5 == 0)
			s = "Buzz!";
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.fizzString2(1));
		System.out.println(o.fizzString2(2));
		System.out.println(o.fizzString2(3));

	}

}
