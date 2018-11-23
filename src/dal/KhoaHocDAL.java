/**
 * 
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.DbConnection;
import entity.KhoaHoc;

/**
 * @author HQTrung
 *
 */
public class KhoaHocDAL implements DataAccessInterface {

        private static int dem = 0;

        @Override
        public void show(Object[] objects) {
                String result = "";
                KhoaHoc[] khoaHocs = (KhoaHoc[]) objects;
                for (KhoaHoc khoaHoc : khoaHocs) {
                        if (khoaHoc != null) {
                                result += khoaHoc.toString();
                        }

                }
                System.out.println(result);
        }

        @Override
        public void insert(Object object) {
                KhoaHoc khoaHoc = (KhoaHoc) object;
                Data.khoaHocs[dem] = khoaHoc;
                dem++;

        }

        @Override
        public void delete(Object object) {

        }

        @Override
        public void update(Object object) {

        }

        @Override
        public List<Object> getList(String sql) {
                // khai báo & // khởi tạo
                Connection connect = DbConnection.connect();
                List<Object> listKH = new ArrayList<Object>();

                try {
                        // Statement creation
                        Statement statement = connect.createStatement();
                        // for retrieve data
                        ResultSet resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                                KhoaHoc khoaHocObj = new KhoaHoc();
                                khoaHocObj.setMaKhoaHoc((char) resultSet.getInt("maKhoaHoc"));
                                khoaHocObj.setTenKhoaHoc(resultSet.getString("tenKhoaHoc"));
                                listKH.add(khoaHocObj);
                        }
                } catch (SQLException e) {

                        e.printStackTrace();
                }

                return listKH;
        }

}
