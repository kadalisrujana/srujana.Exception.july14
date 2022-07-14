import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EmployeeDetails> employeeDetailsList = new ArrayList<>();
        EmployeeDetails e1 = new EmployeeDetails(1, "saba", "1990-12-12", "Hyderabad", 40000);
        EmployeeDetails e2 = new EmployeeDetails(2, "srujana", "1998-10-12", "Mumbai", 250000);
        EmployeeDetails e3 = new EmployeeDetails(3, "kavya", "1997-12-12", "Banglore", 35000);
        EmployeeDetails e4 = new EmployeeDetails(4, "sumana", "1996-12-6", "Hyderabad", 350000);
        EmployeeDetails e5 = new EmployeeDetails(5, "dakshayani", "1995-11-12", "Banglore", 120000);
        EmployeeDetails e6 = new EmployeeDetails(6, "priyanka", "1994-12-12", "Hyderabad", 150000);
        EmployeeDetails e7 = new EmployeeDetails(7, "sravya", "null", "Delhi", 90000);
        EmployeeDetails e8 = new EmployeeDetails(8, "taylor", "1992-12-2", "Mumbai", 60000);
        EmployeeDetails e9 = new EmployeeDetails(9, "mike", "1991-12-11", "Delhi", 45000);
        EmployeeDetails e10 = new EmployeeDetails(10, "alex", "1989-9-12", "null", 150000);
        employeeDetailsList.add(e1);
        employeeDetailsList.add(e2);
        employeeDetailsList.add(e3);
        employeeDetailsList.add(e4);
        employeeDetailsList.add(e5);
        employeeDetailsList.add(e6);
        employeeDetailsList.add(e7);
        employeeDetailsList.add(e8);
        employeeDetailsList.add(e9);
        employeeDetailsList.add(e10);


        for (EmployeeDetails e : employeeDetailsList) {
            int grade = 0;
            if (e.salary > 10000 && e.salary < 20000) {
                grade = 4;
            } else if (e.salary > 20000 && e.salary < 40000) {
                grade = 3;
            } else if (e.salary > 40000 && e.salary < 65000) {
                grade = 2;
            } else if (e.salary > 650000) {
                grade = 1;
            }
            try {
                if (grade == 1) {

                    if ((e.city.equals("Mumbai") || e.city.equals("Banglore") || e.city.equals("Delhi")))
                        e.hra = e.salary * 50 / 100;
                    else
                        e.hra = e.salary * 40 / 100;
                } else {
                    if ((e.city.equals("Mumbai") || e.city.equals("Banglore") || e.city.equals("Delhi")))
                        e.hra = e.salary * 45 / 100;
                    else
                        e.hra = e.salary * 40 / 100;
                }
            } catch (NullPointerException npe) {
                e.hra = e.salary * 10 / 100;
            }
            System.out.println(e);
        }
    }
}
