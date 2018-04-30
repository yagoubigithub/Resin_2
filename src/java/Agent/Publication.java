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

    public Publication(int id, Date date, String description, String firstname, String lastname, String city, String nom_article, String categorie, String color, String taille, double prix, double promo, String image) {
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
    }

}
