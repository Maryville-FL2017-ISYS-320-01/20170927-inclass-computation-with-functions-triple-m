
public class PayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String employeeName = "Sam";
		 double Salarypay = 0;
		double Haurs = 0;
		double total = Compute1Pay(5.50, 6);
		System.out.println("SalaryPayment:" +total);
		
		double overtime = 1.5;
		double Hours = 9;
		double OvertimeTotal =  Compute1Pay(4, 11);
		double SalaryOvertime = overtime * Hours ;
		System.out.println("Salary Payment Plus Over Time:" + SalaryOvertime + total);
		
	}
		private static double Compute1Pay(double overtime, double Salarypay ) {
		// TODO Auto-generated method stub
			double SalaryOvertime = Salarypay * overtime;
		return SalaryOvertime;
		
	}
		public static double ComputePay( double Salarypay, double Hours, double overtime) {
			double ComputePay = Salarypay * Hours; 
			
			 
			 return ComputePay;		 
			 
		}
		
	
}

