
public class HourlyEmployees extends Employees{

	



	float rate = 1000, bonus = 100;
	int wHour, n; // variable n for extra hour
	
	void hourlyEmployee(){
		
		
	System.out.println("===== Enter THe Number Of Hours Worked in a Weak! =====");
	wHour = get.nextInt();
	if (wHour <= 40){
		super.netSalary =( wHour*rate*25)/100;
		System.out.println("===== The Net Salary is: =====" );
		System.out.println(super.netSalary);
	}
	else{
		n = wHour - 40 ; // if hour exceed 40 hours
		bonus = bonus * n;
		netSalary =(( wHour*rate*25)/100)+ bonus;
		System.out.println("========== The Net Salary is: =======");
		System.out.println(super.netSalary);
	}
    }
	}



