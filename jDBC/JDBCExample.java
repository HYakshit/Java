package jDBC;

import java.sql.*;
class JDBCExample {

    public static void main(String args[]) {
        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            // 2. Connect to DB
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/icecream", "root", "");

            // 3. Create statement
            Statement stmt = con.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");

            // 5. Process results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // 6. Close
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
