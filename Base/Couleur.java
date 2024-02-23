enum Couleur {
    CARREAU("carreau"),
    COEUR ("coeur"),
    PIQUE("pique"),
    TREFLE ("trefle");
    private final String nom;

    Couleur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
