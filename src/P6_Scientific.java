/*
	ISYS 320
	MohammadAlshehri
	MohammedAljohani
	MansourAlbaibi
	9/30/17
*/

public class P6_Scientific {

	public static void main(String[]  args) {
		// REMINDER: Any print statement should only be in the main method
		double a = 6.5;
		double b = Math.pow(10, 3);
		double Value = ComputeScientificValue(a, b);
		System.out.println(Value);
		

	}
	public static double ComputeScientificValue(double a, double b) {
		double ComputeScientificValue = 6.5 * Math.pow(10, 3);
		return ComputeScientificValue;
		
		
	}

}
