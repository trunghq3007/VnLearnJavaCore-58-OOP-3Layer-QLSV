/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class KhoaHoc {
        // mã khóa học
        private char maKhoaHoc;
        // tên khóa học
        private String tenKhoaHoc;

        /**
         * @param maKhoaHoc
         * @param tenKhoaHoc
         */
        public KhoaHoc(char maKhoaHoc, String tenKhoaHoc) {
                this.maKhoaHoc = maKhoaHoc;
                this.tenKhoaHoc = tenKhoaHoc;
        }

        /**
         * 
         */
        public KhoaHoc() {
        }

        @Override
        public String toString() {
                return "KhoaHoc [maKhoaHoc=" + maKhoaHoc + ", tenKhoaHoc=" + tenKhoaHoc + "]";
        }

        public char getMaKhoaHoc() {
                return maKhoaHoc;
        }

        public void setMaKhoaHoc(char maKhoaHoc) {
                this.maKhoaHoc = maKhoaHoc;
        }

        public String getTenKhoaHoc() {
                return tenKhoaHoc;
        }

        public void setTenKhoaHoc(String tenKhoaHoc) {
                this.tenKhoaHoc = tenKhoaHoc;
        }

}
