package bll;

import java.util.List;

import dal.HeDaoTaoDAL;
import entity.HeDaoTao;

public class HeDaoTaoBLL implements InterfaceBLL<HeDaoTao>{
        private HeDaoTaoDAL hdtBLL;
        public HeDaoTaoBLL() {
                hdtBLL = new HeDaoTaoDAL();
        }
        @Override
        public List<HeDaoTao> getList(String sql) {
                
                return hdtBLL.getList(sql);
        }

        @Override
        public void insert(HeDaoTao ojbect) {
                hdtBLL.insert(ojbect);
        }

        @Override
        public void delete(HeDaoTao object) {
                hdtBLL.delete(object);
        }

        @Override
        public void update(HeDaoTao object) {
                hdtBLL.update(object);
        }

        @Override
        public void show(List<HeDaoTao> object) {
                hdtBLL.show(object);
        }

}
