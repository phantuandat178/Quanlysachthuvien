package quanlysachthuvien1;

import java.util.ArrayList;
import java.util.Scanner;

public class baithuchanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] soLuong5Sach = new int[5];
        System.out.println("Nhap so luong cho 5 cuon sach dau tien:");
        int tong5Sach = 0;
        int maxSoLuong = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("So luong sach thu " + (i + 1) + ": ");
            soLuong5Sach[i] = Integer.parseInt(sc.nextLine());
            tong5Sach += soLuong5Sach[i];
            if (i == 0 || soLuong5Sach[i] > maxSoLuong) {
                maxSoLuong = soLuong5Sach[i];
            }
        }

        System.out.print("So luong 5 cuon sach vua nhap: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(soLuong5Sach[i] + " ");
        }
        System.out.println("\nTong so luong: " + tong5Sach);
        System.out.println("So luong lon nhat: " + maxSoLuong);

        ArrayList<String> dsMaSach = new ArrayList<>();
        ArrayList<String> danhSachSach = new ArrayList<>();
        ArrayList<Integer> dsSoLuong = new ArrayList<>();
        ArrayList<Double> dsDonGia = new ArrayList<>();

        int chon;
        do {
            System.out.println("\n--- MENU QUAN LY SACH ---");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang (1-8): ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap don gia: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap so luong: ");
                    int sl = Integer.parseInt(sc.nextLine());

                    String thongTin = "Ma sach: " + ma + " - Ten sach: " + ten
                            + " - Tac gia: " + tg + " - Nam XB: " + nam
                            + " - Don gia: " + gia + " - So luong: " + sl;

                    dsMaSach.add(ma);
                    danhSachSach.add(thongTin);
                    dsDonGia.add(gia);
                    dsSoLuong.add(sl);
                    System.out.println("Da them sach thanh cong.");
                    break;

                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach dang trong.");
                    } else {
                        System.out.println("\nDanh sach sach:");
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maTim)) {
                            System.out.println("Tim thay: " + danhSachSach.get(i));
                            timThay = true;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean daXoa = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maXoa)) {
                            dsMaSach.remove(i);
                            danhSachSach.remove(i);
                            dsDonGia.remove(i);
                            dsSoLuong.remove(i);
                            daXoa = true;
                            System.out.println("Da xoa sach co ma: " + maXoa);
                            break;
                        }
                    }
                    if (!daXoa) {
                        System.out.println("Khong tim thay ma sach de xoa.");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    int viTri = -1;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maSua)) {
                            viTri = i;
                            break;
                        }
                    }

                    if (viTri != -1) {
                        System.out.print("Nhap ten sach moi: ");
                        String tenMoi = sc.nextLine();
                        System.out.print("Nhap tac gia moi: ");
                        String tgMoi = sc.nextLine();
                        System.out.print("Nhap nam xuat ban moi: ");
                        int namMoi = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap don gia moi: ");
                        double giaMoi = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhap so luong moi: ");
                        int slMoi = Integer.parseInt(sc.nextLine());

                        String thongTinMoi = "Ma sach: " + maSua + " - Ten sach: " + tenMoi
                                + " - Tac gia: " + tgMoi + " - Nam XB: " + namMoi
                                + " - Don gia: " + giaMoi + " - So luong: " + slMoi;

                        danhSachSach.set(viTri, thongTinMoi);
                        dsDonGia.set(viTri, giaMoi);
                        dsSoLuong.set(viTri, slMoi);
                        System.out.println("Da cap nhat thong tin sach.");
                    } else {
                        System.out.println("Khong tim thay ma sach can sua.");
                    }
                    break;

                case 6:
                    int tongSL = 0;
                    for (int i = 0; i < dsSoLuong.size(); i++) {
                        tongSL += dsSoLuong.get(i);
                    }
                    System.out.println("Tong so luong sach trong danh sach: " + tongSL);
                    break;

                case 7:
                    double tongGiaTri = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        tongGiaTri += dsDonGia.get(i) * dsSoLuong.get(i);
                    }
                    System.out.println("Tong gia tri sach trong danh sach: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (chon != 8);
    }
}