/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author aldir
 */
public class koneksi {
    static Connection koneksi;
    public static Connection getConnection(){
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa","root","");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "koneksita database gagal");
        }
        return koneksi;
    }
}
