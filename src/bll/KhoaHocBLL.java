package bll;

import java.util.List;
import java.util.Objects;

import dal.KhoaHocDAL;
import entity.KhoaHoc;

public class KhoaHocBLL implements InterfaceBLL<KhoaHoc>{
         private KhoaHocDAL khDal;
         public KhoaHocBLL() {
                khDal = new KhoaHocDAL();
        }
        @Override
        public List<KhoaHoc> getList(String sql) {
                 return khDal.getList(sql);
        }

        @Override
        public void insert(KhoaHoc ojbect) {
                khDal.insert(ojbect);
                
        }

        @Override
        public void delete(KhoaHoc object) {
                khDal.delete(object);
        }

        @Override
        public void update(KhoaHoc ojbect) {
                khDal.update(ojbect);
        }

        @Override
        public void show(List<KhoaHoc> object) {
                khDal.show(object);
                
        }

       
       
}
