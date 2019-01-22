
public class logic1 {

	// given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation
	// return a string of the form "7:00" indicating when the alarm clock should ring
	// weekdays, the alarm should be "7:00" and on the weekend it should be "10:00"
	// unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off"
	public String alarmClock(int day, boolean vacation) {
		
		String s = "";
		
		if (!vacation && day >= 1 && day <= 5)
			s = "7:00";
		else if ((!vacation && (day == 0 || day == 6 )) || (vacation && day >= 1 && day <= 5))
			s = "10:00";
		else
			s = "off";
			
		return s;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.alarmClock(1, false));
		System.out.println(o.alarmClock(5, false));
		System.out.println(o.alarmClock(0, false));

	}

}
