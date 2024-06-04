// Source code is decompiled from a .class file using FernFlower decompiler.
package com.connection;

import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;

public class DatabaseConnection {
   static Connection con;

   public DatabaseConnection() {
   }

   public static Connection getConnection() throws Exception {
      Class.forName("com.mysql.cj.jdbc.Driver");
      return DriverManager.getConnection("jdbc:mysql://localhost:3306/vpmsdb?useSSL=false", "root", "root");
   }

   public static ResultSet getResultFromSqlQuery(String SqlQueryString) {
      ResultSet rs = null;

      try {
         con = getConnection();
         rs = con.createStatement().executeQuery(SqlQueryString);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      return rs;
   }

   public static void insertUpdateFromSqlQuery(String SqlQueryString) {
      try {
         if (con == null) {
            getConnection();
         }

         con.createStatement().executeUpdate(SqlQueryString);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static String randompasswordgeneration() {
      Random RANDOM = new SecureRandom();
      boolean PASSWORD_LENGTH = true;
      String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789@";
      String password = "";

      for(int i = 0; i < 10; ++i) {
         int index = (int)(RANDOM.nextDouble() * (double)letters.length());
         password = password + letters.substring(index, index + 1);
      }

      return password;
   }
}
