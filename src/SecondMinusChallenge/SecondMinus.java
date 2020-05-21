package SecondMinusChallenge;

public class SecondMinus {
	public static void main(String[] args) {
		System.out.println(getDuration(60,45));
		System.out.println(getDuration(50));
	}
	
	private static String getDuration(long minutes, long seconds) {
		if ( (minutes < 0) || (seconds < 0) || (seconds > 59) ) {
			return "Invalid value";
			
		}
		
		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;
		return hours + "h " + remainingMinutes + "m " + seconds + "s"; 
	}
	
	private static String getDuration(long seconds) {
		if (seconds < 0) {
			return "invalid value";
			
		}
		
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;
		return getDuration(minutes, seconds);
	}
}
