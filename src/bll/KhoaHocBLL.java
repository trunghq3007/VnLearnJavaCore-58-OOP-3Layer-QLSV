/**
 * 
 */
package bll;

import java.util.List;

import dal.KhoaHocDAL;
import entity.KhoaHoc;

/**
 * @author HQTrung
 *
 */
public class KhoaHocBLL implements BusinessInterface<KhoaHoc> {
        /**
         * khoaHocDAL
         */
        private KhoaHocDAL khoaHocDAL;

        /**
         * 
         */
        public KhoaHocBLL() {
                khoaHocDAL = new KhoaHocDAL();
        }

        @Override
        public void insert(KhoaHoc object) {
                // insert to list
                boolean insertSuccess = false;
                insertSuccess = khoaHocDAL.insert(object);
                if (insertSuccess) {
                        System.out.println("insert thành công");
                } else {
                        System.out.println("insert thất bại");
                }

        }

        @Override
        public void delete(KhoaHoc khoaHoc) {
                khoaHocDAL.delete(khoaHoc);
        }

        @Override
        public void update(KhoaHoc khoaHoc) {
                khoaHocDAL.update(khoaHoc);

        }

        @Override
        public void show(List<KhoaHoc> objects) {
                khoaHocDAL.show(objects);
        }

        @Override
        public List<KhoaHoc> getList(String sql) {
                return khoaHocDAL.getList(sql);

        }

}
