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
public class Promotion {
    public int id;
    public String nom;
    public int idDepartement;
    public int idEtudiantCP;

    public Promotion(int id, String nom, int idDepartement, int idEtudiantCP) {
        this.id = id;
        this.nom = nom;
        this.idDepartement = idDepartement;
        this.idEtudiantCP = idEtudiantCP;
    }

    public int getIdEtudiantCP() {
        return idEtudiantCP;
    }

    public void setIdEtudiantCP(int idEtudiantCP) {
        this.idEtudiantCP = idEtudiantCP;
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

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    @Override
    public String toString() {
        return "Promotion{" + "id=" + id + ", nom=" + nom + ", idDepartement=" + idDepartement + ", idEtudiantCP=" + idEtudiantCP + '}';
    }
}
