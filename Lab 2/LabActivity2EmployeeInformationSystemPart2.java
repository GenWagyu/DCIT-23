import java.util.Scanner;

public class LabActivity2EmployeeInformationSystemPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println ("Enter your first name: ");
        String FirstName = scan.nextLine();

        System.out.println ("Enter your last name: ");
        String LastName = scan.nextLine();

        System.out.println ("Enter your age: ");
        int Age = scan.nextInt();

        System.out.println ("Enter hours worked (per day):");
        double HoursWorked = scan.nextDouble();

        System.out.println ("Enter hourly wage: ");
        double HourlyWage = scan.nextDouble();
       
        scan.nextLine(); //tells the system to continue to the next line, which VS Code was not doing >(ভ⤙ ভ ")<
        
        //calculations
        String FullName = (LastName +","+ " " + FirstName).toUpperCase() ;
        int RetirementCountdown = Math.abs(65 - Age);
        double DWage = HoursWorked * HourlyWage ; // from "Salary" to "Dwage" *D = Daily*
        double WWage = DWage * 5 ; // Weekly
        double Mwage = WWage * 4 ; // Monthly
        double GYWage = Mwage * 12 ; // Gross Yearly
        double Taxes = (GYWage * 0.32) + 1500 ;
        double NYWage = GYWage - Taxes ; // Net Yearly
    
        // all the to-be printed info v 
        System.out.println ("\nEmployee Information");
        System.out.println ("---------------------");
        // apparently, line 26 and 27 cannot be proccessed by VS Code but can be proccessed by other IDEs
        // update* VS Code now works fine with the code

        System.out.printf ("%-20s: %s %n", "Full Name", FullName);
        System.out.printf ("%-20s: %d Years old %n", "Age", Age);
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
