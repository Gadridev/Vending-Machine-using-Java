import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {



    public static void afficherMenu() {
        System.out.println("=== Distributeur Automatique ===");
        System.out.println("1. Afficher les produits");
        System.out.println("2. Acheter un produit");
        System.out.println("3. Quitter");

    }
    public static void afficherProduits() {
        System.out.println("les produits disponibles: ");
        for (int i = 0; i < produits.size(); i++) {
            System.out.println(i + 1 + "." + produits.get(i) + " ( " + prix.get(i) + " MAD )" + "- Stock: " + stock.get(i));
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
