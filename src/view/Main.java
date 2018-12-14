package view;

import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import bll.DiemBLL;
import bll.HeDaoTaoBLL;
import bll.KhoaHocBLL;
import bll.MonHocBLL;
import bll.SinhVienBLL;
import dal.SinhVienDAL;
import entity.Diem;
import entity.HeDaoTao;
import entity.KhoaHoc;
import entity.MonHoc;
import entity.SinhVien;

public class Main {
        static Scanner sc = new Scanner(System.in);
        static int choose = 0;
        static boolean conti = false;

        public static void main(String[] args) {

                System.out.println("Hệ Thống Quản Lý Sinh Viên");
                System.out.println("==========================");

//                  List<SinhVien> list; 
//                  SinhVienDAL bll = new SinhVienDAL(); 
//                  list = bll.getList("select * from SinhVien"); 
//                  bll.show(list);
//                 
                showMenu();
        }

        public static void showMenu() {

                int chon = 0;
                do {
                        System.out.println("Menu: ");
                        System.out.println("1.Quản lý điểm.");
                        System.out.println("2.Quản lý Hệ đào tạo.");
                        System.out.println("3.Quản lý Khoa.");
                        System.out.println("4.Quản lý Khóa Học.");
                        System.out.println("5.Quản lý Lớp.");
                        System.out.println("6.Quản lý Môn Học.");
                        System.out.println("7.Quản lý Sinh Viên.");
                        System.out.println("0.Thoát");
                        System.out.println("----------------------");
                        do {
                                System.out.println("Chọn chức năng : ");
                                chon = sc.nextInt();
                        } while (chon < 0 || chon > 7);
                        switch (chon) {
                        case 1:
                                quanLyDiem();
                                break;
                        case 2:
                                quanLyHDT();
                                break;
                        case 3:
                                quanLyKhoa();
                                break;
                        case 4:
                                quanLyKhoaHoc();
                                break;
                        case 5:
                                quanLyLop();
                                break;
                        case 6:
                                quanLyMonHoc();
                                break;
                        case 7:
                                quanLySinhVien();
                                break;
                        case 0:
                                thoat();
                                break;

                        default:
                                break;
                        }
                } while (chon != 7);

        }

        private static void thoat() {
                System.out.println("Đã Thoát!!!!!!!!");
                System.exit(0);

        }

        private static void quanLySinhVien() {
                do {
                        System.out.println("1. Hiển Thị ");
                        System.out.println("2. Thêm ");
                        System.out.println("3. Xóa ");
                        System.out.println("4. Sửa ");
                        System.out.println("0. Thoát");
                        System.out.println("=============");
                        do {
                                System.out.println("Ban chọn: ");
                                choose = sc.nextInt();
                        } while (choose < 0 || choose > 4);
                        SinhVienBLL svBLL = new SinhVienBLL();
                        SinhVien sv = new SinhVien();
                        List<SinhVien> listKH;

                        switch (choose) {
                        case 1:
                                System.out.println("==Danh Sách SinhVien==");
                                listKH = svBLL.getList("select * from sinhvien");
                                svBLL.show(listKH);
                                break;
                        case 2:
                                System.out.println("==Thêm danh sách==");
                                Scanner scsv1 = new Scanner(System.in);
                                System.out.println("Nhập mã sinh viên: ");
                                String maSV = scsv1.nextLine();

                                System.out.println("Nhập tên sinh viên: ");
                                String tenSV = scsv1.nextLine();
                                System.out.println("Nhập gioi tinh sinh viên: ");
                                String gt = scsv1.nextLine();

                                System.out.println("Nhập ngay sinh(yyyy-MM-dd): ");
                                String ngaysinh = scsv1.nextLine();
                                DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
                                Date date;
                                try {
                                        date = (Date) formater.parse(ngaysinh);
                                        sv.setNgaySinh(date);
                                } catch (ParseException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }

                                System.out.println("Nhập que quan: ");
                                String qqSV = scsv1.nextLine();
                                System.out.println("Nhập malop(trùng với mã lớp ở Table Lop): ");
                                String malop = scsv1.nextLine();
                                sv.setMaSV(maSV);
                                sv.setTenSV(tenSV);
                                sv.setGioiTinh(gt);

                                sv.setQueQuan(qqSV);
                                sv.setMaLop(malop);
                                svBLL.insert(sv);
                                break;
                        case 3:
                                System.out.println("==Xóa Danh Sách==");
                                Scanner scsv2 = new Scanner(System.in);
                                System.out.println("Nhập mã khóa học cần xóa: ");
                                maSV = scsv2.nextLine();
                                sv.setMaSV(maSV);
                                svBLL.delete(sv);
                                break;
                        case 4:

                                System.out.println("==Sửa Danh Sách==:");
                                Scanner scsv3 = new Scanner(System.in);
                                System.out.println("Nhập mã sinh viên: ");
                                maSV = scsv3.nextLine();

                                System.out.println("Nhập tên sinh viên: ");
                                tenSV = scsv3.nextLine();
                                System.out.println("Nhập gioi tinh sinh viên: ");
                                gt = scsv3.nextLine();

                                System.out.println("Nhập ngay sinh(yyyy-MM-dd): ");
                                ngaysinh = scsv3.nextLine();
                                formater = new SimpleDateFormat("yyyy-MM-dd");

                                try {
                                        date = (Date) formater.parse(ngaysinh);
                                        sv.setNgaySinh(date);
                                } catch (ParseException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }

                                System.out.println("Nhập que quan: ");
                                qqSV = scsv3.nextLine();
                                System.out.println("Nhập malop(trùng với mã lớp ở Table Lop): ");
                                malop = scsv3.nextLine();
                                sv.setMaSV(maSV);
                                sv.setTenSV(tenSV);
                                sv.setGioiTinh(gt);

                                sv.setQueQuan(qqSV);
                                sv.setMaLop(malop);
                                svBLL.insert(sv);
                                break;
                        case 0:
                                System.out.println("Đã Thoát!!!!!!!!");
                                System.exit(0);
                                break;

                        }
                        System.out.println("Bạn muốn tiếp tục không (Y/N): ");

                        Scanner yn = new Scanner(System.in);
                        String check = yn.nextLine();
                        if ("y".equals(check)) {
                                conti = false;
                        } else {
                                conti = true;
                        }

                } while (!conti);
        }

