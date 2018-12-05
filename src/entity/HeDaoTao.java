package entity;

public class HeDaoTao {
        //Hệ dào tạo
        private String maHeDT;
        //tên hệ đào tạo
        private String tenHeDT;
        @Override
        public String toString() {
                return "HeDaoDao [maHeDT=" + maHeDT + ", tenHeDT=" + tenHeDT + "]";
        }
        public String getmaHeDT() {
                return maHeDT;
        }
        public void setmaHeDT(String maHeDT) {
                this.maHeDT = maHeDT;
        }
        public String getTenHeDT() {
                return tenHeDT;
        }
        public void setTenHeDT(String tenHeDT) {
                this.tenHeDT = tenHeDT;
        }
        /**
         * @param maHeDT
         * @param tenHeDT
         */
        public HeDaoTao(String maHeDT, String tenHeDT) {
                super();
                this.maHeDT = maHeDT;
                this.tenHeDT = tenHeDT;
        }
        /**
         * 
         */
        public HeDaoTao() {
                super();
                // TODO Auto-generated constructor stub
        }
}
