package entity;

public class Lop {
        //mã lớp
        private String maLop;
        //tên lớp
        private String tenLop;
        //mã khoa
        private String maKhoa;
        //mã hệ đào tạo
        private String maHDT;
        //mã khóa học
        private String maKhoaHoc;
        @Override
        public String toString() {
                return "Lop [maLop=" + maLop + ", tenLop=" + tenLop + ", maKhoa=" + maKhoa + ", maHDT=" + maHDT
                                + ", maKhoaHoc=" + maKhoaHoc + "]";
        }
        public String getMaLop() {
                return maLop;
        }
        public void setMaLop(String maLop) {
                this.maLop = maLop;
        }
        public String getTenLop() {
                return tenLop;
        }
        public void setTenLop(String tenLop) {
                this.tenLop = tenLop;
        }
        public String getMaKhoa() {
                return maKhoa;
        }
        public void setMaKhoa(String maKhoa) {
                this.maKhoa = maKhoa;
        }
        public String getMaHDT() {
                return maHDT;
        }
        public void setMaHDT(String maHDT) {
                this.maHDT = maHDT;
        }
        public String getMaKhoaHoc() {
                return maKhoaHoc;
        }
        public void setMaKhoaHoc(String maKhoaHoc) {
                this.maKhoaHoc = maKhoaHoc;
        }
        /**
         * @param maLop
         * @param tenLop
         * @param maKhoa
         * @param maHDT
         * @param maKhoaHoc
         */
        public Lop(String maLop, String tenLop, String maKhoa, String maHDT, String maKhoaHoc) {
                super();
                this.maLop = maLop;
                this.tenLop = tenLop;
                this.maKhoa = maKhoa;
                this.maHDT = maHDT;
                this.maKhoaHoc = maKhoaHoc;
        }
        /**
         * 
         */
        public Lop() {
                super();
                // TODO Auto-generated constructor stub
        }
}
