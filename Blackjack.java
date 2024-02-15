import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("------------------------------Beinvenur au BlackJock-----------------------------------");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<Bonne chance pour gagnier conter le croupier>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("                             --Menu principale--             ");
            System.out.println("1.Commencer a joure");
            System.out.println("2.Consulter mon solde de jetons");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }while (choice != 3);
        scanner.close();
    }
}