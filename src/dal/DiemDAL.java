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
public class DiemDAL implements DataAccessInterface {
       
       private static int dem = 0;
        @Override
        public void show(Object[] objects) {
                Diem[] diems = (Diem[]) objects;
                for (Diem diem : diems) {
                        diem.toString();
                }
        }

        @Override
        public void insert(Object object) {
                while (dem < 100) {
                        Diem diem = (Diem) object;
                        Data.diems[dem] = diem;
                        dem++;
                }

        }

        @Override
        public void delete(Object object) {

        }

        @Override
        public void update(Object object) {

        }

        /* (non-Javadoc)
         * @see dal.DataAccessInterface#getList()
         */
        @Override
        public List<Object> getList(String sql) {
                
                return null;
        }

}
