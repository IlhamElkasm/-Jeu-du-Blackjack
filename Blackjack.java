import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaquetCartes paquetCartes = new PaquetCartes();
        Main mainjoueur=new Main();
        Main maincroupier=new Main();
        Joueur joueur = new Joueur(mainjoueur);
        Croupier croupier = new Croupier(maincroupier);
        paquetCartes.remplir();
        int choice = 0;
        do {
            System.out.println("------------------------------Bienvenue au BlackJack-----------------------------------");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<Bonne chance pour gagnier conter le croupier>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("                               --Menu principale--                       ");
            System.out.println("1.Commencer a jouer");
            System.out.println("2.Consulter mon solde de jetons");
            System.out.println("3. Quitter le jouer");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Combien voulez-vous miser ?");
                    int mise = scanner.nextInt();
                    scanner.nextLine();
                    croupier.ajouterCarteC(paquetCartes.tirerCarte());
                    croupier.ajouterCarteC(paquetCartes.tirerCarte());
                    joueur.ajouterCarte(paquetCartes.tirerCarte());
                    joueur.ajouterCarte(paquetCartes.tirerCarte());


                    croupier.affichermainCroupier();
                    joueur.affichermainjoueur();


                    do {
                        System.out.println("1-Hit");
                        System.out.println("2-Stand");
                        int hiSt = scanner.nextInt();
                        switch (choice)
                        {
                            case 1:
                                if (hiSt == 1) {
                                    joueur.ajouterCarte(paquetCartes.tirerCarte());
                                    joueur.affichermainjoueur();
                                } else if (hiSt == 2) {
                                    break;
                                }
                                break;
                            case 2:
                                break;
                        }
                    }while (choice != 2);
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