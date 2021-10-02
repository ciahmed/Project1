package classandmethods;

public class Math {
	
	//non return method 
	public void addition1(int a, int b) {
		int total = a+b;
		System.out.println(total);
	}
	
	//return method
	public int addition2(int a, int b) {
		int total = a+b;
		return total;
	}
	
	public int substraction(int a, int b) {
		int total = a-b;
		return total;
	}
	
	public double salary(double baseSalaryPerHour, double regularHours, double overTimeHours, double priceOfTheProduct, double numberOfSales, double comissionPercentage, double tax) {
		
		double baseSalary = baseSalaryPerHour * regularHours;
		System.out.println("base salary is: "+baseSalary);
		double overTimeSalary = baseSalaryPerHour * 1.5 * overTimeHours;
		System.out.println("overtime salary is: "+overTimeSalary);
		double commissionEarnings = numberOfSales * priceOfTheProduct * comissionPercentage;
		System.out.println("commission is: "+commissionEarnings);
		double grossIncome = baseSalary + overTimeSalary + commissionEarnings;
		System.out.println("gross income is: "+grossIncome);
		double netIncome = grossIncome * (1 - tax);
		System.out.println("tax amount is: "+grossIncome * tax);
		return netIncome;
	}
	
}




