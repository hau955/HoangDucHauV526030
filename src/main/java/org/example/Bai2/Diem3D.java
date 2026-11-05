package org.example.Bai2;


public class Diem3D extends diem2d {
    private double z;

    public Diem3D() {
        super();
        z = 0;
    }

    public Diem3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double khoangCach(diem2d p) {
        if (!(p instanceof Diem3D)) {
            throw new IllegalArgumentException("Phai truyen vao diem 3D");
        }

        Diem3D q = (Diem3D) p;

        return Math.sqrt(
                Math.pow(getX() - q.getX(), 2) +
                        Math.pow(getY() - q.getY(), 2) +
                        Math.pow(z - q.z, 2)
        );
    }

    @Override
    public Diem3D doiXung() {
        return new Diem3D(-getX(), -getY(), -z);
    }

    public void tinhTien(double dx, double dy, double dz) {
        super.tinhTien(dx, dy);
        z = z + dz;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

