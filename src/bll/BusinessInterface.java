/**
 * 
 */
package bll;

/**
 * @author HQTrung
 *
 */
public interface BusinessInterface {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: insert & show 
         * Version 1.0
         * @param object
         */
        void insert(Object object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: delete and show
         * Version 1.0
         * @param object
         */
        void delete(Object object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: update and show.
         * Version 1.0
         * @param object
         */
        void update(Object object);

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: ....
         * Version 1.0
         * @param objects
         */
        void show(Object[] objects);

}
