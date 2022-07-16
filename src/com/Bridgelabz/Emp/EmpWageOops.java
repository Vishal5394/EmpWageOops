package com.Bridgelabz.Emp;

public class EmpWageOops {
	static int Is_Present = 1;
	static int Is_PartTime = 2;
	static int Emp_wage_per_hr = 20;

	void  Welcome(){
		System.out.println("Welcome to Employee Wage Computation Program"); 
	}
	void Check_Wage() {
		int  Employeehr = 0 , Daily_Wage = 0;
		
		double Attendance = Math.floor(Math.random()*10)%3;
		
		if (Attendance == Is_Present) {
			Employeehr = 8;
		System.out.println("Employee is Present ");
		}
		else if (Attendance == Is_PartTime) {
			Employeehr = 4;
		System.out.println("Employee is Present Part Time ");
		}
		else {
			Employeehr = 0;
		System.out.println("Employee is Absent ");
		}
			
		Daily_Wage = Emp_wage_per_hr  *Employeehr;
		
		System.out.println("Employee Daily Wage is = "+Daily_Wage);
	}

	public static void main(String[] args) {
		EmpWageOops obj = new EmpWageOops();
		obj.Welcome();
		obj.Check_Wage();

	}

}
