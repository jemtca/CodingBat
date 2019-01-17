
public class logic1 {

	// given a string str, if the string starts with "f" return "Fizz"
	// if the string ends with "b" return "Buzz"
	// if both the "f" and "b" conditions are true, return "FizzBuzz"
	// in all other cases, return the string unchanged
	public String fizzString(String str) {
		
		String s = "";
		
		if (str.length() > 0) {
			if (str.substring(0, 1).toLowerCase().equals("f") && str.substring(str.length()-1).toLowerCase().equals("b"))
				s = "FizzBuzz";
			else if (str.substring(0, 1).toLowerCase().equals("f"))
				s = "Fizz";
			else if (str.substring(str.length()-1).equals("b"))
				s = "Buzz";
			else
				s = str;
		}
			
		return s;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.fizzString("fig"));
		System.out.println(o.fizzString("dib"));
		System.out.println(o.fizzString("fib"));

	}

}
