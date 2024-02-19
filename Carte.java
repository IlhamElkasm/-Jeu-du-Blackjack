
public class Carte { // Correction du nom de classe
    private String couleur;
    private int valeur;

    public Carte(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    // Implémentation de la logique pour la méthode Catre(Couleur couleur, Valeur valeur)
    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur.getNom();
        this.valeur = valeur.getValeur();
    }

    // Getters et setters


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getValeur() {
        return getValeur();
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return  '{'+
                "couleur='" + couleur + '\'' +
                ", valeur=" + valeur +
                '}';
    }
}