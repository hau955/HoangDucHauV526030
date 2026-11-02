package org.example.Bai2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong diem: ");
        int n = sc.nextInt();

        diem2d[] ds = new diem2d[2 * n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap diem thu " + (i + 1));
            System.out.print("Nhap loai diem (2D hoac 3D): ");
            int loai = sc.nextInt();

            System.out.print("Nhap x: ");
            double x = sc.nextDouble();

            System.out.print("Nhap y: ");
            double y = sc.nextDouble();

            if (loai == 2) {
                ds[i] = new diem2d(x, y);
            } else {
                System.out.print("Nhap z: ");
                double z = sc.nextDouble();

                ds[i] = new Diem3D(x, y, z);
            }
        }

        double tong2D = 0;
        double tong3D = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!(ds[i] instanceof Diem3D)
                        && !(ds[j] instanceof Diem3D)) {

                    tong2D += ds[i].khoangCach(ds[j]);

                } else if (ds[i] instanceof Diem3D
                        && ds[j] instanceof Diem3D) {

                    tong3D += ds[i].khoangCach(ds[j]);
                }
            }
        }

        System.out.println("\nTong khoang cach cac diem 2D: " + tong2D);
        System.out.println("Tong khoang cach cac diem 3D: " + tong3D);

        int dem = n;

        for (int i = 0; i < n; i++) {
            ds[dem] = ds[i].doiXung();
            dem++;
        }

        System.out.println("\nDanh sach diem sau khi them diem doi xung:");

        for (int i = 0; i < dem; i++) {
            if (ds[i] instanceof Diem3D) {
                System.out.println("Diem 3D: " + ds[i]);
            } else {
                System.out.println("Diem 2D: " + ds[i]);
            }
        }

        sc.close();
    }
}

