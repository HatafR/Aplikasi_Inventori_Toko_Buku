
package KoneksiDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi () {
        if (koneksi == null) {
            
            try{
                String url = "jdbc:mysql://localhost:3306/hotel";
                String uname = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection (url, uname, pass);
                System.out.println("Koneksi database berhasil");
                                                                
            } catch (SQLException e) {
                System.out.println("Koneksi database gagal");
            }
                
        }
        return koneksi;
    }
}
