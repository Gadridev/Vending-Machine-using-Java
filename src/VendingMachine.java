import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class VendingMachine {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> produits = new ArrayList<>(List.of("Eau", "Soda", "Chips", "Chocolat"));
        ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0));
        ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));

        public void afficherMenu() {
            System.out.println("=== Distributeur Automatique ===");
            System.out.println("1. Afficher les produits");
            System.out.println("2. Acheter un produit");
            System.out.println("3. Quitter");
        }
        public void afficherProduits() {
            System.out.println("Produits disponibles :");
            for (int i = 0; i < produits.size(); i++) {
                System.out.println((i + 1) + ". " + produits.get(i) + " (" + prix.get(i) + " MAD) - Stock : " + stock.get(i));
            }
        }
}
