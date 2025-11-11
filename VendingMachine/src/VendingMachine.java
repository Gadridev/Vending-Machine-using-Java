import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
   Scanner scanner=new Scanner(System.in);
    ArrayList<String> produits = new ArrayList<>(List.of("Eau", "Soda", "Chips", "Chocolat"));
    ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0));
    ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));















    public void acheterProduit() {
        afficherProduits();
        System.out.print("Entrez le numéro du produit : ");
        int numeroProduit;
        if (scanner.hasNextInt()) {
            numeroProduit = scanner.nextInt();
        } else {
            System.out.println("Entrée invalide !");
            scanner.next();
            return;
        }
        int index = numeroProduit - 1;
        if (index < 0 || index >= produits.size()) {
            System.out.println("Produit invalide !");
            return;
        }
        if (stock.get(index) <= 0) {
            System.out.println("Désolé, ce produit est en rupture de stock !");
            return;
        }
        System.out.print("Entrez le montant inséré : ");
        double montant;
        if (scanner.hasNextDouble()) {
            montant = scanner.nextDouble();
        } else {
            System.out.println("Entrée invalide !");
            scanner.next();
            return;
        }
        double prixProduit = prix.get(index);
        if (montant < prixProduit) {
            System.out.println("Montant insuffisant ! Transaction annulée.");
        } else {
            double monnaie = montant - prixProduit;
            System.out.println("Vous avez acheté : " + produits.get(index));
            System.out.println("Monnaie rendue : " + monnaie + " MAD");
            stock.set(index, stock.get(index) - 1);
        }
    }
    public void updateStock(){
            System.out.println("--- Mode Administrateur: Recharger le stock ---");
            for (int i = 0; i < produits.size(); i++) {
                System.out.println(produits.get(i) + " - Stock actuel : " + stock.get(i));
                System.out.print("Quantité à ajouter : ");
                int ajout;
                if (scanner.hasNextInt()) {
                    ajout = scanner.nextInt();
                } else {
                    System.out.println("Entrée invalide !");
                    scanner.next();
                    ajout = 0;
                }
                stock.set(i, stock.get(i) + ajout);
            }
            System.out.println("Stock mis à jour avec succès !");
    }
}
