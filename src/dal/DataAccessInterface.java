/**
 * 
 */
package dal;

import java.util.List;

/**
 * @author HQTrung
 *
 */
public interface DataAccessInterface<T> {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: hiển thị danh sách đối tượng
         * Version 1.0
         */
        void show(List<T> objects);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: .thêm đối tượng
         * Version 1.0
         * @param object
         */
        boolean insert(T object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: Xóa đối tượng
         * Version 1.0
         * @param object
         */
        int delete(T object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: Sửa đối tượng
         * Version 1.0
         * @param object
         */
        int update(T object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 23, 2018
         * Modifier: HQTrung
         * Modified date: Nov 23, 2018
         * Description: get list of Object
         * Version 1.0
         * @return
         */
        public List<T> getList(String sql);

}
