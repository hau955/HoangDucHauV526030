package org.example;

public class HInhTron {

    public double getX() {
        return x;
    }

    private  double x;

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    private  double y;

    public double getZ() {
        return z;
    }



    public HInhTron(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public HInhTron() {}
    private  double z;

    @Override
    public String toString() {
        return "HInhTron{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public double dientich() {
        return Math.PI*z*z;
    }
    public void tinhtien(double d) {
        x = x+d;
        y = y+d;
    }
}
