package employeewageoops;

import java.util.Random;

public class MultipleCompanies {
    //Use Case-8 is to compute Employee Wage for multiple companies.
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private String company;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;

    public MultipleCompanies(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

        // Default Constructor
        public void totalEmpWage () {
            Random random = new Random();
            int totalWorkingDays = 0;
            int totalWorkingHours = 0;
            int empWage = 0;
            int totalEmpWage = 0;

            while (totalWorkingDays < numOfWorkingDays && totalWorkingHours < maxHoursPerMonth) {
                totalWorkingDays++;
//            int empCheck = random.nextInt(3);
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                int empHrs = 0;
                switch (empCheck) {
                    case IS_PART_TIME -> empHrs = 4;

                    case IS_FULL_TIME -> empHrs = 8;

                    default -> empHrs = 0;

                }
                totalWorkingHours = empHrs + totalWorkingHours;
                empWage = empHrs * empRatePerHour;
                System.out.println("day " + totalWorkingDays + " = " + empWage);
                totalEmpWage = empWage + totalEmpWage;

            }
            System.out.println("salary of " + company + " employee wage is " + totalEmpWage);
        }
        public static void main (String[]args){
            MultipleCompanies dmart = new MultipleCompanies("Dmart", 20, 20, 100);
            dmart.totalEmpWage();
            MultipleCompanies wipro = new MultipleCompanies("wipro", 25, 20, 100);
            wipro.totalEmpWage();
            MultipleCompanies cognizant = new MultipleCompanies("cognizant", 30, 20, 100);
            cognizant.totalEmpWage();

        }

    }