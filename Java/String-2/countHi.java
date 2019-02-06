
public class string2 {
	
	// return the number of times that the string "hi" appears anywhere in the given string
	public int countHi(String str) {
		
		int count = 0;
		  
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
				count++;
		}  
		  
		return count;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.countHi("abc hi ho"));
		System.out.println(o.countHi("ABChi hi"));
		System.out.println(o.countHi("hihi"));

	}

}
