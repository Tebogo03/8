package Com.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Staff extends Person implements Salary{
    String educationChukwu56985;
    String positionChukwu56985;

    public void Initialize1()throws IOException{
        Initialize();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your education");
        educationChukwu56985 = br.readLine();
        System.out.println("Enter your position");
        positionChukwu56985 = br.readLine();
    }

    @Override
    public int salaryToPayChukwu56985(int hoursChukwu56985, int rateChukwu56985) {
        return hoursChukwu56985 * rateChukwu56985;
    }

    public void print1(){
        print();
        System.out.println("education: "+ educationChukwu56985);
        System.out.println("position: "+ positionChukwu56985);
    }

}
class Person {
    private String surnameChukwu56985;
    private String firstNameChukwu56985;
    private String zipCodeChukwu56985;
    private String streetChukwu56985;
    private String cityChukwu56985;


    void Initialize()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your first name");
        firstNameChukwu56985 = br.readLine();
        System.out.println("what is your surname ");
        surnameChukwu56985 = br.readLine();
        System.out.println("Please enter your street ");
        streetChukwu56985 = br.readLine();
        System.out.println("Please enter your city");
        cityChukwu56985 = br.readLine();
        System.out.println("Please enter your zipcode");
        zipCodeChukwu56985 = br.readLine();

    }

    void print(){
        System.out.println("Displaying the data");
        System.out.println("==============");
        System.out.println("Surname: "+surnameChukwu56985);
        System.out.println("First name: "+firstNameChukwu56985);
        System.out.println("street: "+streetChukwu56985);
        System.out.println("city: "+ cityChukwu56985);
        System.out.println("Zipcode: "+ zipCodeChukwu56985);
    }
}
public class Inheritance {
    public static void main(String[] args) throws IOException {
        Staff sf = new Staff();

        //sf.Initialize1();
        //sf.print1();
        double salaryChukwu56985 = sf.salaryToPayChukwu56985(100,50);
        System.out.println("The employee received an amount of "+ salaryChukwu56985);
        double salaryOvertimeChukwu56985 = sf.SalaryForOvertimeChukwu56985(10,50);
        System.out.println("the employee received an amount of "+salaryOvertimeChukwu56985 + "for overtime ");
        int bonusChukwu56985 = Salary.employeeBounsChukwu56985(3);
        System.out.println("The employee received a bonus in the amount of "+ bonusChukwu56985);
    }

}
interface Salary {
    public int salaryToPayChukwu56985(int hoursChukwu56985,int rateChukwu56985 );

    default int SalaryForOvertimeChukwu56985(int extraHourChukwu56985, int rateChukwu56985){
        int overtimeextraHourChukwu56985 = extraHourChukwu56985 * rateChukwu56985 ;
        return overtimeextraHourChukwu56985;
    }
    static int employeeBounsChukwu56985(int yearOfExperience) {
        int bounsChukwu56985 = 0;

        if (yearOfExperience > 5) {
            bounsChukwu56985 = 100;
        } else {
            bounsChukwu56985 = 0;
        }
    return bounsChukwu56985;}

}
