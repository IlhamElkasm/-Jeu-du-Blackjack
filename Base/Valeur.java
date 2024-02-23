enum Valeur {
    AS(1, "As"),
    TWO(2, "Two"),
    THREE(3, "Three"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    TEN(10, "Ten"),
    VALET(10, "Valet"),
    DAME(10, "Dame"),
    ROI(10, "Roi");
    private final int valeur;
    private final String nom;

    Valeur(int valeur, String nom) {
        this.valeur= valeur;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }
}
