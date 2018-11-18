/**
 * 
 */
package dal;

import entity.Diem;
import entity.HeDT;
import entity.Khoa;
import entity.KhoaHoc;
import entity.Lop;
import entity.MonHoc;
import entity.SinhVien;

/**
 * @author HQTrung
 * des mockup data
 */
public class Data {
        public static SinhVien[] sinhViens;
        public static MonHoc[] monHocs;
        public static KhoaHoc[] khoaHocs;
        public static Khoa[] khoas;
        public static Diem[] diems;
        public static Lop[] lops;
        public static HeDT[] dts;

        public static void mockData() {
                // danh sách sinh viên
                sinhViens = new SinhVien[100];
                // danh danh sách môn học
                monHocs = new MonHoc[100];
                // danh sách khóa học
                khoaHocs = new KhoaHoc[100];
                // danh sách khoa
                khoas = new Khoa[100];
                // danh sách điểm
                diems = new Diem[100];
                // danh sách lớp
                lops = new Lop[100];
                // danh sách hệ đào tạo
                dts = new HeDT[100];
        }

}
