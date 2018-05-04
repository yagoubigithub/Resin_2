/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Agent.Publication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Agent.*;
import java.sql.Date;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yagoubi
 */
public class DBConnect {

    private Connection cn;
    private Statement st;
    private ResultSet rs;

    public DBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resin", "root", "");
            st = cn.createStatement();
        } catch (Exception e) {
            System.err.println("Error :" + e.getMessage());
        }
    }

    public User Auth(String email, String password) {
        User user = null;
        try {
            rs = st.executeQuery("SELECT * FROM `user` WHERE email='" + email + "' AND password='" + password + "'");

            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"),
                        rs.getString("email"), rs.getString("password"), rs.getString("address"), rs.getInt("city_id"));
            }
        } catch (SQLException ex) {
            user = null;
        }
        return user;
    }

    public int SelectCityId(String cityname) {
        int id = 0;
        try {
            rs = excuteSelect("SELECT id FROM citys WHERE nom='" + cityname + "'");
            while (rs.next()) {
                id = rs.getInt("id");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public boolean isEmailExist(String email) {
        User user = null;
        boolean b = true;
        try {
            rs = st.executeQuery("SELECT * FROM `user` WHERE email='" + email + "'");

            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"),
                        rs.getString("email"), rs.getString("password"), rs.getString("address"), rs.getInt("city_id"));
            }
        } catch (SQLException ex) {
            user = null;
        }
        b = user != null;
        return b;
    }

    public User SignUp(String firstname, String lastname, String email, String password, String address, String city) {
        User user;
        if (isEmailExist(email)) {
            return new User(0, "exist", "exist", "exist", "exist", "exist", 0);
        } else {
            user = null;
        }
        int cityId = SelectCityId(city);
        try {
            excuteDml("INSERT INTO `user`(`firstname`, `lastname`, `email`, `password`, `address`, `city_id`) "
                    + "VALUES ('" + firstname + "','" + lastname + "','" + email + "','" + password + "','" + address + "'," + cityId + ")");
            rs = excuteSelect("SELECT * FROM `user` WHERE firstname='" + firstname + "' AND lastname='" + lastname + "'"
                    + " AND email='" + email + "' AND password='" + password + "' "
                    + "AND address='" + address + "' AND city_id=" + cityId);
            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"),
                        rs.getString("email"), rs.getString("password"), rs.getString("address"), rs.getInt("city_id"));
            }
        } catch (SQLException ex) {
            user = null;
        }
        return user;
    }

    public ResultSet excuteSelect(String Select) throws SQLException {
        return st.executeQuery(Select);
    }

    public void excuteDml(String dml) throws SQLException {
        st.executeUpdate(dml);
    }

    public ArrayList<String> SelectCategorie() {
        ArrayList<String> array = new ArrayList<>();
        try {
            rs = excuteSelect("SELECT DISTINCT categorie FROM article");
            while (rs.next()) {
                String categorie = rs.getString("categorie");
                array.add(categorie);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }

    public void close() {
        try {
            st.close();
            cn.close();
        } catch (SQLException ex) {
            throw new SecurityException();
        }
    }

   
}
