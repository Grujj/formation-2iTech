package fr.dessin;

import java.awt.*;
import java.util.ArrayList;

public class Point2D {

    private Integer x;
    private Integer y;
    private static Integer compteur = 0;

    public Point2D(){
        this.setX(0);
        this.setY(0);
        Point2D.compteur += 1;
    }
    
    public Point2D(Integer x, Integer y){
        this.setX(x);
        this.setY(y);
        Point2D.compteur += 1;
    }

    public void afficher(){
        System.out.println("[" + getX() + ", " + getY() + "]");
    }

    /**
     * Methode publique qui permet de translater un point
     * @param dX : int
     * @param dY : int
     */
    public void translater(Integer dX, Integer dY){
        setX(getX() + dX);
        setY(getY() + dY);
    }

    public static void getCompteur(){
        System.out.println(compteur);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
