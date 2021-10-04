package fr.dessin;

import java.awt.*;
import java.util.ArrayList;

public class Point2D {

    private int x;
    private int y;

    public Point2D(){

    }
    
    public Point2D(int x, int y){
        setX(x);
        setY(y);
    }

    public void afficher(){
        System.out.println(getX());
        System.out.println(getY());
    }

    /**
     * Methode publique qui permet de translater
     * @param dX : int
     * @param dY : int
     */
    public void translater(int dX, int dY){
        setX(getX() + dX);
        setY(getY() + dY);
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
