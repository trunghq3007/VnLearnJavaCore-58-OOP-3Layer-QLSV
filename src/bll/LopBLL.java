package bll;

import java.util.List;

import dal.LopDAL;
import entity.Lop;

public class LopBLL implements InterfaceBLL<Lop>{
        private LopDAL lopDAL;
        public void LopDAL() {
                lopDAL = new LopDAL();
        }
        @Override
        public List<Lop> getList(String sql) {
                
                return lopDAL.getList(sql);
        }

        @Override
        public void insert(Lop object) {
                lopDAL.insert(object);
        }

        @Override
        public void delete(Lop object) {
                lopDAL.delete(object);
        }

        @Override
        public void update(Lop object) {
                lopDAL.update(object);
        }

        @Override
        public void show(List<Lop> object) {
                lopDAL.show(object);
        }

}
