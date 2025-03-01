import java.util.Scanner;

public class LabActivity1EmployeeInformationSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println ("Enter your first name: ");
        String FirstName = scan.nextLine();

        System.out.println ("Enter your last name: ");
        String LastName = scan.nextLine();

        System.out.println ("Enter your age: ");
        int Age = scan.nextInt();

        System.out.println ("Enter hours worked:");
        double HoursWorked = scan.nextDouble();

        System.out.println ("Enter hourly wage: ");
        double HourlyWage = scan.nextDouble();
       
        scan.nextLine(); //tells the system to continue to the next line, which VS Code was not doing >(ভ⤙ ভ ")<
        String FullName = FirstName + " " + LastName ;
        double Salary = HoursWorked * HourlyWage ;

        System.out.println ("\nEmployee Information");
        System.out.println ("---------------------");
        // apparently, line 26 and 27 cannot be proccessed by VS Code but can be proccessed by other IDEs
        
        System.out.println ("Full Name: " + FullName);
        System.out.println ("Age: " + Age + " Years old");
        System.out.printf ("Daily Salary: PHP %.2f", Salary );

        scan.close(); // system was telling me that "scan" was a resource leak and should be closed
    }
}
