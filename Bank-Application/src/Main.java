import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean exitRequested = false;
        while(!exitRequested) {
            PrintService.printMenu();
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1 -> bank.registerAccount();
                case 2 -> bank.loginAccount();
                case 3 -> exitRequested = true;
                default -> System.out.println("Invalid input!!");
            }
        }
    }
}
