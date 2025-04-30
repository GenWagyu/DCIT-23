import java.util.Scanner;

public class MyMidtermLabExam {
    static final int MAX_TICKETS = 5;
    static String[] descriptions = new String[MAX_TICKETS];
    static String[] urgencies = new String[MAX_TICKETS];
    static String[] statuses = new String[MAX_TICKETS];
    static int ticketCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== IT Ticket Processing System ===");
            System.out.println("1. Add Ticket");
            System.out.println("2. Update Ticket Status");
            System.out.println("3. Show All Tickets");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addTicket(sc); break;
                case 2: updateTicketStatus(sc); break;
                case 3: showTickets(); break;
                case 4: generateReport(); break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    public static void addTicket(Scanner sc) {
        if (ticketCount >= MAX_TICKETS) {
            System.out.println("Cannot add more tickets. Maximum reached.");
            return;
        }

        System.out.print("Enter issue description: ");
        descriptions[ticketCount] = sc.nextLine();

        String urgency;
        do {
            System.out.print("Enter urgency level (Low/Medium/High): ");
            urgency = sc.nextLine();
        } while (!urgency.equalsIgnoreCase("Low") && 
                 !urgency.equalsIgnoreCase("Medium") && 
                 !urgency.equalsIgnoreCase("High"));

        urgencies[ticketCount] = urgency;
        statuses[ticketCount] = "Pending";
        ticketCount++;

        System.out.println("Ticket added successfully!");
    }

    public static void updateTicketStatus(Scanner sc) {
        if (ticketCount == 0) {
            System.out.println("No tickets available.");
            return;
        }
    
        showTickets();
    
        System.out.print("Enter ticket number to update (1-" + ticketCount + "): ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
    
        // Check for valid ticket number
        if (index < 0 || index >= ticketCount) {
            System.out.println("Invalid ticket number.");
            return;
        }
    
        // Prevent updating resolved tickets
        if (statuses[index].equalsIgnoreCase("Resolved")) {
            System.out.println("Ticket #" + (index + 1) + " is already resolved and cannot be updated.");
            return;
        }
    
        System.out.println("Current Status: " + statuses[index]);
        String newStatus;
        do {
            System.out.print("Enter new status (In Progress / Resolved): ");
            newStatus = sc.nextLine();
            if (!newStatus.equalsIgnoreCase("In Progress") && !newStatus.equalsIgnoreCase("Resolved")) {
                System.out.println("Invalid status. Please enter 'In Progress' or 'Resolved'.");
            }
        } while (!newStatus.equalsIgnoreCase("In Progress") && !newStatus.equalsIgnoreCase("Resolved"));
    
        statuses[index] = newStatus;
        System.out.println("Ticket status updated successfully!");
    }
    

    public static void showTickets() {
        if (ticketCount == 0) {
            System.out.println("No tickets to show.");
            return;
        }

        System.out.println("\n--- All Tickets ---");
        for (int i = 0; i < ticketCount; i++) {
            System.out.println("Ticket #" + (i + 1));
            System.out.println("Issue: " + descriptions[i]);
            System.out.println("Urgency: " + urgencies[i]);
            System.out.println("Status: " + statuses[i]);
            System.out.println("----------------------");
        }
    }

    public static void generateReport() {
        int pending = 0, resolved = 0;

        for (int i = 0; i < ticketCount; i++) {
            if (statuses[i].equalsIgnoreCase("Resolved")) {
                resolved++;
            } else {
                pending++;
            }
        }

        System.out.println("\n--- Ticket Report ---");
        System.out.println("Total Tickets: " + ticketCount);
        System.out.println("Pending/In Progress: " + pending);
        System.out.println("Resolved: " + resolved);
    }
}
