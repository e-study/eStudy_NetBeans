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
public class Cours {
    public int id;
    public String nom;
    public int idEnseignant;
    public int ponderation;
    public int idPromotion;

    public Cours(int id, String nom, int idEnseignant, int ponderation, int idPromotion) {
        this.id = id;
        this.nom = nom;
        this.idEnseignant = idEnseignant;
        this.ponderation = ponderation;
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

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getPonderation() {
        return ponderation;
    }

    public void setPonderation(int ponderation) {
        this.ponderation = ponderation;
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    @Override
    public String toString() {
        return "Cours{" + "id=" + id + ", nom=" + nom + ", idEnseignant=" + idEnseignant + ", ponderation=" + ponderation + ", idPromotion=" + idPromotion + '}';
    }
    public static void main(String[]args){
    System.out.println("bonjour");
    }
}
