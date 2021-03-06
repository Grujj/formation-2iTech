package fr;

import fr.banque.BanqueException;
import fr.banque.Client;
import fr.banque.compteASeuil.CompteASeuil;
import fr.dessin.Point2D;
import fr.dessin.Point3D;

public class Run {
    public static void main(String[] args){
        Run.javaExo7();
    }

    public static void javaExo1a5(){
        Point2D point2D = new Point2D(4, 5);
        Point3D point3D = new Point3D(5, 6, 10);

        System.out.println("Point 2D :");
        point2D.afficher();
        point2D.translater(2, 2);
        point2D.afficher();

        System.out.println("Point 3D :");
        point3D.afficher();
        point3D.translater(3, 3, 6);
        point3D.afficher();

        System.out.println("Compteur : ");
        Point2D.getCompteur();
    }

    public static void javaExo6(){

        /*Client client = new Client();
        client.ajouterCompte(new Compte());
        client.ajouterCompte(null);
        client.ajouterCompte(new Compte(123, 500D));
        client.ajouterCompte(new Compte());
        client.ajouterCompte(new Compte(345, 750D));

        System.out.println(client.toString());*/
    }

    public static void javaExo7() {

        Client client = new Client();

        try{
            client.ajouterCompte(new CompteASeuil(155, 500D, 250D));
            client.getCompte(155).retirer(50D);
            client.ajouterCompte(new CompteASeuil(156, 500D, 250D));
            client.getCompte(156).retirer(300D);
        } catch(BanqueException e){
            e.printStackTrace();
        }
        finally {
            System.out.println(client.toString());
        }
    }
}
