
public class warmup2 {

	// this function return true if the fisrt instance of 'x' of the given string is immediately followed by another 'x'
	// the function return false otherwise
	public boolean doubleX(String str) {
		
		boolean b = false;
		
		for (int i = 0; i < str.length()-1; i++)
			if (str.charAt(i) == 'x')
				if (str.charAt(i+1) == 'x') {
					b = true;
				}
				else {
					break;
				}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		warmup2 o = new warmup2();
		
		System.out.println(o.doubleX("axxbb"));
		System.out.println(o.doubleX("axaxax"));
		System.out.println(o.doubleX("xxxxx"));

	}

}
