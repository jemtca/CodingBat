
public class warmup2 {

	// this function return the count of the number of times
	// that a substring length 2 appears in the string and also as the last 2 chars of the string
	public int last2(String str) {
	
		int count = 0;
		
		if(str.length() > 2) {
			String last2chars = str.substring(str.length() - 2);
			for(int i = 0; i < str.length() - 2; i++) {
				String s = str.substring(i, i + 2);
				if(s.compareToIgnoreCase(last2chars) == 0)
					count++;
			}	
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		System.out.println(o.last2("hixxhi"));
		System.out.println(o.last2("xaxxaxaxx"));
		System.out.println(o.last2("axxxaaxx"));

	}

}
