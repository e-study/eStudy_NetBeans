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

public class Etablissement {
    public int id;
    public String nom;
    public String adresse;

    public Etablissement(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }
    //
    
    //
    public Etablissement(){
        //
        System.out.println("Un Constructeur Vide Etablissement!!!");
    }
    //
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Etablissement{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + '}';
    }
    //
    public static void main(String[]args){
        //
        System.out.println("Hello!!");
        //
        
    }
    //
    
}
