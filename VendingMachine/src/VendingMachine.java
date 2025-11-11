import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {




























































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
