enum Valeur {
    AS("As", 1),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR ("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    VALET("Valet", 10),
    DAME("Dame", 10),
    ROI("Roi", 10);
    private final String nom;
    private final int valeur;

    Valeur(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }
}
