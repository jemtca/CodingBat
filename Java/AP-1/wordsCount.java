
public class ap1 {
	
	// given an array of strings, return the count of the number of strings with the given length
	public int wordsCount(String[] words, int len) {
		
		int x = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				x++;
			}
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] x = {"a", "bb", "b", "ccc"};
		String[] y = {"a", "bb", "b", "ccc"};
		String[] z = {"a", "bb", "b", "ccc"};
		
		System.out.println(o.wordsCount(x, 1));
		System.out.println(o.wordsCount(y, 3));
		System.out.println(o.wordsCount(z, 4));

	}

}
