
public class string1 {
	
	// this function return a greeting of the form "Hello name!"
	public String helloName(String name) {
		
		return "Hello " + name + "!";
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.helloName("Bob"));
		System.out.println(o.helloName("Alice"));
		System.out.println(o.helloName("X"));

	}

}
