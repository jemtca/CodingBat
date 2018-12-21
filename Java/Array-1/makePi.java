
public class array1 {
	
	// return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}
	public int[] makePi() {
		
		int[] newArray = new int[3];
		
		newArray[0] = 3;
		newArray[1] = 1;
		newArray[2] = 4;
		
		return newArray;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] temp;
		
		temp = o.makePi();
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
	}

}
