package bll;

import java.util.List;

import dal.MonHocDAL;
import entity.MonHoc;

public class MonHocBLL implements InterfaceBLL<MonHoc>{
        private MonHocDAL monHocDAL;
        public MonHocBLL() {
                monHocDAL = new MonHocDAL();
        }
        @Override
        public List<MonHoc> getList(String sql) {
                
                return monHocDAL.getList(sql);
        }

        @Override
        public void insert(MonHoc object) {
                monHocDAL.insert(object);
        }

        @Override
        public void delete(MonHoc object) {
                monHocDAL.delete(object);
        }

        @Override
        public void update(MonHoc object) {
                monHocDAL.update(object);
        }

        @Override
        public void show(List<MonHoc> object) {
                monHocDAL.show(object);
        }

}
