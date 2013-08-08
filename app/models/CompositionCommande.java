package models;
/***********************************************************************
 * Module:  CompositionCommande.java
 * Author:  antoine
 * Purpose: Defines the Class CompositionCommande
 ***********************************************************************/

import java.util.*;

public class CompositionCommande {
   private float quantite;
   private long idProduit;
   private long idCommande;

    public CompositionCommande(float quantite, long idProduit, long idCommande) {
        this.quantite = quantite;
        this.idProduit = idProduit;
        this.idCommande = idCommande;
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

    public long getIdCommande() {
        return idCommande;
    }

    @Override
    public String toString() {
        return "CompositionCommande{" +
                "quantite=" + quantite +
                ", idProduit=" + idProduit +
                ", idCommande=" + idCommande +
                '}';
    }
}