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

                List<KhoaHoc> listKH;
                // khai báo và khởi tạo
                KhoaHocBLL khoaHocBLL = new KhoaHocBLL();

                listKH = khoaHocBLL.getList("select * from KhoaHoc");
                System.out.println(listKH.size() + "");
                // khoaHocBLL.show(listKH);

                // KhoaHoc khoaHoc = new KhoaHoc("vnl-j60", "Java Core 60");
                // khoaHocBLL.insert(khoaHoc);
                khoaHocBLL.show(listKH);
        }

}
