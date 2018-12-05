package dal;

import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connecttodata.ConnectToData;

import entity.SinhVien;

public class SinhVienDAL implements InterfaceDAL<SinhVien>{
        Connection cnn = ConnectToData.connect();
        @Override
        public List<SinhVien> getList(String sql) {
                List<SinhVien> list = new ArrayList<>();
                try {
                        Statement stm = cnn.createStatement();
                        ResultSet rs = stm.executeQuery(sql);
                        while(rs.next()) {
                                SinhVien svObj = new SinhVien();
                                svObj.setMaSV(rs.getString("maSV"));
                                svObj.setTenSV(rs.getString("tenSV"));
                                svObj.setGioiTinh(rs.getString("gioiTinh"));
                                svObj.setNgaySinh(rs.getDate("ngaySinh"));
                                svObj.setQueQuan(rs.getString("queQuan"));
                                svObj.setMaLop(rs.getString("maLop"));
                                list.add(svObj);
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
                return list;
        }

        @Override
        public void show(List<SinhVien> objects) {
                System.out.println(objects.toString());
        }

        @Override
        public boolean insert(SinhVien object) {
                String sql ="INSERT INTO SinhVien VALUES(?,?,?,?,?,?)";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        prepared.setString(1, object.getMaSV());
                        prepared.setString(2, object.getTenSV());
                        prepared.setString(3, object.getGioiTinh());
                        prepared.setDate(4, (Date) object.getNgaySinh());
                        prepared.setString(5, object.getQueQuan());
                        prepared.setString(6, object.getMaLop());
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
        public int delete(SinhVien object) {
                int result = 0;
                String sql ="delete from SinhVien where maSV = (?)";
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
        public int update(SinhVien object) {
                int result = 0;
                String sql ="update SinhVien set tenSV = ? , gioiTinh = ?, ngaySinh = ?, queQuan = ? , maLop =? where maSV = ? ";
                try {
                        PreparedStatement prepared = cnn.prepareStatement(sql);
                        
                        
                        prepared.setString(6, object.getMaSV());
                        prepared.setString(1, object.getTenSV());
                        prepared.setString(2,  object.getGioiTinh());
                        prepared.setDate(3, (java.sql.Date) object.getNgaySinh());
                        prepared.setString(4,  object.getQueQuan());
                        prepared.setString(5,  object.getMaLop());
                        
                        
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
