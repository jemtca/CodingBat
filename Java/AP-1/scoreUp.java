
public class ap1 {
	
	// the "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank
	// the two arrays are not empty and are the same length
	// return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer
	public int scoreUp(String[] key, String[] answers) {
		
		int x = 0;
		
		for (int i = 0; i < key.length; i++ ) {
			if (key[i] == answers[i]) {
				x = x + 4;
			}
			else if (key[i] != answers[i] && answers[i] != "?") {
				x = x - 1;
			}
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] x1 = {"a", "a", "b", "b"};
		String[] y1 = {"a", "a", "b", "b"};
		String[] z1 = {"a", "a", "b", "b"};
		String[] x2 = {"a", "c", "b", "c"};
		String[] y2 = {"a", "a", "b", "c"};
		String[] z2 = {"a", "a", "b", "b"};
		
		System.out.println(o.scoreUp(x1, x2));
		System.out.println(o.scoreUp(y1, y2));
		System.out.println(o.scoreUp(z1, z2));

	}

}
