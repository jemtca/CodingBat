
public class ap1 {
	
	// given an array of strings, return a new array without the strings that are equal to the target string
	public String[] wordsWithout(String[] words, String target) {
		
		String[] s;
		int temp = 0;

		
		for (int i = 0; i < words.length; i++) {
			if (words[i].compareTo(target) == 0) {
				temp++;
			}
		}
		
		s = new String[words.length - temp];
		temp = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				s[temp] = words[i];
				temp++;
			}
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] x = {"a", "b", "c", "a"};
		String[] y = {"a", "b", "c", "a"};
		String[] z = {"a", "b", "c", "a"};
		
		String[] temp;
		
		temp = o.wordsWithout(x, "a");
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.wordsWithout(y, "b");
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.wordsWithout(z, "c");
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");

	}

}
