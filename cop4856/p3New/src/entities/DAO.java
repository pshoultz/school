package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {
    // A very simple Data Object abstraction for DB access via JDBC
    private List<DVD> resultList;

    public DAO() {
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/DVDLibrary?serverTimezone=UTC&user=root&password=mysql4me";

        try {
            resultList = new ArrayList<>();
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * from DVDS");
            while (rs.next()) {
                DVD d = new DVD(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                resultList.add(d);
            }
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try { // Did I mention I hate "try" in a "finally" clause...
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public List<DVD> findAll() {
        return resultList;
    }
}
