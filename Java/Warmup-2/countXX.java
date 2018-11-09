
public class warmup2 {

	// this function return the number of "xx" in the given string
	// overlapping is allowed
	public int countXX(String str) {
				
		int count = 0;
		
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x')
				count++;
		}
		
		return count;

	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		System.out.println(o.countXX("abcxx"));
		System.out.println(o.countXX("xxx"));
		System.out.println(o.countXX("xxxx"));

	}

}
