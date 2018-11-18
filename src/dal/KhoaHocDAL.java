/**
 * 
 */
package dal;

import entity.KhoaHoc;

/**
 * @author HQTrung
 *
 */
public class KhoaHocDAL implements DataAccessInterface {

        private static int dem = 0;

        @Override
        public void show(Object[] objects) {
                String result = "";
                KhoaHoc[] khoaHocs = (KhoaHoc[]) objects;
                for (KhoaHoc khoaHoc : khoaHocs) {
                        if (khoaHoc != null) {
                                result += khoaHoc.toString();
                        }

                }
                System.out.println(result);
        }

        @Override
        public void insert(Object object) {
                KhoaHoc khoaHoc = (KhoaHoc) object;
                Data.khoaHocs[dem] = khoaHoc;
                dem++;

        }

        @Override
        public void delete(Object object) {

        }

        @Override
        public void update(Object object) {

        }

}
