
public class warmup1 {

	// this function return true (trouble) if two monkeys are smiling or two monkeys are not smiling
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		
		boolean b = false;
		
		if ((aSmile && bSmile) || (!aSmile && !bSmile))
			b = true;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.monkeyTrouble(true, true));
		System.out.println(o.monkeyTrouble(false, false));
		System.out.println(o.monkeyTrouble(true, false));
		
	}
	
}
