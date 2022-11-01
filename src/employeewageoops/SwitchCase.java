package employeewageoops;

public class SwitchCase {
//Use Case-4 is to solve that previous program in switch case statement

        // Default Constructor
        public SwitchCase() {
            System.out.println("Welcome to Employee Wage Computation Program..!");
        }

        public static void main(String[] args) {

            //Initializing the constructor by creating the object of the class.
            SwitchCase employee = new SwitchCase();
            System.out.println();

            //Declaring the variables.
            final int isPartTime = 1;
            final int isFullTime = 2;
            int empHour;
            int wagePerHour = 20;
            int salary = 0;
            int numWorkingDays = 20;
            int monthlySalary = 0;

            //Calculating the number of working days of an Employee randomly.
            for (int i=1; i <= numWorkingDays; i++)
            {
                int randomCheck = (int) Math.floor((Math.random() * 10) % 3);
                switch (randomCheck) {
                    default :
                        System.out.println("Employee is absent");
                        empHour=0;
                        salary = empHour * wagePerHour;
                        break;
                    case isPartTime :
                        System.out.println("Employee is working part-time");
                        int partTimeHour = 4;
                        empHour = partTimeHour;
                        salary = empHour * wagePerHour;
                        break;
                    case isFullTime :
                        System.out.println("Employee is working full-time");
                        int fullTimeHour = 8;
                        empHour = fullTimeHour;
                        salary = empHour * wagePerHour;
                        break;
                }
                monthlySalary = monthlySalary + salary;
            }
            System.out.println("Salary of an Employee in a month is : $"+monthlySalary);

        }
    }