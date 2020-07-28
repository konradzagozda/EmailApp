package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    // todo:
    // constructor to reveive the first and last name
    // ask for department
    // generate a random password
    // set the email capacity
    // set the alternate email
    // change the password



    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // call a method asking for a department - return the department
        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){ return "sales"; }
        else if(departmentChoice == 2) {return "dev";}
        else if(departmentChoice == 3) {return "acct";}
        return "";
    }

    private String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
