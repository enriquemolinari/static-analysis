package jdbc;

import java.sql.*;

public class JdbcExample3 {
    private String user = "userq2";
    private String pwd = "pwd1";
    private String dbName = "queue1";
    private String dbServer = "localhost";
    private String dbPort = "3306";

    public void bla() {
        var conn = connection();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from bla");
            ResultSet rs = stmt.executeQuery();
            System.out.println(rs.getString(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private Connection connection() {
        String url = "jdbc:mysql://" + dbServer + ":" + dbPort + "/" + dbName;
        String user = this.user;
        String password = this.pwd;
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
