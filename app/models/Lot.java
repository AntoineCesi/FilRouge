package models;
/***********************************************************************
 * Module:  Lot.java
 * Author:  antoine
 * Purpose: Defines the Class Lot
 ***********************************************************************/

import java.util.*;

public class Lot {
   private long id;
   private java.util.Date dateStock;
   private java.lang.String reference;
   private float quantite;

    public Lot(long id, Date dateStock, String reference, float quantite) {
        this.id = id;
        this.dateStock = dateStock;
        this.reference = reference;
        this.quantite = quantite;
    }

    public long getId() {
        return id;
    }

    public Date getDateStock() {
        return dateStock;
    }

    public void setDateStock(Date dateStock) {
        this.dateStock = dateStock;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "id=" + id +
                ", dateStock=" + dateStock +
                ", reference='" + reference + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}