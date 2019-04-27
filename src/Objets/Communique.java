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
public class Communique {
    public int id;
    public String titre;
    public String contenu;
    public Date datePublication;
    public Date dateExpiration;
    public int idUtilisateur;
    public int idPromotion;
    public int idDepartement;
    public int idFaculte;
    public int idEtablissement;

    public Communique(int id, String titre, String contenu, Date datePublication, Date dateExpiration, int idUtilisateur, int idPromotion, int idDepartement, int idFaculte, int idEtablissement) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.datePublication = datePublication;
        this.dateExpiration = dateExpiration;
        this.idUtilisateur = idUtilisateur;
        this.idPromotion = idPromotion;
        this.idDepartement = idDepartement;
        this.idFaculte = idFaculte;
        this.idEtablissement = idEtablissement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    public int getIdFaculte() {
        return idFaculte;
    }

    public void setIdFaculte(int idFaculte) {
        this.idFaculte = idFaculte;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    @Override
    public String toString() {
        return "Communique{" + "id=" + id + ", titre=" + titre + ", contenu=" + contenu + ", datePublication=" + datePublication + ", dateExpiration=" + dateExpiration + ", idUtilisateur=" + idUtilisateur + ", idPromotion=" + idPromotion + ", idDepartement=" + idDepartement + ", idFaculte=" + idFaculte + ", idEtablissement=" + idEtablissement + '}';
    }
}
