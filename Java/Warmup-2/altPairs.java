
public class warmup2 {

	// this function return a string made of the chars at indexes 0,1,5,6,9,10,...
	public String altPairs(String str) {
	
  		String s = "";
		
		for (int i = 0; i < str.length(); i+=4) {
			if (i < str.length() - 1)
				s = s + str.substring(i, i + 1) + str.substring(i + 1, i + 2);
			else
				s = s + str.substring(i, i + 1);
				
		}
				
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		System.out.println(o.altPairs("kitten"));
		System.out.println(o.altPairs("Chocolate"));
		System.out.println(o.altPairs("CodingHorror"));

	}

}
