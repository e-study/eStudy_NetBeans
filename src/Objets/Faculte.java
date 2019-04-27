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

public class Faculte {
    public int id;
    public String nom;
    public int idEtablissement;
    public String nomChef;

    public Faculte(int id, String nom, int idEtablissement, String nomChef) {
        this.id = id;
        this.nom = nom;
        this.idEtablissement = idEtablissement;
        this.nomChef = nomChef;
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

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public String getNomChef() {
        return nomChef;
    }

    public void setNomChef(String nomChef) {
        this.nomChef = nomChef;
    }
    
    @Override
    public String toString() {
        return "Faculte{" + "id=" + id + ", nom=" + nom + ", idEtablissement=" + idEtablissement + ", nomChef=" + nomChef + '}';
    }
    public static void main(String[]args){
    
    }
}
