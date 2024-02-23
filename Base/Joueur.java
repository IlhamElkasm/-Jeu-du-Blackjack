public class Joueur extends  Personne implements  JoueurInterface{
    public Main mainjoueur;
    @Override
    public  void ajouterCarte(Carte carte) {
        mainjoueur.listCartes.add(carte);
    }

    public Joueur(Main mainjoueur) {
        super(500);
        this.mainjoueur = mainjoueur;
    }
    @Override
    public  void affichermainjoueur() {
        System.out.println("************* The player Takes 2 cards : ****************");
        mainjoueur.AffichMain();

        System.out.println("Valeur Total : " +mainjoueur.getValeurTotal());
    }
}
