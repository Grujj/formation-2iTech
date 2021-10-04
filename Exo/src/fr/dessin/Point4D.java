package fr.dessin;

public class Point4D {

    private Point3D point3D;
    private Integer a;

    public Point4D(){

    }

    public Point4D(Integer x, Integer y, Integer z, Integer a){
        this.setPoint3D(new Point3D(x, y, z));
        this.setA(a);
    }

    public void translater(Integer dX, Integer dY, Integer dZ, Integer dA){
        this.point3D.translater(dX, dY, dZ);
        this.setA(getA() + dA);
    }

    public Point3D getPoint3D() {
        return point3D;
    }

    public void setPoint3D(Point3D point3D) {
        this.point3D = point3D;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }
}
