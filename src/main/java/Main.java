import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AikidoTracker tracker = new AikidoTracker();

        while (true) {
            System.out.println("\n1. Add practice session");
            System.out.println("2. View total practice time");
            System.out.println("3. Check graduation eligibility");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter session date DD-MM-YYYY: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = scanner.nextInt();
                    tracker.addSession(date, duration);
                    System.out.println("Training session added\n");
                    break;
                case 2:
                    System.out.println("Total practice time: " + tracker.getTotalPracticeTime() + " minutes\n");
                    break;
                case 3:
                    boolean isEligible = tracker.checkGraduationEligibility();
                    if (isEligible) {
                        System.out.println("Eligible for kyu graduation\n");
                    } else {
                        System.out.println("Not eligible yet\n");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
