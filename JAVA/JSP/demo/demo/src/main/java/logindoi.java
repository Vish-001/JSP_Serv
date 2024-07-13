//import java.sql.*;
//
//import static java.lang.Class.forName;
//import static java.sql.DriverManager.getConnection;
//
//public class logindoi {
//    public boolean doCheck(String uname, String pass) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            forName("org.postgresql.Driver");
//            String url = "jdbc:postgresql://localhost:5432/Telusko";  // Replace with your database name
//            String username = "postgres";  // Replace with your database username
//            String password = "8010811908";  // Replace with your database password
//            conn = getConnection(url, username, password);
//
//            String sql = "SELECT username FROM Username_Password WHERE username = ? AND password = ?";
//            stmt = conn.prepareStatement(sql);
//            stmt.setString(1, uname);
//            stmt.setString(2, pass);
//            rs = stmt.executeQuery();
//
//            return rs.next();  // If a row is found, the user exists and password matches
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
