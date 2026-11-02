package org.example.Bai2;


public class diem2d {
    private double x;
    private double y;

    public diem2d() {
        x = 0;
        y = 0;
    }

    public diem2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double khoangCach(diem2d p) {
        return Math.sqrt(
                Math.pow(x - p.x, 2) +
                        Math.pow(y - p.y, 2)
        );
    }

    public diem2d doiXung() {
        return new diem2d(-x, -y);
    }

    public void tinhTien(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

