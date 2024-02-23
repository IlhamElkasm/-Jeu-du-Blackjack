public class Croupier extends Personne implements CroupierInterface{
    int valeurTotalLimit;
    Main maincroupier ;
    @Override
    public  void ajouterCarteC(Carte carte) {

        maincroupier.listCartes.add(carte);
    }
    public Croupier(Main maincroupier) {
        super(0);
        this.maincroupier=maincroupier;
    }
    @Override
    public  void affichermainCroupier() {
        System.out.println("************* The Croupier Takes 2 cards : ****************");
        maincroupier.AffichMain();
        System.out.println("Valeur Total : " + maincroupier.getValeurTotal());
    }
}
