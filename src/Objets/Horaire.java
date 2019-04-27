/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objets;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author HP Pavilion
 */
public class Horaire {
    public int id;
    public Date datePublication;
    public int idPromotion;
    public Vector<Seance> seances;

    public Horaire(int id, Date datePublication, int idPromotion, Vector<Seance> seances) {
        this.id = id;
        this.datePublication = datePublication;
        this.idPromotion = idPromotion;
        this.seances = seances;
    }
    
    public Horaire() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Vector<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Vector<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public String toString() {
        return "Horaire{" + "id=" + id + ", datePublication=" + datePublication + ", idPromotion=" + idPromotion + ", seances=" + seances + '}';
    }    

    public static void main(String[] args){
    
    System.out.println("Hello");
    }
}
