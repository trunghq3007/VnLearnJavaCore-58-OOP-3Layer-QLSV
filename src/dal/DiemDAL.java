/**
 * 
 */
package dal;

import java.util.List;

import entity.Diem;

/**
 * @author HQTrung
 *
 */
public class DiemDAL implements DataAccessInterface<Diem> {

        @Override
        public void show(List<Diem> objects) {

        }

        @Override
        public boolean insert(Diem object) {
                return true;
        }

        @Override
        public int delete(Diem object) {
                return 0;

        }

        @Override
        public int update(Diem object) {
                return 0;

        }

        @Override
        public List<Diem> getList(String sql) {
                return null;
        }

}
