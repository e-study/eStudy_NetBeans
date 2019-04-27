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
public class Enseignant {

    public int id;
    public String nom;
    public String titre;
    public int idEtablissement;

    public Enseignant(int id, String nom, String titre, int idEtablissement) {
        this.id = id;
        this.nom = nom;
        this.titre = titre;
        this.idEtablissement = idEtablissement;
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

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public Enseignant() {
        
    }

    
    
    @Override
    public String toString() {
        return "Enseignant{" + "id=" + id + ", nom=" + nom + ", titre=" + titre + ", idEtablissement=" + idEtablissement + '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello");

    }

}
