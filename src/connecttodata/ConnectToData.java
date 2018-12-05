package connecttodata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToData {
        static Connection connection;
        public static Connection connect() {
                try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                } catch (ClassNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                try {
                        connection = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=QLSV;user=sa;password=hoangthap1");
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                return connection;
                
        }
}
