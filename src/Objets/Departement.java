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
public class Departement {
    public int id;
    public String nom;
    public int idFaculte;

    public Departement(int id, String nom, int idFaculte) {
        this.id = id;
        this.nom = nom;
        this.idFaculte = idFaculte;
    }
    
    public Departement(){
    
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

    public int getIdFaculte() {
        return idFaculte;
    }

    public void setIdFaculte(int idFaculte) {
        this.idFaculte = idFaculte;
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom=" + nom + ", idFaculte=" + idFaculte + '}';
    }  
    
    public static void main(String[] args){
        System.out.println("Hello les gars !");
    }
    
    
    
}
