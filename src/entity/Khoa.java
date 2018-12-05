package entity;

public class Khoa {
        //mã khoa
        private String maKhoa;
        //tên khoa
        private String tenKhoa;
        //địa chỉ
        private String diaChi;
        //điện thoại
        private int dienThoai;
        /**
         * 
         */
        public Khoa() {
                super();
                // TODO Auto-generated constructor stub
        }
        /**
         * @param maKhoa
         * @param tenKhoa
         * @param diaChi
         * @param dienThoai
         */
        public Khoa(String maKhoa, String tenKhoa, String diaChi, int dienThoai) {
                super();
                this.maKhoa = maKhoa;
                this.tenKhoa = tenKhoa;
                this.diaChi = diaChi;
                this.dienThoai = dienThoai;
        }
        public String getMaKhoa() {
                return maKhoa;
        }
        public void setMaKhoa(String maKhoa) {
                this.maKhoa = maKhoa;
        }
        public String getTenKhoa() {
                return tenKhoa;
        }
        public void setTenKhoa(String tenKhoa) {
                this.tenKhoa = tenKhoa;
        }
        public String getDiaChi() {
                return diaChi;
        }
        public void setDiaChi(String diaChi) {
                this.diaChi = diaChi;
        }
        public int getDienThoai() {
                return dienThoai;
        }
        public void setDienThoai(int dienThoai) {
                this.dienThoai = dienThoai;
        }
        @Override
        public String toString() {
                return "Khoa [maKhoa=" + maKhoa + ", tenKhoa=" + tenKhoa + ", diaChi=" + diaChi + ", dienThoai="
                                + dienThoai + "]";
        }
}
