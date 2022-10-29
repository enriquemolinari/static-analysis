package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample {

  private String user = "userq2";
  private String pwd = "pwd1";
  private String dbName = "queue1";
  private String dbServer = "localhost";
  private String dbPort = "3306";

  public void push() throws SQLException {
    Connection conn = null;
    PreparedStatement st = null;
    try {
      conn = connection();
      conn.setAutoCommit(false);
      st = conn.prepareStatement(
          "insert into user(id, user_name, pwd, email) values(108, 'user1','anyPassword','user1@dot.com')");
      st.executeUpdate();
      conn.commit();
    } catch (SQLException e) {
      try {
        conn.rollback();
        throw new RuntimeException(e);
      } catch (SQLException e1) {
        throw new RuntimeException(e1);
      }
    } /*
       * finally { try { if (st != null) { st.close(); } } finally { if (conn != null) { conn.close(); } }
       * }
       */
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
