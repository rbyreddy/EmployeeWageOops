package employeewageoops;

public class EmpPresentOrAbsent {
    //This program is to display the welcome message to Employee wage computation program.
//Use Case-1 is to check whether the Employee is present or not.

        // Default Constructor
        public EmpPresentOrAbsent() {
            System.out.println("Welcome to Employee Wage Computation Program..!");
        }

        public static void main(String[] args) {

            //Initializing the constructor by creating the object of the class.
            EmpPresentOrAbsent employee = new EmpPresentOrAbsent();
            System.out.println();

            //Declaring the variables.
            double isPresent = 1;
            double randomCheck = (double)Math.floor((Math.random()*10)%2);

            //Checking if the Employee is present!!!
            if (randomCheck == isPresent)
            {
                System.out.println("Employee is present");
            }
            else
            {
                System.out.println("Employee is absent");
            }

        }
    }

