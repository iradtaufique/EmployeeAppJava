
public class MonthlyEmployees extends Employees {
	
	void monthlyEmployee(){
		int grosSalary;
		float charge;
		
		System.out.println("======= Please Enter Your Gross Salary ======");
		grosSalary = get.nextInt();
		charge = (grosSalary*30)/100;
		super.netSalary = grosSalary - charge;
		
		System.out.println("======== The Net Salary For The Monthly Employee is: =======");
		System.out.println(super.netSalary);
		
	}

}
