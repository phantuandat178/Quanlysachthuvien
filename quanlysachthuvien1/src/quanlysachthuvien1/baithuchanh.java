package quanlysachthuvien1;

import java.util.Scanner;

public class baithuchanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] maSach = new String[100];
        String[] tenSach = new String[100];
        String[] tacGia = new String[100];
        int[] namXB = new int[100];
        double[] donGia = new double[100];
        int[] soLuong = new int[100];

        int dem = 0;
        int chon;

        do {
            System.out.println("\n--- MENU QUAN LY SACH ---");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach can them: ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap cuon sach thu " + (i + 1) + ":");
                        System.out.print("Ma sach: ");
                        maSach[dem] = sc.nextLine();

                        System.out.print("Ten sach: ");
                        tenSach[dem] = sc.nextLine();

                        System.out.print("Tac gia: ");
                        tacGia[dem] = sc.nextLine();

                        System.out.print("Nam xuat ban: ");
                        namXB[dem] = Integer.parseInt(sc.nextLine());

                        System.out.print("Don gia: ");
                        donGia[dem] = Double.parseDouble(sc.nextLine());

                        System.out.print("So luong: ");
                        soLuong[dem] = Integer.parseInt(sc.nextLine());

                        dem++;
                    }
                    break;

                case 2:
                    int tongSL = 0;
                    double tongGiaTri = 0;

                    System.out.println("\nDanh sach sach:");
                    for (int i = 0; i < dem; i++) {
                        double thanhTien = donGia[i] * soLuong[i];
                        tongSL += soLuong[i];
                        tongGiaTri += thanhTien;

                        System.out.println("Ma sach: " + maSach[i]
                                + " - Ten sach: " + tenSach[i]
                                + " - Tac gia: " + tacGia[i]
                                + " - Nam XB: " + namXB[i]
                                + " - Don gia: " + donGia[i]
                                + " - So luong: " + soLuong[i]
                                + " - Thanh tien: " + thanhTien);
                    }
                    System.out.println("Tong so luong sach: " + tongSL);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < dem; i++) {
                        if (maSach[i].equalsIgnoreCase(maTim)) {
                            double thanhTien = donGia[i] * soLuong[i];
                            System.out.println("Tim thay:");
                            System.out.println("Ma sach: " + maSach[i]
                                    + " - Ten sach: " + tenSach[i]
                                    + " - Tac gia: " + tacGia[i]
                                    + " - Nam XB: " + namXB[i]
                                    + " - Don gia: " + donGia[i]
                                    + " - So luong: " + soLuong[i]
                                    + " - Thanh tien: " + thanhTien);
                            timThay = true;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach co ma " + maTim);
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Nhap sai, vui long chon lai!");
                    break;
            }
        } while (chon != 0);
    }
}