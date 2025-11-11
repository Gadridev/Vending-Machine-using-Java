import java.util.Scanner;

public class Main {
    public static void main(){
        System.out.print("just for testing");
        VendingMachine v=new VendingMachine();
        Scanner s=new Scanner(System.in);
        boolean quitter=false;
        while (!quitter) {
            v.afficherMenu();
            int choix=s.nextInt();
            switch (choix) {
                case 1:
                    v.afficherProduits();
                    break;
                case 2:
                    v.acheterProduit();
                    break;
                case 3:
                    System.out.println("Merci d'avoir utilisé le distributeur !");
                    quitter = true;
                    break;
                case 4:
                    v.updateStock();
                    break;
                default:
                    System.out.println("Choix invalide, réessayez.");
            }
            System.out.println();
        }
    }
}