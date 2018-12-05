package bll;

import java.util.List;

import dal.DiemDAL;
import entity.Diem;

public class DiemBLL implements InterfaceBLL<Diem> {
        
        private DiemDAL diemDAL;
        public DiemBLL() {
                diemDAL = new  DiemDAL();
        }
        @Override
        public List<Diem> getList(String sql) {
                
                return diemDAL.getList(sql);
        }

        @Override
        public void insert(Diem object) {
                diemDAL.insert(object);
                
        }

        @Override
        public void delete(Diem object) {
                diemDAL.delete(object);
                
        }

        @Override
        public void update(Diem object) {
                diemDAL.update(object);
                
        }

        @Override
        public void show(List<Diem> object) {
                diemDAL.show(object);
        }

}
