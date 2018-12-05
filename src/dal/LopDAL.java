package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connecttodata.ConnectToData;

import entity.Lop;

public class LopDAL implements InterfaceDAL<Lop>{
        Connection cnn = ConnectToData.connect();
        @Override
        public List<Lop> getList(String sql) {
                List<Lop> listKH = new ArrayList<>();
                try {
                        Statement stm = cnn.createStatement();
                        ResultSet rs = stm.executeQuery(sql);
                        while(rs.next()) {
                                Lop lopObj = new Lop();
                                lopObj.setMaLop(rs.getString("maLop"));
                                lopObj.setTenLop(rs.getString("tenLop"));
                                lopObj.setMaKhoa(rs.getString("maKhoa"));
                                lopObj.setMaHDT(rs.getString("maHDT"));
                                lopObj.setMaKhoaHoc(rs.getString("maKhoaHoc"));
                                listKH.add(lopObj);
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
                return listKH;
        }

        @Override
        public void show(List<Lop> objects) {
                System.out.println(objects.toString());
        }

        @Override
        public boolean insert(Lop object) {
                String sql ="INSERT INTO Lop VALUES(?,?,?,?,?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaLop());
                        prepared.setString(2, object.getTenLop());
                        prepared.setString(3, object.getMaKhoa());
                        prepared.setString(4, object.getMaHDT());
                        prepared.setString(5, object.getMaKhoaHoc());
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
        public int delete(Lop object) {
                int result = 0;
                String sql ="delete from Lop where maLop = (?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaLop());
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
        public int update(Lop object) {
                int result = 0;
                String sql ="update Lop set tenLop = ? where maLop = ? ";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        
                        
                        prepared.setString(1, object.getTenLop());
                        prepared.setString(2, object.getMaLop());
                        
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
