public class Joueur extends  Personne{
     public Main mainjoueur;

public  void ajouterCarte(Carte carte) {
    mainjoueur.listCartes.add(carte);
    }

    public Joueur(Main mainjoueur) {
        super();
        this.mainjoueur = mainjoueur;
    }
    public  void affichermainjoueur() {
        System.out.println("************* The player Takes 2 cards : ****************");
        mainjoueur.AffichMain();

        System.out.println("Valeur Total : " +mainjoueur.getValeurTotal());
    }
}
