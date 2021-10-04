package fr.dessin;

public class Point3D extends Point2D {

    private Integer z;

    public Point3D(){

    }

    public Point3D(Integer x, Integer y, Integer z){
        super(x, y);
        this.setZ(z);
    }

    @Override
    public void afficher(){
        System.out.println("[" + getX() + ", " + getY() + ", " + getZ() + "]");
    }

    public void translater(Integer dX, Integer dY, Integer dZ){
        this.setX(getX() + dX);
        this.setY(getY() + dY);
        this.setZ(getZ() + dZ);
    }

    public Integer getZ() {
        return this.z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
}
