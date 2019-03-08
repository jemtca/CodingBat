
public class string3 {

	// given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive)
	public boolean equalIsNot(String str) {
		
		boolean b = false;
		int isTimes = 0;
		int notTimes = 0;
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'i' && str.charAt(i+1) == 's') {
				isTimes++;
			}
		}
		
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 't') {
				notTimes++;
			}
		}

		if (isTimes == notTimes)
			b = true;
		
		return b; 
		
	}	
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.equalIsNot("This is not"));
		System.out.println(o.equalIsNot("This is notnot"));
		System.out.println(o.equalIsNot("noisxxnotyynotxisi"));

	}

}
