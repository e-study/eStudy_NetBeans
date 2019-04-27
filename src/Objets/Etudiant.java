/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objets;

import java.util.Date;

/**
 *
 * @author HP Pavilion
 */
public class Etudiant {
    public int id;
    public String nom;
    public String postnom;
    public String prenom;
    public Date dateNaissance;
    public String email;
    public String motdepasse;
    public String telephone;
    public int idPromotion;
    

    public Etudiant(int id, String nom, String postnom, String prenom, Date dateNaissance, String email, String motdepasse, String telephone, int idPromotion) {
        this.id = id;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.motdepasse = motdepasse;
        this.telephone = telephone;
        this.idPromotion = idPromotion;
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

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", postnom=" + postnom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", email=" + email + ", motdepasse=" + motdepasse + ", telephone=" + telephone + ", idPromotion=" + idPromotion + '}';
    }
    
    public static void main(String[]args){
    
    }
    
    
    
    
}
