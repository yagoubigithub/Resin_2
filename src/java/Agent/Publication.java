/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

import java.util.Date;

public class Publication {

    private int id;
    private Date date;
    private String description;
    private String firstname;
    private String lastname;
    private String city;
    private String nom_article;
    private String categorie;
    private String color;
    private String taille;
    private double prix;
    private double promo;
    private String image;
             private String tel
            ;

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Publication(int id, Date date, String description, String firstname, String lastname, String city, String nom_article, String categorie, String color, String taille, double prix, double promo, String image,String tel) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.nom_article = nom_article;
        this.categorie = categorie;
        this.color = color;
        this.taille = taille;
        this.prix = prix;
        this.promo = promo;
        this.image = image;
        this.tel=tel;
    }

    public String getTel() {
        return tel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setPromo(double promo) {
        this.promo = promo;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public String getNom_article() {
        return nom_article;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getColor() {
        return color;
    }

    public String getTaille() {
        return taille;
    }

    public double getPrix() {
        return prix;
    }

    public double getPromo() {
        return promo;
    }

    public String getImage() {
        return image;
    }
    

}
