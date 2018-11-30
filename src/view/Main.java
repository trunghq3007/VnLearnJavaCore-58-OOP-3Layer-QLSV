/**
 * 
 */
package view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import bll.KhoaHocBLL;
import dal.Data;
import entity.Diem;
import entity.KhoaHoc;

/**
 * @author HQTrung
 *
 */
public class Main {

        /**
         * 
         */
        private static final String BẠN_MUỐN_TIẾP_TỤC_KHÔNG_Y_N = "Bạn muốn tiếp tục không?(y/n): ";

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: ....
         * Version 1.0
         * @param args
         */
        public static void main(String[] args) {

                /*
                 * List<KhoaHoc> listKH; // khai báo và khởi tạo KhoaHocBLL khoaHocBLL = new
                 * KhoaHocBLL();
                 * 
                 * // System.out.println(listKH.size() + ""); // khoaHocBLL.show(listKH);
                 * 
                 * KhoaHoc khoaHoc = new KhoaHoc("vnl-j58", "Java Core 600"); //
                 * khoaHocBLL.insert(khoaHoc); // khoaHocBLL.delete(khoaHoc);
                 * khoaHocBLL.update(khoaHoc); listKH =
                 * khoaHocBLL.getList("select * from KhoaHoc");
                 * 
                 * khoaHocBLL.show(listKH);
                 */

                System.out.println("HỆ THỐNG QUẢN LÍ SINH VIÊN");
                System.out.println("==========================");
                // hiện thị menu
                showMenu();

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 30, 2018
         * Modifier: HQTrung
         * Modified date: Nov 30, 2018
         * Description: ....
         * Version 1.0
         * @throws IOException 
         */
        private static void showMenu() {
                int chooseFunction = 0;
                Scanner scanner = new Scanner(System.in);
                do {

                        System.out.println("Menu:");
                        System.out.println("1. Quản Lí Điểm");
                        System.out.println("2. Quản Lí Hệ Đào Tạo");
                        System.out.println("3. Quản Lí Khoa");
                        System.out.println("4. Quản Lí Khóa Học");
                        System.out.println("5. Quản Lí Lớp");
                        System.out.println("6. Quản Lí Môn Học");
                        System.out.println("7. Quản Lí Sinh Viên");
                        System.out.println("8. Thoát");

                        do {
                                System.out.println("Chọn chức năng: [1,8]");
                                chooseFunction = scanner.nextInt();
                        } while (chooseFunction < 1 || chooseFunction > 8);

                        // xử lí từng trường hợp
                        switch (chooseFunction) {
                                // 1. Quản Lí Điểm
                                case 1:
                                        quanLiDiem();
                                        break;
                                // 2. Quản Lí Hệ Đào Tạo
                                case 2:
                                        quanLiKhoa();
                                        break;
                                // 3. Quản Lí Khoa
                                case 3:
                                        quanLiKhoa();
                                        break;
                                // 4. Quản Lí Khóa Học
                                case 4:
                                        quanLiKhoaHoc();
                                        break;
                                // 5. Quản Lí Lớp
                                case 5:
                                        quanLiMonHoc();
                                        break;
                                // 6. Quản Lí Môn Học
                                case 6:
                                        quanLiMonHoc();
                                        break;
                                // 7. Quản Lí Sinh Viên
                                case 7:
                                        quanLiSinhVien();
                                        break;
                                // 8. Thoát
                                case 8:
                                        System.exit(0);
                                        break;

                                default:
                                        break;
                        }

                } while (chooseFunction != 8);

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 30, 2018
         * Modifier: HQTrung
         * Modified date: Nov 30, 2018
         * Description: ....
         * Version 1.0
         */
        private static void quanLiSinhVien() {
                // TODO Auto-generated method stub

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 30, 2018
         * Modifier: HQTrung
         * Modified date: Nov 30, 2018
         * Description: ....
         * Version 1.0
         */
        private static void quanLiMonHoc() {
                // TODO Auto-generated method stub

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 30, 2018
         * Modifier: HQTrung
         * Modified date: Nov 30, 2018
         * Description: ....
         * Version 1.0
         */
        private static void quanLiKhoaHoc() {
                showMenuFunction();

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 30, 2018
         * Modifier: HQTrung
         * Modified date: Nov 30, 2018
         * Description: ....
         * Version 1.0
         */
        private static void showMenuFunction() {
                int chooseFunction = 0;
                boolean continueAction = false;
                Scanner scanner = new Scanner(System.in);
                do {
                        System.out.println("1. Hiển thị");
                        System.out.println("2. Thêm");
                        System.out.println("3. Xóa");
                        System.out.println("4. Sửa");
                        System.out.println("5. Thoát");
                        do {
                                System.out.println("Nhập chức năng: ");
                                chooseFunction = scanner.nextInt();
                        } while (chooseFunction < 1 || chooseFunction > 5);

                        KhoaHocBLL khoaHocBLL = new KhoaHocBLL();
                        ;
                        switch (chooseFunction) {

                                // hiển thị
                                case 1:
                                        System.out.println("Danh sách Khóa Học");
                                        System.out.println("==================");
                                        List<KhoaHoc> listKH;
                                        khoaHocBLL = new KhoaHocBLL();
                                        listKH = khoaHocBLL.getList("Select * from KhoaHoc");
                                        khoaHocBLL.show(listKH);
                                        break;
                                // thêm
                                case 2:
                                        KhoaHoc khoaHoc = new KhoaHoc();
                                        String tenKhoaHoc;
                                        String maKhoaHoc;
                                        Scanner scannerKhoaHoc = new Scanner(System.in);
                                        System.out.println("Mã khóa học: ");
                                        maKhoaHoc = scannerKhoaHoc.nextLine();
                                        System.out.println("Tên khóa học: ");
                                        tenKhoaHoc = scannerKhoaHoc.nextLine();
                                        khoaHoc.setMaKhoaHoc(maKhoaHoc);
                                        khoaHoc.setTenKhoaHoc(tenKhoaHoc);
                                        khoaHocBLL.insert(khoaHoc);

                                        break;
                                // xóa
                                case 3:

                                        break;
                                // sửa
                                case 4:

                                        break;

                                default:
                                        break;
                        }

                        System.out.println(BẠN_MUỐN_TIẾP_TỤC_KHÔNG_Y_N);
                        Scanner scannerYN = new Scanner(System.in);
                        String checkYesNo = scannerYN.nextLine();
                        if ("y".equals(checkYesNo)) {
                                continueAction = false;
                        } else {
                                continueAction = true;
                        }

                } while (!continueAction);

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 30, 2018
         * Modifier: HQTrung
         * Modified date: Nov 30, 2018
         * Description: ....
         * Version 1.0
         */
        private static void quanLiKhoa() {
        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 30, 2018
         * Modifier: HQTrung
         * Modified date: Nov 30, 2018
         * Description: ....
         * Version 1.0
         */
        private static void quanLiDiem() {

        }

}
