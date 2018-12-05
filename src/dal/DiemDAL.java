package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connecttodata.ConnectToData;
import entity.Diem;


public class DiemDAL implements InterfaceDAL<Diem>{
        Connection cnn = ConnectToData.connect();
        @Override
        public List<Diem> getList(String sql) {
                List<Diem> listKH = new ArrayList<>();
                try {
                        Statement stm = cnn.createStatement();
                        ResultSet rs = stm.executeQuery(sql);
                        while(rs.next()) {
                                Diem diemObj = new Diem();
                                diemObj.setMaSV(rs.getString("maSV"));
                                diemObj.setmaMH(rs.getString("maMH"));
                                diemObj.sethocKy(rs.getInt("hocKy"));
                                diemObj.setDiemLan1(rs.getInt("diemLan1"));
                                diemObj.setDiemlan2(rs.getInt("diemLan2"));
                                listKH.add(diemObj);
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
                return listKH;
        }

        @Override
        public void show(List<Diem> objects) {
                System.out.println(objects.toString());
                
        }

        @Override
        public boolean insert(Diem object) {
                String sql ="INSERT INTO Diem VALUES(?,?,?,?,?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaSV());
                        prepared.setString(2, object.getmaMH());
                        prepared.setInt(3, object.gethocKy());
                        prepared.setInt(4, object.getDiemLan1());
                        prepared.setInt(5, object.getDiemlan2());
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
        public int delete(Diem object) {
                int result = 0;
                String sql ="delete from Diem where maSV = (?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaSV());
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
        public int update(Diem object) {
                int result = 0;
                String sql ="update Diem set HocKy = ? , DiemLan1 = ? , DiemLan2 = ? where maSV = ? ";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(4, object.getMaSV());
                        
                        prepared.setInt(1, object.gethocKy());
                        prepared.setInt(2, object.getDiemLan1());
                        prepared.setInt(3, object.getDiemlan2());
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
