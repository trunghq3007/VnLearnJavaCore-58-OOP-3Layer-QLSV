package bll;

import java.util.List;

import dal.KhoaDAL;
import entity.Khoa;

public class KhoaBLL implements InterfaceBLL<Khoa>{
        private KhoaDAL khoaDAL;
        public void KhoaDAL() {
                khoaDAL = new KhoaDAL();
        }
        @Override
        public List<Khoa> getList(String sql) {
               
                return khoaDAL.getList(sql);
        }

        @Override
        public void insert(Khoa object) {
                khoaDAL.insert(object);
        }

        @Override
        public void delete(Khoa object) {
                khoaDAL.delete(object);
               
        }

        @Override
        public void update(Khoa object) {
                khoaDAL.update(object);
        }

        @Override
        public void show(List<Khoa> object) {
                khoaDAL.show(object);
        }

}
