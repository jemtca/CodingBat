
public class string1 {
	
	// given two strings, a and b, return the result of putting them together in the order abba
	public String makeAbba(String a, String b) {
		
		return a + b + b + a;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.makeAbba("Hi", "Bye"));
		System.out.println(o.makeAbba("Yo", "Alice"));
		System.out.println(o.makeAbba("What", "Up"));
	
	}

}
