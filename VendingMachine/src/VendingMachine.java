import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
   Scanner scanner=new Scanner(System.in);
    ArrayList<String> produits = new ArrayList<>(List.of("Eau", "Soda", "Chips", "Chocolat"));
    ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0));
    ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));


























































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
