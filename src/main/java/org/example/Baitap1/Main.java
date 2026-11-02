package org.example.Baitap1;

import java.util.ArrayList;
import java.util.Scanner;


//public class Main  {
//    public static void main(String[] args) {
//        HInhTron ht1 = new HInhTron(1,1,3.5);
//        HInhTron ht2 = new HInhTron();
//        System.out.println(ht1);
//        System.out.println(ht2);
//        System.out.println(ht1.dientich());
//       ht1.tinhtien(0);
//
//    }
//}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<PhanSo> ds = new ArrayList<>();

        System.out.print("Nhap so luong phan so: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan so thu " + (i + 1));

            System.out.print("Tu so: ");
            int tu = sc.nextInt();

            int mau;
            do {
                System.out.print("Mau so: ");
                mau = sc.nextInt();
            } while (mau == 0);

            ds.add(new PhanSo(tu, mau).rutGon());
        }

        PhanSo max = ds.get(0);
        PhanSo tong = new PhanSo(0, 1);
        int dem = 0;

        for (int i = 0; i < ds.size(); i++) {
            PhanSo p = ds.get(i);

            if (p.soSanh(max) > 0) {
                max = p;
            }

            tong = tong.cong(p);

            if (!p.laSoNguyen()) {
                dem++;
            }
        }

        System.out.println("Danh sach phan so:");
        for (PhanSo p : ds) {
            System.out.println(p);
        }

        System.out.println("Phan so lon nhat: " + max);
        System.out.println("Tong cac phan so: " + tong);
        System.out.println("So phan so khong phai so nguyen: " + dem);

        sc.close();
    }
}
