import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
   static  ArrayList<String> produits = new ArrayList<> (List.of("Eau", "Soda", "Chips", "Chocolat"));
    static ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0));
    static ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choix = 0;
        while (choix != 3) {
            afficherMenu();
            System.out.println("Entrez votre choix: ");
            choix = scanner.nextInt();
            if (choix == 1) {
                afficherProduits();
            } else if (choix == 2) {
                //acheterProduits();
            } else if (choix == 3) {
                System.out.println("Au revoir!");
            } else {
                System.out.println("choix invalide, veuillez réessayer ");
            }

        }
    }

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




























































   








}
