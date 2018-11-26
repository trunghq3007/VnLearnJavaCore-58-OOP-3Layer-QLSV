/**
 * 
 */
package bll;

import java.util.List;

/**
 * @author HQTrung
 *
 */
public interface BusinessInterface<T> {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: insert & show 
         * Version 1.0
         * @param object
         */
        void insert(T object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: delete and show
         * Version 1.0
         * @param object
         */
        void delete(T object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: update and show.
         * Version 1.0
         * @param object
         */
        void update(T object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: ....
         * Version 1.0
         * @param objects
         */
        void show(List<T> objects);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 23, 2018
         * Modifier: HQTrung
         * Modified date: Nov 23, 2018
         * Description: ....
         * Version 1.0
         * @param sql
         * @return
         */
        public List<T> getList(String sql);

}
