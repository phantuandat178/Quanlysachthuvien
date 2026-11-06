package quanlysachthuvien;

import java.util.Scanner;

/**
 * Sinh viên thực hiện: Phan Tuấn Đạt
 * MSSV: 23115053122209
 * Bài thực hành Tuần 3: Biến, kiểu dữ liệu và toán tử trong Java
 */
public class Quanlysachthuvien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHUONG TRINH QUAN LY SACH THU VIEN (TUAN 3) ===");
        System.out.println("Sinh vien: Phan Tuan Dat - MSSV: 23115053122209\n");

        // Bài 1: Nhập mã sách, tên sách, tác giả, năm xuất bản, đơn giá, số lượng
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        // Bài 2: Tính thành tiền = đơn giá * số lượng
        double thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển = 5% giá trị sách (thành tiền)
        double phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị lại thông tin và kết quả tính toán
        System.out.println("\n--- THONG TIN SACH VA GIA TRI NHAP KHO ---");
        System.out.println("Ma sach        : " + maSach);
        System.out.println("Ten sach       : " + tenSach);
        System.out.println("Tac gia        : " + tacGia);
        System.out.println("Nam xuat ban   : " + namXuatBan);
        System.out.printf("Don gia        : %.0f VND\n", donGia);
        System.out.println("So luong       : " + soLuong);
        System.out.printf("Thanh tien     : %.0f VND\n", thanhTien);
        System.out.printf("Phi van chuyen : %.0f VND\n", phiVanChuyen);
        System.out.printf("Tong tien nhap : %.0f VND\n", tongTienNhap);
    }
}