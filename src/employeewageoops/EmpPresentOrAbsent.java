package employeewageoops;
// To check whether Employee is Present or Absent

public class EmpPresentOrAbsent {
        public static void main(String args[]) {
            int full_time = 1;

            double check = Math.floor(Math.random() * 10) % 2;

            if (check == full_time)
                System.out.println("Employee is present");
            else
                System.out.println("Employee is Absent");

        }
    }

