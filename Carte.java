
public class Carte { // Correction du nom de classe
    private Couleur couleur;
    private Valeur valeurS;


    // Implémentation de la logique pour la méthode Catre(Couleur couleur, Valeur valeur)
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

    public Valeur getValeurs() {
        return valeurS;
    }

    public void setValeur(Valeur valeur) {
        this.valeurS = valeur;
    }

    @Override
    public String toString() {
        return  '{'+
                "couleur='" + couleur + '\'' +
                ", valeur=" + valeurS +
                '}';
    }
}