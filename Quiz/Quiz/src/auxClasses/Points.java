package auxClasses;

public abstract class Points {
	
	// Property
	
	private static int points = 0;
	
	// Methods
	
	public static void sumPoint() {
		Points.points++;
	}
	
	public static int getPoints() {
		return Points.points;
	}
	
	public static void restorePoints() {
		Points.points = 0;
	}

}