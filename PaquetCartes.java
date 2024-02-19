import java.util.ArrayList;
import java.util.Collections;

public class PaquetCartes extends Main {
    //private  ArrayList<Carte> cartes = new ArrayList<>();

    public  void remplir() {
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                Carte carte = new Carte(couleur, valeur);
                listCartes.add(carte);
            }
        }
    }

    public void melanger() {
        Collections.shuffle(listCartes);
    }

    public Carte tirerCarte() {
        if (listCartes.isEmpty()) {
            remplir();
            melanger();
        }
        return listCartes.remove(0);
    }
}