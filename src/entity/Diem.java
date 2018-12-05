package entity;

public class Diem {
        //mã sinh viên
        private String maSV;
        //môn học
        private String maMH;
        //học kì
        private int hocKy;
        //điểm lần 1
        private int diemLan1;
        //điểm lần 2
        private int diemlan2;
        /**
         * 
         */
        public Diem() {
                super();
                // TODO Auto-generated constructor stub
        }
        /**
         * @param maSV
         * @param maMH
         * @param hocKy
         * @param diemLan1
         * @param diemlan2
         */
        public Diem(String maSV, String maMH, int hocKy, int diemLan1, int diemlan2) {
                super();
                this.maSV = maSV;
                this.maMH = maMH;
                this.hocKy = hocKy;
                this.diemLan1 = diemLan1;
                this.diemlan2 = diemlan2;
        }
        public String getMaSV() {
                return maSV;
        }
        public void setMaSV(String maSV) {
                this.maSV = maSV;
        }
        public String getmaMH() {
                return maMH;
        }
        public void setmaMH(String maMH) {
                this.maMH = maMH;
        }
        public int gethocKy() {
                return hocKy;
        }
        public void sethocKy(int hocKy) {
                this.hocKy = hocKy;
        }
        public int getDiemLan1() {
                return diemLan1;
        }
        public void setDiemLan1(int diemLan1) {
                this.diemLan1 = diemLan1;
        }
        public int getDiemlan2() {
                return diemlan2;
        }
        public void setDiemlan2(int diemlan2) {
                this.diemlan2 = diemlan2;
        }
        @Override
        public String toString() {
                return "Diem [maSV=" + maSV + ", maMH=" + maMH + ", hocKy=" + hocKy + ", diemLan1=" + diemLan1
                                + ", diemlan2=" + diemlan2 + "]";
        }
        
}
