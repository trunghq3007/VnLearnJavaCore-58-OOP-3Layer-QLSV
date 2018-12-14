package entity;

import java.util.Date;

public class SinhVien {
        //mã sinh viên
        private String maSV;
        //tên sinh viên
        private String tenSV;
        //giới tính
        private String gioiTinh;
        //ngày sinh
        private Date ngaySinh;
        //mã lớp
        private String maLop;
        //Quê quán
        private  String queQuan;
        @Override
        public String toString() {
                return "SinhVien [maSV=" + maSV + ", tenSV=" + tenSV + ", gioiTinh=" + gioiTinh + ", ngaySinh="
                                + ngaySinh + ", maLop=" + maLop + ", queQuan=" + queQuan + "]";
        }
        public String getMaSV() {
                return maSV;
        }
        public void setMaSV(String maSV) {
                this.maSV = maSV;
        }
        public String getTenSV() {
                return tenSV;
        }
        public void setTenSV(String tenSV) {
                this.tenSV = tenSV;
        }
        public String getGioiTinh() {
                return gioiTinh;
        }
        public void setGioiTinh(String gioiTinh) {
                this.gioiTinh = gioiTinh;
        }
        public Date getNgaySinh() {
                return ngaySinh;
        }
        public void setNgaySinh(Date ngaySinh) {
                this.ngaySinh = ngaySinh;
        }
        public String getMaLop() {
                return maLop;
        }
        public void setMaLop(String maLop) {
                this.maLop = maLop;
        }
        public String getQueQuan() {
                return queQuan;
        }
        public void setQueQuan(String queQuan) {
                this.queQuan = queQuan;
        }
        /**
         * @param maSV
         * @param tenSV
         * @param gioiTinh
         * @param ngaySinh
         * @param maLop
         * @param queQuan
         */
        public SinhVien(String maSV, String tenSV, String gioiTinh, Date ngaySinh, String maLop, String queQuan) {
                super();
                this.maSV = maSV;
                this.tenSV = tenSV;
                this.gioiTinh = gioiTinh;
                this.ngaySinh = ngaySinh;
                this.maLop = maLop;
                this.queQuan = queQuan;
        }
        public SinhVien(String maSV) {
                super();
                this.maSV = maSV;
                
        }
        /**
         * 
         */
        public SinhVien() {
                super();
                // TODO Auto-generated constructor stub
        }
}
