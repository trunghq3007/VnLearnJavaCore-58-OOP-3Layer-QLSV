package bll;

import java.util.List;

import dal.SinhVienDAL;
import entity.SinhVien;

public class SinhVienBLL implements InterfaceBLL<SinhVien>{
        private SinhVienDAL sinhVienDAL;
        public SinhVienBLL() {
                sinhVienDAL = new SinhVienDAL();
        }
        @Override
        public List<SinhVien> getList(String sql) {
                return sinhVienDAL.getList(sql);

        }

        @Override
        public void insert(SinhVien object) {
                sinhVienDAL.insert(object);
        }

        @Override
        public void delete(SinhVien object) {
                sinhVienDAL.delete(object);
        }

        @Override
        public void update(SinhVien object) {
                sinhVienDAL.update(object);
        }

        @Override
        public void show(List<SinhVien> object) {
                sinhVienDAL.show(object);
        }

}
