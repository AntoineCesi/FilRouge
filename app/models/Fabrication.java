package models;

/***********************************************************************
 * Module:  Fabrication.java
 * Author:  antoine
 * Purpose: Defines the Class Fabrication
 ***********************************************************************/

import java.util.*;

public class Fabrication {
   private long id;
   private java.util.Date dateCreation;
   private boolean termine;
   private float quantite;
   private long idProduit;

    public Fabrication(long id, Date dateCreation, boolean termine, float quantite, long idProduit) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.termine = termine;
        this.quantite = quantite;
        this.idProduit = idProduit;
    }

    public long getId() {
        return id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isTermine() {
        return termine;
    }

    public void setTermine(boolean termine) {
        this.termine = termine;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public long getIdProduit() {
        return idProduit;
    }

    @Override
    public String toString() {
        return "Fabrication{" +
                "id=" + id +
                ", dateCreation=" + dateCreation +
                ", termine=" + termine +
                ", quantite=" + quantite +
                ", idProduit=" + idProduit +
                '}';
    }
}