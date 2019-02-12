
public class string2 {
	
	// return true if the string "cat" and "dog" appear the same number of times in the given string
	public boolean catDog(String str) {
		
		boolean b = true;
		int cat = 0;
		int dog = 0;
		
		if (str.length() > 2) {
  		for (int i = 0; i < str.length()-2; i++) {
  			if (str.charAt(i) == 'c' && str.substring(i, i+3).equals("cat")) {
  				cat++;
  			}
  		}
  		
  		for (int i = 0; i < str.length()-2; i++) {
  			if (str.charAt(i) == 'd' && str.substring(i, i+3).equals("dog")) {
  				dog++;
  			}
  		}
  		
  		if (cat != dog) {
  			b = false;
  		}
		}
		
		return b;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.catDog("catdog"));
		System.out.println(o.catDog("catcat"));
		System.out.println(o.catDog("1cat1cadodog"));

	}

}
