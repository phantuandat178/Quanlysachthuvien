package quanlysachthuvien;

import java.util.Scanner;

/**
 * Sinh viên thực hiện: Phan Tuấn Đạt
 * MSSV: 23115053122209
 * Bài thực hành Tuần 4: Câu lệnh điều kiện trong Java (Phát triển từ Tuần 3)
 */
public class Quanlysachthuvien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHUONG TRINH QUAN LY SACH THU VIEN (TUAN 4) ===");
        System.out.println("Sinh vien: Phan Tuan Dat - MSSV: 23115053122209\n");

        // --- Phần nhập liệu kế thừa từ Tuần 3 ---
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

        // --- BÀI 4 (Tuần 4): Dùng switch chọn loại sách ---
        System.out.println("\nChon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        int chonLoai = Integer.parseInt(sc.nextLine());

        String tenLoaiSach;
        switch (chonLoai) {
            case 1:
                tenLoaiSach = "Sach giao khoa";
                break;
            case 2:
                tenLoaiSach = "Sach tham khao";
                break;
            case 3:
                tenLoaiSach = "Sach chuyen nganh";
                break;
            case 4:
                tenLoaiSach = "Sach khac";
                break;
            default:
                tenLoaiSach = "Khong xac dinh (Mac dinh: Sach khac)";
                break;
        }

        // --- BÀI 1 (Tuần 4): Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ ---
        System.out.println("\n--- KET QUA KIEM TRA VA PHAN LOAI SACH ---");
        int namHienTai = 2026;
        if (donGia <= 0 || soLuong < 0 || namXuatBan <= 0 || namXuatBan > namHienTai) {
            System.out.println("Loi: Thong tin sach KHONG HOP LE! (Yeu cau: Gia > 0, So luong >= 0, Nam XB hop le).");
            return; // Dừng chương trình nếu dữ liệu sai
        } else {
            System.out.println("Trang thai du lieu : Hop le");
        }

        // Tính toán giá trị nhập kho (từ Tuần 3)
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        // --- BÀI 2 (Tuần 4): Phân loại giá ---
        String phanLoaiGia;
        if (donGia < 50000) {
            phanLoaiGia = "Sach gia thap";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sach gia trung binh";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sach gia cao";
        } else {
            phanLoaiGia = "Sach gia dac biet";
        }

        // --- BÀI 3 (Tuần 4): Phân loại tồn kho ---
        String phanLoaiTonKho;
        if (soLuong == 0) {
            phanLoaiTonKho = "Het sach";
        } else if (soLuong <= 5) {
            phanLoaiTonKho = "Sap het";
        } else if (soLuong <= 20) {
            phanLoaiTonKho = "Con it";
        } else {
            phanLoaiTonKho = "Con nhieu";
        }

        // Hiển thị toàn bộ kết quả
        System.out.println("Ma sach            : " + maSach);
        System.out.println("Ten sach           : " + tenSach);
        System.out.println("Tac gia            : " + tacGia);
        System.out.println("Nam xuat ban       : " + namXuatBan + (namXuatBan >= 2024 ? " (Sach moi)" : " (Sach cu)"));
        System.out.println("Loai sach          : " + tenLoaiSach);
        System.out.printf("Don gia            : %.0f VND -> [%s]\n", donGia, phanLoaiGia);
        System.out.println("So luong           : " + soLuong + " -> [" + phanLoaiTonKho + "]");
        System.out.printf("Thanh tien         : %.0f VND\n", thanhTien);
        System.out.printf("Phi van chuyen (5%%): %.0f VND\n", phiVanChuyen);
        System.out.printf("Tong tien nhap     : %.0f VND\n", tongTienNhap);
    }
}