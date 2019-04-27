/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objets;

/**
 *
 * @author HP Pavilion
 */
public class Utilisateur {
    public static int CATEGORIE_ADMIN = 0;
    public static int CATEGORIE_INVITE = 1;
    
    
    public int id;
    public String nom;
    public String motDePasse;
    public String email;
    public int categorie;

    public Utilisateur(int id, String nom, String motDePasse, String email, int categorie) {
        this.id = id;
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.email = email;
        this.categorie = categorie;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    
    public static int getCATEGORIE_ADMIN() {
        return CATEGORIE_ADMIN;
    }

    public static void setCATEGORIE_ADMIN(int CATEGORIE_ADMIN) {
        Utilisateur.CATEGORIE_ADMIN = CATEGORIE_ADMIN;
    }

    public static int getCATEGORIE_INVITE() {
        return CATEGORIE_INVITE;
    }

    public static void setCATEGORIE_INVITE(int CATEGORIE_INVITE) {
        Utilisateur.CATEGORIE_INVITE = CATEGORIE_INVITE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", nom=" + nom + ", motDePasse=" + motDePasse + ", email=" + email + ", categorie=" + categorie + '}';
    }
    
}
