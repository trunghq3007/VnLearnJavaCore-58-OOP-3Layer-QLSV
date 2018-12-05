package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connecttodata.ConnectToData;

import entity.Khoa;

public class KhoaDAL implements InterfaceDAL<Khoa>{
        Connection cnn = ConnectToData.connect();
        @Override
        public List<Khoa> getList(String sql) {
                List<Khoa> listKH = new ArrayList<>();
                try {
                        Statement stm = cnn.createStatement();
                        ResultSet rs = stm.executeQuery(sql);
                        while(rs.next()) {
                                Khoa khoaObj = new Khoa();
                                khoaObj.setMaKhoa(rs.getString("maKhoa"));
                                khoaObj.setTenKhoa(rs.getString("tenKhoa"));
                                khoaObj.setDiaChi(rs.getString("diaChi"));
                                khoaObj.setDienThoai(rs.getInt("dienThoai"));
                                
                                listKH.add(khoaObj);
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
                return listKH;
        }

        @Override
        public void show(List<Khoa> objects) {
                System.out.println(objects.toString());
        }

        @Override
        public boolean insert(Khoa object) {
                String sql ="INSERT INTO KHoa VALUES(?,?,?,?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaKhoa());
                        prepared.setString(2, object.getTenKhoa());
                        prepared.setString(3, object.getDiaChi());
                        prepared.setInt(4, object.getDienThoai());
                        
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
        public int delete(Khoa object) {
                int result = 0;
                String sql ="delete from Khoa where maKhoa = (?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaKhoa());
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
        public int update(Khoa object) {
                int result = 0;
                String sql ="update Diem set tenKhoa = ? , diaChi = ? , dienThoai = ? where maKhoa = ? ";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(4, object.getMaKhoa());
                        
                        prepared.setString(1, object.getTenKhoa());
                        prepared.setString(2, object.getDiaChi());
                        prepared.setInt(3, object.getDienThoai());
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
