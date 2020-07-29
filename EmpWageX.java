public class EmpWageX{

	public static void main(String[] args)
	{
		int IS_FULL_TIME = 1;
		int Emp_Rate_Per_Hr=20;
		int EmpHrs=0;
		int EmpWage=0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
        	{	System.out.println("Employee Present");
			EmpHrs=EmpHrs+8;
		}
		else
		{
		        System.out.println("Employee Absent");
			EmpHrs=EmpHrs+0;
		}
		EmpWage=EmpHrs*Emp_Rate_Per_Hr;
		System.out.println(EmpWage);
}
}

