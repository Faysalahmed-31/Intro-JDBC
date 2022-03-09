package com.perscholas.cafe;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
        // lets setup the connection java and database
        String url = "jdbc:mariadb://localhost/ROOM27";
        final String user = "root";
        final String pass = "root";
        Connection conn = null;

            conn = DriverManager.getConnection(url, "root", "root");
            String sql = "UPDATE Persons  SET firstName = ?, lastName = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "faisal");
            stmt.setString(2, "Abdul");


            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
//                System.out.println(rs.getString("firstName") + " "+ rs.getString("lastName")
//                        + rs.getString("employeeNumber"));
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastName "));
                stmt.executeUpdate();

                stmt.close();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

            }
        }
    }

