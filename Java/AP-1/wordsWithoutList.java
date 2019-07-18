import java.util.*;

public class ap1 {
	
	// given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted
	public List<String> wordsWithoutList(String[] words, int len) {
		
		List<String> l = new ArrayList<String>();
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				l.add(words[i]);
			}
		}
		
		return l;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] x = {"a", "bb", "b", "ccc"};
		String[] y = {"a", "bb", "b", "ccc"};
		String[] z = {"a", "bb", "b", "ccc"};
		
		System.out.println(o.wordsWithoutList(x, 1));
		System.out.println(o.wordsWithoutList(y, 3));
		System.out.println(o.wordsWithoutList(z, 4));

	}

}
