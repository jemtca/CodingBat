
public class recursion1 {
	
	// given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them
	public int countHi2(String str) {
	
		int count = 0;
		
		if (str.isEmpty()) {
			return count;
		}
		if (str.length() > 1 && str.toLowerCase().charAt(0) == 'h' && str.toLowerCase().charAt(1) == 'i') {
			count++;
			return count + countHi2(str.substring(2));
		}
		else if (str.length() > 2 && str.toLowerCase().charAt(0) != 'x' && str.toLowerCase().charAt(1) == 'h' && str.toLowerCase().charAt(2) == 'i') {
			count++;
			return count + countHi2(str.substring(3));
		}
		else if (str.length() > 2 && str.toLowerCase().charAt(0) == 'x' && str.toLowerCase().charAt(1) == 'h' && str.toLowerCase().charAt(2) == 'i') {
			return count + countHi2(str.substring(3));
		}
		else if (str.length() > 2 && str.toLowerCase().charAt(1) == 'h' && str.toLowerCase().charAt(2) != 'i') {
			return count + countHi2(str.substring(2));
		}
		else {
			return count + countHi2(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.countHi2("ahixhi"));
		System.out.println(o.countHi2("ahibhi"));
		System.out.println(o.countHi2("xhixhi"));
		
	}

}
