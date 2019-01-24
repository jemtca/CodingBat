
public class logic1 {

	// your cell phone rings. Return true if you should answer it
	// normally you answer, except in the morning you only answer if it is your mom calling
	// in all cases, if you are asleep, you do not answer
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		
		boolean b = true;
		
		if (isAsleep || (isMorning && !isMom))
			b = false;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.answerCell(false, false, false));
		System.out.println(o.answerCell(false, false, true));
		System.out.println(o.answerCell(true, false, false));

	}

}
