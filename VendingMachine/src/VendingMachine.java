import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

















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
}