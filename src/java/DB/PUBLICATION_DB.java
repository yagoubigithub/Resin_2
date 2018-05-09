/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Agent.Publication;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Yagoubi
 */
public class PUBLICATION_DB {
    
      private Connection cn;
    private Statement st;
    private ResultSet rs;

    public PUBLICATION_DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resin", "root", "");
            st = cn.createStatement();
        } catch (Exception e) {
            System.err.println("Error :" + e.getMessage());
        }
    }
     public ArrayList<Publication> SelectPublication() {
         ArrayList<Publication> array=new ArrayList<>();
        int a=10;
       
        try {
            rs = st.executeQuery("SELECT p.id,p.date AS date ,p.description AS description,\n"
                    + "u.firstname,u.lastname,u.city_id,u.tel AS tel,\n"
                    + "a.nom,a.categorie,a.color,a.taille,a.prix,a.promo,a.image\n"
                    + "FROM publication p \n"
                    + "JOIN user u \n"
                    + "ON u.id= p.user_id \n"
                    + "JOIN article a \n"
                    + "ON a.id=p.article_id\n"
                    + "ORDER BY 2  DESC\n"
                    + "\n"
                   );
            
            while (rs.next()) {
             Publication   publication = new Publication(rs.getInt("id"), rs.getDate("date"), rs.getString("description"),
                        rs.getString("firstname"), rs.getString("lastname"), "",
                        rs.getString("nom"), rs.getString("categorie"), rs.getString("color"),
                        rs.getString("taille"), rs.getDouble("prix"), rs.getDouble("promo"), rs.getString("image"),rs.getString("tel"));
                PUBLICATION_DB p=new PUBLICATION_DB();
               String city = p.SelectCityName(rs.getInt("city_id"));
                 publication.setCity(city);
                 array.add(publication);

            }
        } catch (SQLException ex) {
            Date d=new Date(1999,11,15);
           array.add(new Publication(0,d, ex.getMessage(), ex.getSQLState(), ex.getMessage(), ex.getMessage(),
                   ex.getMessage(), ex.getMessage(), ex.getMessage(), ex.getMessage(),ex.getErrorCode(),
                   ex.getErrorCode(), ex.getLocalizedMessage(),ex.getSQLState()));
        }
       
        return array;

    }

    public String SelectCityName(int id) {
       
        String nom = "";
        try {
            rs = st.executeQuery("SELECT nom FROM citys WHERE id=" + id);
            while (rs.next()) {
                nom = rs.getString("nom");
            }

        } catch (SQLException ex) {
            nom = ex.getMessage();
        }
        return nom;
    }
    public String AddLike(String id,String user_id){
         String r = "success";
        if(!ifUSERID_EXIST(user_id)){
            
        try {
             st.executeUpdate("INSERT INTO `like`(`pub_id`,`user_id`) VALUES ("+id+","+user_id+")");
           

        } catch (SQLException ex) {
           r=ex.getMessage();
                   
        }
        
        }
       return r;
    }
    public boolean ifUSERID_EXIST(String id){
          boolean b=false;
        try {
            rs = st.executeQuery("SELECT 1 FROM `like` WHERE user_id=" + id);
            while (rs.next()) {
                b = rs.getBoolean(1);
            }

        } catch (SQLException ex) {
            
        }
        return b;
    }
   
}
