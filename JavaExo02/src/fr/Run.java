package fr;

import fr.dessin.Point2D;

public class Run {
    public static void main(String[] args){
        Point2D point1 = new Point2D(4, 5);
        Point2D point2 = new Point2D(5, 6);

        System.out.println("Point1 :");
        point1.afficher();
        point1.translater(2, 2);
        point1.afficher();

        System.out.println("Point 2 :");
        point2.afficher();
        point2.translater(3, 3);
        point2.afficher();

        System.out.println("Compteur : ");
        Point2D.getCompteur();
    }
}
