
public class warmup1 {

	// this function return true if the given string contains between 1 and 3 'e' chars
	public boolean stringE(String str) {
		
		boolean b = false;
		int count = 0;
		
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == 'e')
				count++;
		
		if (count >= 1 && count <= 3)
			b = true;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.stringE("Hello"));
		System.out.println(o.stringE("Heelle"));
		System.out.println(o.stringE("Heelele"));
		
	}
	
}
