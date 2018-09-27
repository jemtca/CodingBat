
public class warmup1 {

	// this function return a string where the first and last chars of a given string have been exchange
	public String frontBack(String str) {
		
		String s = "";

		if (!str.isEmpty()) {
			String first = str.substring(0, 1);
			String last = str.substring(str.length() - 1);
			if (str.length() == 1)
				s = str;
			else if (str.length() == 2)
				s = last + first;
			else {
				String medium = str.substring(1, str.length() - 1);
				s = last + medium + first;
			}
		}
		else
			System.out.println("The input is empty.");
			
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.frontBack("code"));
		System.out.println(o.frontBack("o"));
		System.out.println(o.frontBack("ab"));
		System.out.println(o.frontBack(""));

	}
	
}