        private static void quanLyMonHoc() {
                /*do {
                        System.out.println("1. Hiển Thị ")
                        System.out.println("2. Thêm ");
                        System.out.println("3. Xóa ");
                        System.out.println("4. Sửa ");
                        System.out.println("0. Thoát");
                        System.out.println("=============");
                        do {
                                System.out.println("Ban chọn: ");
                                choose = sc.nextInt();
                        } while (choose < 0 || choose > 4);
                        MonHoc mh = new MonHoc();
                        List<MonHoc> listMH;
                        MonHocBLL monHocBLL= new MonHocBLL();
                        switch (choose) {
                        case 1:
                                System.out.println("==Hiển Thị Môn Học==");
                                listMH = monHocBLL.getList("select * from MonHoc");
                                monHocBLL.show(listMH);
                                break;
                        case 2:
                                System.out.println("==Thêm Môn Học==");
                                Scanner scmh1 = new Scanner(System.in);
                                System.out.println("Nhập mã Môn Học: ");
                                String mmh = scmh1.nextLine();
                                System.out.println("Nhập tên Môn Học: ");
                                String tmh = scmh1.nextLine();
                                System.out.println("Nhập Số Trình[0-7]: ");
                                int stmh = scmh1.nextInt();
                                
                                mh.setMaMH(mmh);
                                mh.setTenMH(tmh);
                                mh.setSoTrinh(stmh);
                                monHocBLL.insert(mh);
                                break;
                        case 3:
                                System.out.println("==Xóa Môn Học==");
                                Scanner scmh2 = new Scanner(System.in);
                                System.out.println("Nhập mã Môn Học cần Xóa: ");
                                mmh = scmh2.nextLine();
                                mh.setMaMH(mmh);
                                
                                monHocBLL.delete(mh);
                                break;
                        case 4:
                                System.out.println("==Thêm Môn Học==");
                                Scanner scmh3 = new Scanner(System.in);
                                System.out.println("Nhập mã Môn Học: ");
                                 mmh = scmh3.nextLine();
                                System.out.println("Nhập tên Môn Học: ");
                                 tmh = scmh3.nextLine();
                                System.out.println("Nhập Số Trình[0-7]: ");
                                 stmh = scmh3.nextInt();
                                
                                mh.setMaMH(mmh);
                                mh.setTenMH(tmh);
                                mh.setSoTrinh(stmh);
                                monHocBLL.update(mh);
                                break;
                        case 0:
                                System.out.println("==Đã Thoát==");
                                System.exit(0);
                                break;
                        }
                        System.out.println("Bạn muốn tiếp tục không (Y/N): ");

                        Scanner yn = new Scanner(System.in);
                        String check = yn.nextLine();
                        if ("y".equals(check)) {
                                conti = false;
                        } else {
                                conti = true;
                        }
                } while (!conti);*/

        }

