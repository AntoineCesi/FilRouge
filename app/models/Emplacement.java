package models; /***********************************************************************
 * Module:  Emplacement.java
 * Author:  antoine
 * Purpose: Defines the Class Emplacement
 ***********************************************************************/

import play.data.validation.Required;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Emplacement extends ModelCustom{

    @Required
   private String batiment;
    @Required
   private Integer allee;
    @Required
   private String emplacement;
    @Required
   private Integer etage;
    @Required
   private float quantite;

   @OneToOne
   private Lot lot;

    public Emplacement(String batiment, Integer allee, String emplacement, Integer etage, float quantite, Lot lot) {
        this.batiment = batiment;
        this.allee = allee;
        this.emplacement = emplacement;
        this.etage = etage;
        this.quantite = quantite;
        this.lot = lot;
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
     * Sets new etage.
     *
     * @param etage New value of etage.
     */
    public void setEtage(Integer etage) {
        this.etage = etage;
    }

    /**
     * Sets new lot.
     *
     * @param lot New value of lot.
     */
    public void setLot(Lot lot) {
        this.lot = lot;
    }

    /**
     * Gets emplacement.
     *
     * @return Value of emplacement.
     */
    public String getEmplacement() {
        return emplacement;
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
     * Sets new allee.
     *
     * @param allee New value of allee.
     */
    public void setAllee(Integer allee) {
        this.allee = allee;
    }

    /**
     * Gets etage.
     *
     * @return Value of etage.
     */
    public Integer getEtage() {
        return etage;
    }

    /**
     * Sets new emplacement.
     *
     * @param emplacement New value of emplacement.
     */
    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    /**
     * Gets lot.
     *
     * @return Value of lot.
     */
    public Lot getLot() {
        return lot;
    }

    /**
     * Sets new batiment.
     *
     * @param batiment New value of batiment.
     */
    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    /**
     * Gets batiment.
     *
     * @return Value of batiment.
     */
    public String getBatiment() {
        return batiment;
    }

    /**
     * Gets allee.
     *
     * @return Value of allee.
     */
    public Integer getAllee() {
        return allee;
    }
}