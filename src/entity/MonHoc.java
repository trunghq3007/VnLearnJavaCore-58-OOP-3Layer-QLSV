package entity;

/**
 * @author HoangThap
 *des:
 */
public class MonHoc {
        //mã môn học
        private String maMH;
        //tên môn học
        private String tenMH;
        //số trình
        private int soTrinh;
        /**
         * 
         */
        public MonHoc() {
                super();
                // TODO Auto-generated constructor stub
        }
        /**
         * @param maMH
         * @param tenMH
         * @param soTrinh
         */
        public MonHoc(String maMH, String tenMH, int soTrinh) {
                super();
                this.maMH = maMH;
                this.tenMH = tenMH;
                this.soTrinh = soTrinh;
        }
        public String getMaMH() {
                return maMH;
        }
        public void setMaMH(String maMH) {
                this.maMH = maMH;
        }
        public String getTenMH() {
                return tenMH;
        }
        public void setTenMH(String tenMH) {
                this.tenMH = tenMH;
        }
        public int getSoTrinh() {
                return soTrinh;
        }
        public void setSoTrinh(int soTrinh) {
                this.soTrinh = soTrinh;
        }
        @Override
        public String toString() {
                return "MonHoc [maMH=" + maMH + ", tenMH=" + tenMH + ", soTrinh=" + soTrinh + "]";
        }
        
}
