package pl.codcerslab.entity;

import java.sql.*;

public class DBUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//    }

    public static Connection connect(String dbName) {
     Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop2?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8", "root", "coderslab");
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
        return  conn;
    }

//    public static int insert(Connection conn, String query, String... params) {
//        try ( PreparedStatement statement = conn.prepareStatement(query)) {
//            for (int i = 0; i < params.length; i++) {
//                statement.setString(i + 1, params[i]);
//            }
//            return statement.executeUpdate();
//        } catch (SQLException sqlEx) {
//            sqlEx.printStackTrace();
//            return-1;
//        }
//    }
//
//    public static void printData(Connection conn, String query, String... columnNames) {
//
//        try (PreparedStatement statement = conn.prepareStatement(query);
//             ResultSet resultSet = statement.executeQuery();) {
//            while (resultSet.next()) {
//                for (String param : columnNames) {
//                    System.out.println(resultSet.getString(param));
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";
//
//    public static int remove(Connection conn, String tableName, int id) {
//        try (PreparedStatement statement =
//                     conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName));) {
//            statement.setInt(1, id);
//            statement.executeUpdate();
//            return statement.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return -1;
//        }
//    }
//    public static void printData(Connection conn, String query, String[] params, String[] columns) {
//        try (PreparedStatement statement = conn.prepareStatement(query)) {
//            for (int i = 0; i < params.length; i++) {
//                statement.setString(i + 1, params[i]);
//            }
//            ResultSet resultSet = statement.executeQuery();
//            for (int i = 0; i < columns.length; i++){
//                if (i != 0) {
//                    System.out.print(";");
//                }
//                System.out.print(columns[i]);
//            }
//            System.out.println();
//            while (resultSet.next()) {
//                for (int i = 0; i < columns.length; i++) {
//                    String value = resultSet.getString(columns[i]);
//                    if (i != 0) {
//                        System.out.print(";");
//                    }
//                    System.out.print(value);
//                }
//                System.out.println();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public static long count(Connection conn, String tableName) {
//        try (PreparedStatement statement = conn.prepareStatement("SELECT COUNT(*) FROM " + tableName + ";")) {
//            ResultSet resultSet = statement.executeQuery();
//            resultSet.next();
//            return resultSet.getLong(1);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return -1;
//        }
//    }
}
