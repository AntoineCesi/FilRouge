package models; /***********************************************************************
 * Module:  Lot.java
 * Author:  Antoine
 * Purpose: Defines the Class Lot
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class Lot extends ModelCustom {
   private Date dateStock;
   private String reference;
   private float quantite;

   @OneToOne
   private Produit produit;

   @OneToMany(mappedBy = "lot")
   private List<Emplacement> emplacement;

    public Lot(Date dateStock, String reference, float quantite, Produit produit, List<Emplacement> emplacement) {
        this.dateStock = dateStock;
        this.reference = reference;
        this.quantite = quantite;
        this.produit = produit;
        this.emplacement = emplacement;
    }

    /**
     * Gets quantite.
     *
     * @return Value of quantite.
     */
    public float getQuantite() {
        return quantite;
    }

    /**
     * Sets new dateStock.
     *
     * @param dateStock New value of dateStock.
     */
    public void setDateStock(Date dateStock) {
        this.dateStock = dateStock;
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
     * Gets dateStock.
     *
     * @return Value of dateStock.
     */
    public Date getDateStock() {
        return dateStock;
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
     * Sets new emplacement.
     *
     * @param emplacement New value of emplacement.
     */
    public void setEmplacement(List<Emplacement> emplacement) {
        this.emplacement = emplacement;
    }

    /**
     * Gets emplacement.
     *
     * @return Value of emplacement.
     */
    public List<Emplacement> getEmplacement() {
        return emplacement;
    }

    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        return reference;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "dateStock=" + dateStock +
                ", reference='" + reference + '\'' +
                ", quantite=" + quantite +
                ", produit=" + produit +
                ", emplacement=" + emplacement +
                '}';
    }
}