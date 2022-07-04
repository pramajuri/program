package pemro.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBConn {
    public Connection databaseLink;
    String dbName       = "pemrograman";
    String dbUsername   = "root";
    String dbPassword   = "";
    String url          = "jdbc:mysql://localhost/" + dbName;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, dbUsername, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databaseLink;
    }

    void saveDB(String merk, String jenis, String nopol, int harga){

        String sqlSave = "INSERT INTO motor(merk, jenis, nopol, harga) VALUES (\""+ merk + "\", \"" + jenis + "\", \"" + nopol + "\", \"" + harga + "\")";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlSave);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




