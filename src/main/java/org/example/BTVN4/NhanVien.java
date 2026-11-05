package org.example.BTVN4;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    private int snct;
    private double hsl;

    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }
    public double tinhTienLuong() {
        double lcb = 1500000;
        double phucap = 200000 * snct;

        return lcb * hsl + phucap;
    }

    public void xuat() {
        super.xuat();
        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.println("Tien luong: " + tinhTienLuong() + " VND");
    }

    public int getSnct() {
        return snct;
    }

}
