package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connecttodata.ConnectToData;

import entity.MonHoc;

public class MonHocDAL implements InterfaceDAL<MonHoc>{
        Connection cnn = ConnectToData.connect();
        @Override
        public List<MonHoc> getList(String sql) {
                List<MonHoc> listKH = new ArrayList<>();
                try {
                        Statement stm = cnn.createStatement();
                        ResultSet rs = stm.executeQuery(sql);
                        while(rs.next()) {
                                MonHoc mhObj = new MonHoc();
                                mhObj.setMaMH(rs.getString("maMH"));
                                mhObj.setTenMH(rs.getString("tenMH"));
                                mhObj.setSoTrinh(rs.getInt("soTrinh"));
                                
                                
                                listKH.add(mhObj);
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
                return listKH;
        }

        @Override
        public void show(List<MonHoc> objects) {
                System.out.println(objects.toString());
        }

        @Override
        public boolean insert(MonHoc object) {
                String sql ="INSERT INTO MonHoc VALUES(?,?,?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaMH());
                        prepared.setString(2, object.getTenMH());
                        prepared.setInt(3, object.getSoTrinh());
                        
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
        public int delete(MonHoc object) {
                int result = 0;
                String sql ="delete from MonHoc where maMH = (?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaMH());
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
        public int update(MonHoc object) {
                int result = 0;
                String sql ="update MOnHoc set tenMH = ? , soTrinh = ? where maMH = ? ";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        
                        
                        prepared.setString(1, object.getTenMH());
                        prepared.setInt(2, object.getSoTrinh());
                        prepared.setString(3,  object.getMaMH());
                        
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
