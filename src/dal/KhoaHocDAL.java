/**
 * 
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class KhoaHocDAL implements DataAccessInterface<KhoaHoc> {

        @Override
        public List<KhoaHoc> getList(String sql) {
                // khai báo & // khởi tạo
                Connection connect = DbConnection.connect();
                List<KhoaHoc> listKH = new ArrayList<KhoaHoc>();

                try {
                        // Statement creation
                        Statement statement = connect.createStatement();
                        // for retrieve data
                        ResultSet resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                                KhoaHoc khoaHocObj = new KhoaHoc();
                                khoaHocObj.setMaKhoaHoc(resultSet.getString("maKhoaHoc"));
                                khoaHocObj.setTenKhoaHoc(resultSet.getString("tenKhoaHoc"));
                                listKH.add(khoaHocObj);
                        }
                } catch (SQLException e) {

                        e.printStackTrace();
                }

                return listKH;
        }

        @Override
        public void show(List<KhoaHoc> objects) {
                System.out.println(objects.toString());
        }

        @Override
        public boolean insert(KhoaHoc khoaHoc) {
                Connection connect = DbConnection.connect();
                String sql = "insert into KhoaHoc Values(?,?)";

                try {
                        // connect.setAutoCommit(true);
                        PreparedStatement prepare = connect.prepareStatement(sql);

                        prepare.setString(1, khoaHoc.getMaKhoaHoc());
                        prepare.setString(2, khoaHoc.getTenKhoaHoc());
                        prepare.executeUpdate();
                        // connect.setAutoCommit(false);
                } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                } finally {
                        try {
                                connect.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                return true;

        }

        @Override
        public int delete(KhoaHoc khoaHoc) {
                int result = 0;
                Connection connect = DbConnection.connect();
                String sql = "delete from KhoaHoc where maKhoaHoc = (?)";

                try {
                        // connect.setAutoCommit(true);
                        PreparedStatement prepare = connect.prepareStatement(sql);

                        prepare.setString(1, khoaHoc.getMaKhoaHoc());

                        result = prepare.executeUpdate();
                        // connect.setAutoCommit(false);
                } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                } finally {
                        try {
                                connect.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                return result;

        }

        @Override
        public int update(KhoaHoc khoaHoc) {
                int result = 0;
                Connection connect = DbConnection.connect();
                String sql = "Update KhoaHoc set tenKhoaHoc = ? where maKhoaHoc = ?";

                try {
                        // connect.setAutoCommit(true);
                        PreparedStatement prepare = connect.prepareStatement(sql);

                        prepare.setString(2, khoaHoc.getMaKhoaHoc());
                        prepare.setString(1, khoaHoc.getTenKhoaHoc());
                        result = prepare.executeUpdate();
                        // connect.setAutoCommit(false);
                } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                } finally {
                        try {
                                connect.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }

                return result;

        }

}
