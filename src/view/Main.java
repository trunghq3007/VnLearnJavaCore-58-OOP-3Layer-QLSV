/**
 * 
 */
package view;

import java.util.List;

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
                List<Object> listKH;
                // khai báo và khởi tạo
                KhoaHocBLL khoaHocBLL = new KhoaHocBLL();
                // KhoaHoc khoaHoc = new KhoaHoc('1', "Java Core 58");
                // khoaHocBLL.insert(khoaHoc);
                listKH = khoaHocBLL.getList("select * from KhoaHoc");
                System.out.println(listKH.size() + "");
                khoaHocBLL.show(listKH);

        }

}
