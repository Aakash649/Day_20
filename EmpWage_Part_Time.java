public class EmpWage_Part_Time{

        public static void main(String[] args)
        {
                int IS_FULL_TIME = 1;
		int IS_Part_Time = 2;
                int Emp_Rate_Per_Hr=20;
                int EmpHrs=0;
                int EmpWage=0;
                double empCheck = Math.floor(Math.random() * 10) % 3;
                if (empCheck == IS_FULL_TIME)
                {       System.out.println("Employee Present");
                        EmpHrs=EmpHrs+8;
                }
                else if (empCheck == IS_Part_Time)
		{
			EmpHrs=EmpHrs+4;
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
