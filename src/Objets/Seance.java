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
public class Seance {
    public int id;
    public int idHoraire;
    public int idCours;
    public int idEnseignant;
    public String local;
    public String jourDelaSemaine;
    public String heureDebut;
    public String heureFin;

    public Seance(int id, int idHoraire, int idCours, int idEnseignant, String local, String jourDelaSemaine, String heureDebut, String heureFin) {
        this.id = id;
        this.idHoraire = idHoraire;
        this.idCours = idCours;
        this.idEnseignant = idEnseignant;
        this.local = local;
        this.jourDelaSemaine = jourDelaSemaine;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }
//

    public Seance() {
        //
        System.out.println("Un Constructeur Vide Seance!!!");
        //
    }
    
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHoraire() {
        return idHoraire;
    }

    public void setIdHoraire(int idHoraire) {
        this.idHoraire = idHoraire;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getJourDelaSemaine() {
        return jourDelaSemaine;
    }

    public void setJourDelaSemaine(String jourDelaSemaine) {
        this.jourDelaSemaine = jourDelaSemaine;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    @Override
    public String toString() {
        return "Seance{" + "id=" + id + ", idHoraire=" + idHoraire + ", idCours=" + idCours + ", idEnseignant=" + idEnseignant + ", local=" + local + ", jourDelaSemaine=" + jourDelaSemaine + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + '}';
    }
    //
    public static void main(String[]args){
        //
        System.out.println("Hello!!");
        //
        
    }
    //
    //
}
