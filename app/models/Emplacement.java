package models;

/***********************************************************************
 * Module:  Emplacement.java
 * Author:  antoine
 * Purpose: Defines the Class Emplacement
 ***********************************************************************/

import java.util.*;

public class Emplacement {
   private long id;
   private java.lang.String batiment;
   private int allee;
   private java.lang.String emplacement;
   private int etage;
   private float quantite;
   private long idLot;

    public Emplacement(long id, String batiment, int allee, String emplacement, int etage, float quantite, long idLot) {
        this.id = id;
        this.batiment = batiment;
        this.allee = allee;
        this.emplacement = emplacement;
        this.etage = etage;
        this.quantite = quantite;
        this.idLot = idLot;
    }

    public long getId() {
        return id;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public int getAllee() {
        return allee;
    }

    public void setAllee(int allee) {
        this.allee = allee;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public long getIdLot() {
        return idLot;
    }

    public void setIdLot(long idLot) {
        this.idLot = idLot;
    }

    @Override
    public String toString() {
        return "Emplacement{" +
                "id=" + id +
                ", batiment='" + batiment + '\'' +
                ", allee=" + allee +
                ", emplacement='" + emplacement + '\'' +
                ", etage=" + etage +
                ", quantite=" + quantite +
                ", idLot=" + idLot +
                '}';
    }
}