        private static void quanLyLop() {

        }

        private static void quanLyKhoaHoc() {
                do {
                        System.out.println("1. Hiển Thị ");
                        System.out.println("2. Thêm ");
                        System.out.println("3. Xóa ");
                        System.out.println("4. Sửa ");
                        System.out.println("0. Thoát");
                        System.out.println("=============");
                        do {
                                System.out.println("Ban chọn: ");
                                choose = sc.nextInt();
                        } while (choose < 0 || choose > 4);
                        KhoaHocBLL khBLL = new KhoaHocBLL();
                        KhoaHoc hoc = new KhoaHoc();
                        List<KhoaHoc> listKH;

                        switch (choose) {
                        case 1:
                                System.out.println("==Danh Sách Khóa Khọc: ");
                                listKH = khBLL.getList("select * from KhoaHoc");
                                khBLL.show(listKH);
                                break;
                        case 2:
                                System.out.println("==Thêm danh sách: ");
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Nhập mã khóa học: ");
                                String maKH = sc1.nextLine();

                                System.out.println("Nhập tên khóa học: ");
                                String tenKH = sc1.nextLine();
                                hoc.setMaKhoaHoc(maKH);
                                hoc.setTenKhoaHoc(tenKH);
                                khBLL.insert(hoc);
                                break;
                        case 3:
                                System.out.println("==Xóa Danh Sách");
                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Nhập mã khóa học cần xóa: ");
                                maKH = sc3.nextLine();
                                hoc.setMaKhoaHoc(maKH);
                                khBLL.delete(hoc);
                                break;
                        case 4:

                                System.out.println("==Sửa Danh Sách:");
                                Scanner sc2 = new Scanner(System.in);
                                System.out.println("Nhập mã khóa học cần sửa: ");
                                maKH = sc2.nextLine();

                                System.out.println("Tên khóa học cần sửa: ");
                                tenKH = sc2.nextLine();
                                hoc.setMaKhoaHoc(maKH);
                                hoc.setTenKhoaHoc(tenKH);
                                khBLL.update(hoc);
                                break;
                        case 0:
                                System.out.println("Đã Thoát!!!!!!!!");
                                System.exit(0);
                                break;

                        default:
                                break;
                        }
                        System.out.println("Bạn muốn tiếp tục không (Y/N): ");

                        Scanner yn = new Scanner(System.in);
                        String check = yn.nextLine();
                        if ("y".equals(check)) {
                                conti = false;
                        } else {
                                conti = true;
                        }
                } while (!conti);

        }

        private static void quanLyKhoa() {

        }

        private static void quanLyHDT() {

        }

        private static void quanLyDiem() {
                do {
                        System.out.println("1. Hiển Thị ");
                        System.out.println("2. Thêm ");
                        System.out.println("3. Xóa ");
                        System.out.println("4. Sửa ");
                        System.out.println("0. Thoát");
                        System.out.println("=============");
                        Scanner sc = new Scanner(System.in);
                        choose = sc.nextInt();
                        DiemBLL diemBLL = new DiemBLL();
                        Diem diem = new Diem();
                        List<Diem> list;
                        do {

                                switch (choose) {
                                case 1:
                                        System.out.println("==Danh Sách Diem== ");
                                        list = diemBLL.getList("select * from Diem");
                                        diemBLL.show(list);
                                        break;

                                case 2:

                                        break;
                                case 3:

                                        break;
                                case 4:

                                        break;
                                case 0:

                                        break;

                                default:
                                        break;
                                }
                                System.out.println("Bạn muốn tiếp tục không (Y/N): ");

                                Scanner yn1 = new Scanner(System.in);
                                String check = yn1.nextLine();
                                if ("y".equals(check)) {
                                        conti = false;
                                } else {
                                        conti = true;
                                }
                        } while (choose < 0 || choose > 4);

                } while (!conti);
        }

}