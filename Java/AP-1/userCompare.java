
public class ap1 {
	
	// we have data for two users, A and B, each with a String name and an int id
	// the goal is to order the users such as for sorting
	// return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same
	// order first by the string names, and then by the id numbers if the names are the same
	public int userCompare(String aName, int aId, String bName, int bId) {
		
		int x = 0;
		
		if (aName.compareTo(bName) < 0) {
			x = -1;
		}
		else if (aName.compareTo(bName) > 0) {
			x = 1;
		}
		else {
			if (aId < bId) {
				x = -1;
			}
			else if (aId > bId) {
				x = 1;
			}
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		System.out.println(o.userCompare("bb", 1, "zz", 2));
		System.out.println(o.userCompare("bb", 1, "aa", 2));
		System.out.println(o.userCompare("bb", 1, "bb", 1));

	}

}
