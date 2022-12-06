package day2.week2;

public class EmployeeDetials {

	public void printEmployeeName(String empname,int empid) {
		System.out.println(empname);
		System.out.println(empid);
	}
	public void getEmployeeAddress(String empaddress) {
		System.out.println(empaddress);
	}
	public void PrintEmployeesalary(String empsalary) {
		System.out.println(empsalary);
	}	
	public void EmployeeMobileNumber (long mobNum) {
		System.out.println(mobNum);
	}
	
	public static void main(String[] args) {
		EmployeeDetials employee =new EmployeeDetials();
		employee.printEmployeeName("anwesh", 3);
		employee.getEmployeeAddress("No9,padmavathynagar,kavaraipettai-601206");
		employee.PrintEmployeesalary("200000.00");
		employee.EmployeeMobileNumber(992345281);
	}
	
		
		
	
		// TODO Auto-generated constructor stub
}	


