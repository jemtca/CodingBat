
public class recursion1 {
	
	// we have triangle made of blocks
	// the topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on
	// compute recursively the total number of blocks in such a triangle with the given number of rows
	public int triangle(int rows) {
		
		if (rows == 0) {
			return 0;
		}
		
		return rows + triangle(rows-1); 
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.triangle(0));
		System.out.println(o.triangle(1));
		System.out.println(o.triangle(2));
		
	}

}
