

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDetails {

    int id;
    String name;
    Date dob;
    public int salary;
    public String city;
    public int hra;

    public EmployeeDetails(int id, String name, String dob, String city, int salary) {

        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        SimpleDateFormat format =new SimpleDateFormat();
        try{
            this.dob = format.parse(dob);
        } catch(NullPointerException npe){
            //set default date as todays date
            this.dob = new Date();
        }catch(Exception e){
            e.printStackTrace(); //supressing
        }
        }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", hra=" + hra +
                '}';
    }
}






