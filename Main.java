import java.util.ArrayList;

public class Main {
    private int valeurTotal;
    private String nom;
    private int nbCartes = 0;
   public   ArrayList<Carte> listCartes = new ArrayList<>();
     // Getters et setters
   public void AffichMain(){
        for(Carte cart :listCartes){
            cart.AfficheCarte();
        }
   }


    public int getValeurTotal() {
        valeurTotal=0;
        for(Carte cart : listCartes){
            valeurTotal = valeurTotal + cart.getValeurs().getValeur();
        }

        return valeurTotal;
    }
    public void setValeurTotal(int valeurTotal) {

        this.valeurTotal = valeurTotal;
    }
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public int getNbCartes() {return nbCartes;}
    public void setNbCartes(int nbCartes) {this.nbCartes = nbCartes;}
}
