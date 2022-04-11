package Com.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Staff extends Person{
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

        sf.Initialize1();
        sf.print1();
    }

}
