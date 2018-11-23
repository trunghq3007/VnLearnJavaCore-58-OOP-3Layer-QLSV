/**
 * 
 */
package bll;

import java.util.List;

import dal.KhoaHocDAL;

/**
 * @author HQTrung
 *
 */
public class KhoaHocBLL implements BusinessInterface {
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
        public void insert(Object object) {
                // insert to list
                khoaHocDAL.insert(object);
                // show list
               // khoaHocDAL.show(Data.khoaHocs);

                // ins
        }

        @Override
        public void delete(Object object) {

        }

        @Override
        public void update(Object object) {

        }

        @Override
        public void show(List<Object> objects) {
                khoaHocDAL.show(objects);
        }

        @Override
        public List<Object> getList(String sql) {
                return khoaHocDAL.getList(sql);

        }

}
