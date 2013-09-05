package models; /***********************************************************************
 * Module:  Lot.java
 * Author:  Antoine
 * Purpose: Defines the Class Lot
 ***********************************************************************/

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class Lot extends ModelCustom {
   public Date dateStock;
   public String reference;
   public float quantite;

   @OneToOne
   public Produit produit;

   @OneToMany(mappedBy = "lot",fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
   public List<Emplacement> emplacements;

//    public Lot(Date dateStock, String reference, float quantite, Produit produit, List<Emplacement> emplacements) {
//        this.dateStock = dateStock;
//        this.reference = reference;
//        this.quantite = quantite;
//        this.produit = produit;
//        this.emplacements = emplacements;
//    }

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
     * Sets new emplacements.
     *
     * @param emplacements New value of emplacement.
     */
    public void setEmplacements(List<Emplacement> emplacements) {
        getEmplacements().clear();
        if (emplacements != null) {
            emplacements.removeAll(Collections.singleton(null));
            for (Emplacement emplacement : emplacements) {
                emplacement.lot = this;
            }
            this.emplacements.addAll(emplacements);
        }
    }

    /**
     * Gets emplacements.
     *
     * @return Value of emplacement.
     */
    public List<Emplacement> getEmplacements() {
        if (emplacements == null) emplacements = new ArrayList<>();
        return emplacements;
    }

    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        if (reference == null){
            Integer countLot = Integer.parseInt(Lot.count() +"") + 1;
            reference = "L000000".substring(0,"L000000".length()-countLot.toString().length())+countLot;
        }
        return reference;
    }

    @Override
    public String toString() {
        return reference;
    }
}