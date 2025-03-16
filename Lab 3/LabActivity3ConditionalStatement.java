import java.util.Scanner;

public class LabActivity3ConditionalStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println ("Enter your first name: ");
        String FirstName = scan.nextLine();

        System.out.println ("Enter your last name: ");
        String LastName = scan.nextLine();

        System.out.println ("Enter your age: ");
        int Age = scan.nextInt();

        if (Age <18) { //age condition
            System.out.println ("Minors are not allowed");
            System.exit(0);
        } else if (Age > 65) {
            System.out.println ("Senior Citizens are not allowed");
            System.exit(0);
        }

        System.out.println ("Enter hours worked (per day):");
        double HoursWorked = scan.nextDouble();

        if (HoursWorked > 24) { // hours worked condition
            System.out.println ("Number of hours worked cannot exceed 24 hours");
            System.exit(0);
        } else if (HoursWorked <= 0) {
            System.out.println ("Wrong input on daily work hours");
        }

        System.out.println ("Enter hourly wage: ");
        double HourlyWage = scan.nextDouble();

        System.out.println ("Enter role code (1-Manager, 2-SuperVisor, 3-Staff, 4-Intern): ");
        int RoleCode = scan.nextInt();
       
        scan.nextLine(); //tells the system to continue to the next line, which VS Code was not doing >(ভ⤙ ভ ")<
        
        String Role;
        switch (RoleCode) {
            case 1: Role = "Manager"; break;
            case 2: Role = "SuperVisor"; break;
            case 3: Role = "Staff"; break;
            case 4: Role = "Intern"; break;
            default: Role = "Undefined"; break;
        }

        //calculations
        String FullName = (LastName +","+ " " + FirstName).toUpperCase() ;
        int RetirementCountdown = Math.abs(65 - Age);
        double DWage = HoursWorked * HourlyWage ; // from "Salary" to "Dwage" *D = Daily*
        double WWage = DWage * 5 ; // Weekly
        double Mwage = WWage * 4 ; // Monthly
        double GYWage = Mwage * 12 ; // Gross Yearly
        double NYWage ; // Net Yearly

        if (GYWage > 250000) { // if GYWage is greater than 250,000, add 32% tax
            double Taxes = (GYWage * 0.32) + 1500 ;
            NYWage = GYWage - Taxes ;
        } else {
            NYWage = GYWage - 1500 ;
        }
    
        // all the to-be printed info v 
        System.out.println ("\nEmployee Information");
        System.out.println ("----------------------------------------");

        System.out.printf ("%-20s: %s %n", "Full Name", FullName);
        System.out.printf ("%-20s: %d Years old %n", "Age", Age);
        System.out.printf ("%-20s: %s %n", "Role", Role);
        System.out.printf ("%-20s: %d Years %n","Years to Retirement", RetirementCountdown);
        System.out.printf ("%-20s: PHP %.2f %n", "Daily Salary", DWage );
        System.out.printf ("%-20s: PHP %.2f %n", "Weekly Saraly", WWage);
        System.out.printf ("%-20s: PHP %.2f %n", "Monthly Salary", Mwage);
        System.out.printf ("%-20s: PHP %.2f %n", "Gross Yearly Salary", GYWage);
        System.out.printf ("%-20s: PHP %.2f %n", "Net Yearly Salary", NYWage);

        // % are format specifiers, "-" means left aligned, 20 for the width, "s" for string, "d" = integer, "f" = float, ".2" = 2 decimal places, "%n" = new line

        scan.close(); // system was telling me that "scan" was a resource leak and should be closed
    }
}
