import java.util.Scanner;
//
public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("haha", 1234, 1000, 200);
        System.out.println("WELCOME TO SIMPLE BANKING APP!!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input account number: ");
        String inputAccountNumber = scanner.nextLine();

        System.out.print("Input PIN: ");
        int inputPin = scanner.nextInt();
        scanner.nextLine();

        if (account.verification(inputAccountNumber, inputPin)) {
            System.out.println("Verification successful.");
            System.out.println("Your account balance is : "+ account.getBalance());
            System.out.println("Your credit balance is : "+ account.getCredit());
            System.out.println(" ");
            System.out.println("A. Withdrawal");
            System.out.println("B. Deposit");
            System.out.println("C. Convert credit to cash");
            System.out.print("Choose banking service (A/B/C):");
            String option = scanner.nextLine();
// try catch. parse double ngambil string tapi parse ke double
            switch (option.toUpperCase()) {
                case "A":
                    try {
                        System.out.print("Input withdrawal amount: ");
                        double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                        BankSystem.withdrawal(account, withdrawalAmount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input");
                    }
                    break;
                case "B":
                    try {
                        System.out.print("Input deposit amount: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        BankSystem.deposit(account, depositAmount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input");
                    }
                    break;
                case "C":
                    try {
                        System.out.print("Input credits you want to convert: ");
                        double convert = Double.parseDouble(scanner.nextLine());
                        BankSystem.convertCreditToCash(account, convert);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input");
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

        } else {
            System.out.println("Verification failed");
        }

        scanner.close();
    }
}