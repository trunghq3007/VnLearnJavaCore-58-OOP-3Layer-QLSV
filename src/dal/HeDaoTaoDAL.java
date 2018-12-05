package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connecttodata.ConnectToData;

import entity.HeDaoTao;

public class HeDaoTaoDAL implements InterfaceDAL<HeDaoTao>{
        Connection cnn = ConnectToData.connect();
        @Override
        public List<HeDaoTao> getList(String sql) {
                List<HeDaoTao> listKH = new ArrayList<>();
                try {
                        Statement stm = cnn.createStatement();
                        ResultSet rs = stm.executeQuery(sql);
                        while(rs.next()) {
                                HeDaoTao hdtObj = new HeDaoTao();
                                hdtObj.setmaHeDT(rs.getString("maHeDT"));
                                hdtObj.setTenHeDT(rs.getString("tenHeDT"));
                                listKH.add(hdtObj);
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
                return listKH;
        }

        @Override
        public void show(List<HeDaoTao> objects) {
                System.out.println(objects.toString());
                
        }

        @Override
        public boolean insert(HeDaoTao object) {
                String sql ="INSERT INTO HeDT VALUES(?,?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getmaHeDT());
                        prepared.setString(2, object.getTenHeDT());
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
        public int delete(HeDaoTao object) {
                int result = 0;
                String sql ="delete from HeDT where maHeDT = (?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getmaHeDT());
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
        public int update(HeDaoTao object) {
                int result = 0;
                String sql ="update KhoaHoc set tenHeDT =? where maHeDT = ? ";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(2, object.getmaHeDT());
                        prepared.setString(1, object.getTenHeDT());
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
