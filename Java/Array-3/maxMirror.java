
public class array3 {
	
	// we'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order
	// for example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part)
	// return the size of the largest mirror section found in the given array
	public int maxMirror(int[] nums) {
		
	    int max = 0;
	    
	    for(int start = 0; start < nums.length; start++) {
	        for(int begin = nums.length - 1; begin >= 0; begin--) {
	            int size = 0;
	            int i = start;
	            int j = begin;
	                                  
	            while(i < nums.length && j >= 0 && nums[i] == nums[j]) {
	                size++;
	                i++;
	                j--;
	            }
	                                                                              
	            max = Math.max(max, size);
	        }
	    }
	                                                                                            
	    return max;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] x = {1, 2, 3, 8, 9, 3, 2, 1};
		int[] y = {1, 2, 1, 4};
		int[] z = {7, 1, 2, 9, 7, 2, 1};
		
		System.out.println(o.maxMirror(x));
		System.out.println(o.maxMirror(y));
		System.out.println(o.maxMirror(z));
		
	}

}
