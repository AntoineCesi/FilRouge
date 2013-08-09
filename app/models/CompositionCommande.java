package models;
/***********************************************************************
 * Module:  CompositionCommande.java
 * Author:  antoi_000
 * Purpose: Defines the Class CompositionCommande
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class CompositionCommande extends Model {
   private float quantite;
   
   private Produit produit;
   private Commande commande;


    /**
     * Gets quantite.
     *
     * @return Value of quantite.
     */
    public float getQuantite() {
        return quantite;
    }

    /**
     * Sets new produit.
     *
     * @param produit New value of produit.
     */
    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    /**
     * Sets new commande.
     *
     * @param commande New value of commande.
     */
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    /**
     * Sets new quantite.
     *
     * @param quantite New value of quantite.
     */
    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    /**
     * Gets produit.
     *
     * @return Value of produit.
     */
    public Produit getProduit() {
        return produit;
    }

    /**
     * Gets commande.
     *
     * @return Value of commande.
     */
    public Commande getCommande() {
        return commande;
    }
}