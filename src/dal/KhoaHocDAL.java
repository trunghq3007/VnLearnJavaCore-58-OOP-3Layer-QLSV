package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connecttodata.ConnectToData;
import entity.KhoaHoc;

public class KhoaHocDAL implements InterfaceDAL<KhoaHoc>{
        Connection cnn = ConnectToData.connect();
        @Override
        public List<KhoaHoc> getList(String sql) {
                
                List<KhoaHoc> listKH = new ArrayList<>();
                try {
                        Statement stm = cnn.createStatement();
                        ResultSet rs = stm.executeQuery(sql);
                        while(rs.next()) {
                                KhoaHoc khObj = new KhoaHoc();
                                khObj.setMaKhoaHoc(rs.getString("maKhoaHoc"));
                                khObj.setTenKhoaHoc(rs.getString("tenKhoaHoc"));
                                listKH.add(khObj);
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
                return listKH;
        }

        @Override
        public void show(List<KhoaHoc> objects) {
                System.out.println(objects.toString());
        }

        @Override
        public boolean insert(KhoaHoc object) {
                String sql ="INSERT INTO KhoaHoc VALUES(?,?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaKhoaHoc());
                        prepared.setString(2, object.getTenKhoaHoc());
                        prepared.executeUpdate();
                        
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        return false;
                }finally {
                        try {
                                cnn.close();
                        } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }
                return true;
        }

        @Override
        public int delete(KhoaHoc object) {
                int result = 0;
                String sql ="delete from KhoaHoc where maKhoaHoc = (?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaKhoaHoc());
                        result= prepared.executeUpdate();
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        return 0;
                }finally {
                        try {
                                cnn.close();
                        } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }
                
                return result;
                
        }

        @Override
        public int update(KhoaHoc object) {
                int result = 0;
                String sql ="update KhoaHoc set tenKhoaHoc =? where maKhoaHoc = ? ";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(2, object.getMaKhoaHoc());
                        prepared.setString(1, object.getTenKhoaHoc());
                        result= prepared.executeUpdate();
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        return 0;
                }finally {
                        try {
                                cnn.close();
                        } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }
                
                return result;
        }

        

}
