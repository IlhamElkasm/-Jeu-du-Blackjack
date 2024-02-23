import java.util.Collections;

public class PaquetCartes extends Main implements PaquetCartesInterface {
    //private  ArrayList<Carte> cartes = new ArrayList<>();
    @Override
    public  void remplir() {
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                Carte carte = new Carte(couleur, valeur);
                listCartes.add(carte);
            }
        }
    }
    @Override
    public void melanger() {
        Collections.shuffle(listCartes);
    }
    @Override
    public Carte tirerCarte() {
        if (listCartes.isEmpty()) {
            remplir();
            melanger();
        }
        return listCartes.remove(0);
    }
}