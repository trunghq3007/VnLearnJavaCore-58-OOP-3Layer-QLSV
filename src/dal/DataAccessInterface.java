/**
 * 
 */
package dal;

/**
 * @author HQTrung
 *
 */
public interface DataAccessInterface {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: hiển thị danh sách đối tượng
         * Version 1.0
         */
        void show(Object[] objects);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: .thêm đối tượng
         * Version 1.0
         * @param object
         */
        void insert(Object object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: Xóa đối tượng
         * Version 1.0
         * @param object
         */
        void delete(Object object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: Sửa đối tượng
         * Version 1.0
         * @param object
         */
        void update(Object object);

}
