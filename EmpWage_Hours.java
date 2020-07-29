public class EmpWage_Hours{
		public static final int IS_FULL_TIME = 1;
                public static final int IS_Part_Time = 2;
                public static final int Emp_Rate_Per_Hr=20;
        public static void main(String[] args)
        {
                int EmpHrs=0;
                int EmpWage=0;
		double day=0;
		while( day < 10 && EmpHrs < 80 )
		{

                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                
		switch (empCheck)	
			{
                case IS_FULL_TIME:
		        EmpHrs=EmpHrs+8;
			day=day+1;
                	break;
                case IS_Part_Time:
			EmpHrs=EmpHrs+4;
			 day=day+(0.5);
			break;
		default:
                        EmpHrs=EmpHrs+0;
			day=day+0;
			break;
                	}

                EmpWage=EmpHrs*Emp_Rate_Per_Hr;
		System.out.println("Number of Days: "+day+" Total Hrs: "+EmpHrs+" Employee Status: "+empCheck+" Employee wage: " +EmpWage);

		}
                System.out.println("Total Wage: "+EmpWage);
}
}
