
public class string3 {

	// given a string, return the length of the largest "block" in the string
	// a block is a run of adjacent chars that are the same
	public int maxBlock(String str) {
		
		int max;
		int temp = 0;
		
		if (str.isEmpty()) {
			max = 0;
		}
		else {
			max = 1;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				temp++;
				int j = i;
				while (j < str.length() - 1 && str.charAt(i) == str.charAt(j+1)) {
					temp++;
					j++;
				}
				if (temp > max) {
					max = temp;
				}
				temp = 0;
			}
		}
		
		return max; 
		
	}	
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.maxBlock("hoopla"));
		System.out.println(o.maxBlock("abbCCCddBBBxx"));
		System.out.println(o.maxBlock(""));

	}

}
