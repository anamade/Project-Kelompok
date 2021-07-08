/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import base.loginadmin;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author DIKYPUT PC
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null){
    try {
      String url = "jdbc:mysql://localhost:3306/project";
      String user="root";
      String password = "";
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      koneksi = DriverManager.getConnection(url,user,password);
      System.out.println("Koneksi Database Berhasil");
      new loginadmin().setVisible(true);
 } catch (Exception e) {
      System.out.println("Koneksi Database Error");
 } 
 }
        return koneksi;
}
public static void main(String args[]){
    getKoneksi(); 
    }

    public Koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
