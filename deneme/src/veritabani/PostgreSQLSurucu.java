package cc.proje.veritabani;

import cc.proje.AkilliCihaz.ICihazBilgiSistemi;
import cc.proje.AkilliCihaz.Araclar;


import java.sql.*;
import java.util.Scanner;

public class PostgreSQLSurucu implements ICihazBilgiSistemi{

    @Override
    public boolean kullaniciDogrula() {

        System.out.println("Yetkili Id'nizi Giriniz...");
        Scanner input=new Scanner(System.in);
        int id = input.nextInt();


        System.out.println("Cihaz bilgi sistemi kullanıcıyı doğruluyor...");
        Araclar.bekle(2000);
        System.out.println("veritabanına bağlandı ve kullanıcıyı sorguluyor...");
        Araclar.bekle(2000);
        try
        {   /***** Bağlantı kurulumu *****/
            String jdbcURL = "jdbc:postgresql://localhost:5432/NYATProje";
            String username = "postgres";
            String password = "1151";


            Connection conn = DriverManager.getConnection(jdbcURL,username, password);

            String sql= "SELECT *  FROM \"kullanici\" WHERE \"id\"="+ id;


            /***** Sorgu çalıştırma *****/

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int idd;
            int ssifre;
            int sayac =0;


            while(rs.next())
            {

                sayac++;
            }
            if(sayac!=0)
            {
                System.out.println("Kullanıcı Adı doğru");

            }
            else
            {
                return false;
            }
            conn.close();

            rs.close();
            stmt.close();
            System.out.println("Şifrenizi Giriniz...");
            int sifre = input.nextInt();
            String sql2= "SELECT *  FROM \"kullanici\" WHERE \"id\"="+ id + " AND sifre="+sifre;
            Connection conn2 = DriverManager.getConnection(jdbcURL,username, password);
            Statement stmt2 = conn2.createStatement();
            ResultSet rs2 = stmt2.executeQuery(sql2);


            while(rs2.next())
            {
                idd = rs2.getInt("id");
                ssifre = rs2.getInt("sifre");
                return true;

            }
            rs2.close();
            stmt2.close();
            conn2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
