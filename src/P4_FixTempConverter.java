/*
	ISYS 320
	MohammadAlshehri	
	MohammedAljohani
	MansourAlbaibi
	9/30/2017
*/

/*
 What were the errors you found?
 all explanations are inside the coding.
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		double Culcolating =  ftoc(tempf);   // adding a "ftoc to culcolate tempc also, new Variable.
		System.out.println("Body temp in C is: " + Culcolating); //exchanging with the variables tempc to Culcolating.
	}

	// converts Fahrenheit temperatures to Celsius.
	public static double ftoc(double tempf) { // Ruturn does not accept int so, we change it here to double 
		
	      return  (tempf - 32) * 5 / 9;// here should have return and deleting "=".
	      
    }
}
