public class EmpWage_For{
		public static final int IS_FULL_TIME = 1;
                public static final int IS_Part_Time = 2;
                public static final int Emp_Rate_Per_Hr=20;
        public static void main(String[] args)
        {
                int EmpHrs=0;
                int EmpWage=0;
		for (int i=1; i<=5; i++)
		{

                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                
		switch (empCheck)	
			{
                case IS_FULL_TIME:
		        EmpHrs=EmpHrs+8;
                	break;
                case IS_Part_Time:
			EmpHrs=EmpHrs+4;
			break;
		default:
                        EmpHrs=EmpHrs+0;
			break;
                	}

                EmpWage=EmpHrs*Emp_Rate_Per_Hr;
		System.out.println("Employee Status: "+empCheck+" Employee wage: " +EmpWage);

		}
                System.out.println("Total Wage: "+EmpWage);
}
}
