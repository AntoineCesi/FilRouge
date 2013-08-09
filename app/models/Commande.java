package models;
/***********************************************************************
 * Module:  Commande.java
 * Author:  antoine
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class Commande extends Model{

   private String reference;
   private String type;

   @OneToOne
   private Reception reception;

   @ManyToMany
   private List<Produit> produits;

   @OneToOne
   private Partenaire partenaire;

    public Commande(String reference, String type, Reception reception, List<Produit> produits, Partenaire partenaire) {
        this.reference = reference;
        this.type = type;
        this.reception = reception;
        this.produits = produits;
        this.partenaire = partenaire;
    }

    /**
     * Sets new reference.
     *
     * @param reference New value of reference.
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Sets new produits.
     *
     * @param produits New value of produits.
     */
    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets new reception.
     *
     * @param reception New value of reception.
     */
    public void setReception(Reception reception) {
        this.reception = reception;
    }

    /**
     * Gets reception.
     *
     * @return Value of reception.
     */
    public Reception getReception() {
        return reception;
    }

    /**
     * Gets partenaire.
     *
     * @return Value of partenaire.
     */
    public Partenaire getPartenaire() {
        return partenaire;
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return Value of type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets new partenaire.
     *
     * @param partenaire New value of partenaire.
     */
    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }

    /**
     * Gets produits.
     *
     * @return Value of produits.
     */
    public List<Produit> getProduits() {
        return produits;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "reference='" + reference + '\'' +
                ", type='" + type + '\'' +
                ", reception=" + reception +
                ", produits=" + produits +
                ", partenaire=" + partenaire +
                '}';
    }
}