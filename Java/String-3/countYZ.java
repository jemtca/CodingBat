
public class string3 {

    // given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive)
    // we'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it
	public int countYZ(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length()-1) {
				if ((str.toLowerCase().charAt(i) == 'z' && !Character.isLetter(str.charAt(i+1))) ||
						(str.toLowerCase().charAt(i) == 'y' && !Character.isLetter(str.charAt(i+1)))) {
					count++;
				}
			}
			else {
				if (str.toLowerCase().charAt(i) == 'z' || str.toLowerCase().charAt(i) == 'y') {
					count++;
				}
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.countYZ("fez day"));
		System.out.println(o.countYZ("day fez"));
		System.out.println(o.countYZ("day fyyyz"));

	}

}
