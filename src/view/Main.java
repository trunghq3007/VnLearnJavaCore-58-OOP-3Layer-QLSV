/**
 * 
 */
package view;

import bll.KhoaHocBLL;
import dal.Data;
import entity.Diem;
import entity.KhoaHoc;

/**
 * @author HQTrung
 *
 */
public class Main {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 18, 2018
         * Modifier: HQTrung
         * Modified date: Nov 18, 2018
         * Description: ....
         * Version 1.0
         * @param args
         */
        public static void main(String[] args) {
                // mockupda data
                Data.mockData();
                // khai báo và khởi tạo
                KhoaHocBLL khoaHocBLL = new KhoaHocBLL();
                KhoaHoc khoaHoc = new KhoaHoc('1', "Java Core 58");
                khoaHocBLL.insert(khoaHoc);
               
        }

}
