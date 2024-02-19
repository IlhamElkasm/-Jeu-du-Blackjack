public class Croupier extends Personne{
    int valeurTotalLimit;
Main maincroupier ;
    public  void ajouterCarteC(Carte carte) {
        maincroupier.listCartes.add(carte);
    }
    public Croupier(Main maincroupier) {
        super();
      this.maincroupier=maincroupier;
    }
    public  void affichermainCroupier() {
        System.out.println("************* The Croupier Takes 2 cards : ****************");
            maincroupier.AffichMain();
        System.out.println("Valeur Total : " +maincroupier.getValeurTotal());
    }
}
