package jdbc;

import java.sql.*;

public class JdbcExample4 {

  private String user = "userq2";
  private String pwd = "pwd1";
  private String dbName = "queue1";
  private String dbServer = "localhost";
  private String dbPort = "3306";

  public void push(String userId) throws SQLException {
    Connection conn = null;
    try {
      conn = connection();

      // SQL Injection
      try (PreparedStatement st = conn
          .prepareStatement("select * from user where id_user = " + userId)) {

        // fix to sql injection
        // try (PreparedStatement st =
        // conn.prepareStatement("select * from user where id_user = :uid")) {
        // st.setString(1, userId);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
          System.out.println(rs.getString(1));
        }
      }
    } finally {
      conn.close();
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
