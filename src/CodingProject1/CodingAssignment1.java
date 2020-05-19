package CodingProject1;

public class CodingAssignment1 {
	//write a method called toMilesPerHour that has 1 parameter of type double with 
		//the name kilometersperhour. this method needs to return the rounded value of the calculation
		//of the calculation of type long
		public static long toMilesPerHour(double kilometersPerHour) {
			if (kilometersPerHour < 0) {
				return -1;
			}
			return Math.round(kilometersPerHour/1.609);
		}
		
		public static void printConversion(double kilometersPerHour) {
			if(kilometersPerHour < 0) {
				System.out.println("invalid value");
			}else {
				long milesPerHour = toMilesPerHour(kilometersPerHour);
				System.out.println(kilometersPerHour + " kim/h = " + milesPerHour + "mi/h") ;
			}
	}
}
