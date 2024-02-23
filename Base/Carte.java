
public class Carte implements CarteInterface{ // Correction du nom de classe
    private Couleur couleur;
    private Valeur valeurS;


    // constructor
    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeurS = valeur;
    }

    // Getters et setters


    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
    @Override
    public Valeur getValeurs() {
        return valeurS;
    }

    public void setValeur(Valeur valeur) {
        this.valeurS = valeur;
    }

    @Override
    public void AfficheCarte() {
        System.out.println("couleur= " + couleur.getNom()  +
                " valeur= " + valeurS.getValeur());
    }
}