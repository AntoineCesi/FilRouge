package models; /***********************************************************************
 * Module:  Produit.java
 * Author:  antoi_000
 * Purpose: Defines the Class Produit
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Produit extends ModelCustom{

    private String nom;
    private String reference;
    private String unite;
    private float quantiteStock;
    private float seuilQteMin;
    private float seuilQteMax;
    private float qteMaxEmp;
    private float prixUnitaire;
    private String couleur;
    private boolean actif;

    @OneToMany(mappedBy="produit")
    private List<CompositionCommande> compositionCommandes;

    @OneToMany(mappedBy="produit")
    private List<Reception> reception;

    @OneToMany(mappedBy="produit")
    private List<Fabrication> fabrication;

    @OneToMany(mappedBy="produit")
    private List<Lot> lot;



     /**
     * Sets new unite.
     *
     * @param unite New value of unite.
     */
    public void setUnite(String unite) {
        this.unite = unite;
    }

    /**
     * Sets new prixUnitaire.
     *
     * @param prixUnitaire New value of prixUnitaire.
     */
    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    /**
     * Gets reception.
     *
     * @return Value of reception.
     */
    public List<Reception> getReception() {
        return reception;
    }

    /**
     * Sets new actif.
     *
     * @param actif New value of actif.
     */
    public void setActif(boolean actif) {
        this.actif = actif;
    }

    /**
     * Gets compositionCommandes.
     *
     * @return Value of compositionCommandes.
     */
    public List<CompositionCommande> getCompositionCommandes() {
        return compositionCommandes;
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
     * Gets prixUnitaire.
     *
     * @return Value of prixUnitaire.
     */
    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    /**
     * Sets new fabrication.
     *
     * @param fabrication New value of fabrication.
     */
    public void setFabrication(List<Fabrication> fabrication) {
        this.fabrication = fabrication;
    }

    /**
     * Gets unite.
     *
     * @return Value of unite.
     */
    public String getUnite() {
        return unite;
    }

    /**
     * Gets fabrication.
     *
     * @return Value of fabrication.
     */
    public List<Fabrication> getFabrication() {
        return fabrication;
    }

    /**
     * Gets nom.
     *
     * @return Value of nom.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets qteMaxEmp.
     *
     * @return Value of qteMaxEmp.
     */
    public float getQteMaxEmp() {
        return qteMaxEmp;
    }

    /**
     * Sets new couleur.
     *
     * @param couleur New value of couleur.
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Sets new qteMaxEmp.
     *
     * @param qteMaxEmp New value of qteMaxEmp.
     */
    public void setQteMaxEmp(float qteMaxEmp) {
        this.qteMaxEmp = qteMaxEmp;
    }

    /**
     * Sets new seuilQteMax.
     *
     * @param seuilQteMax New value of seuilQteMax.
     */
    public void setSeuilQteMax(float seuilQteMax) {
        this.seuilQteMax = seuilQteMax;
    }

    /**
     * Gets lot.
     *
     * @return Value of lot.
     */
    public List<Lot> getLot() {
        return lot;
    }

    /**
     * Sets new quantiteStock.
     *
     * @param quantiteStock New value of quantiteStock.
     */
    public void setQuantiteStock(float quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    /**
     * Sets new seuilQteMin.
     *
     * @param seuilQteMin New value of seuilQteMin.
     */
    public void setSeuilQteMin(float seuilQteMin) {
        this.seuilQteMin = seuilQteMin;
    }

    /**
     * Sets new lot.
     *
     * @param lot New value of lot.
     */
    public void setLot(List<Lot> lot) {
        this.lot = lot;
    }

    /**
     * Gets seuilQteMax.
     *
     * @return Value of seuilQteMax.
     */
    public float getSeuilQteMax() {
        return seuilQteMax;
    }

    /**
     * Gets couleur.
     *
     * @return Value of couleur.
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Gets actif.
     *
     * @return Value of actif.
     */
    public boolean isActif() {
        return actif;
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
     * Sets new compositionCommandes.
     *
     * @param compositionCommandes New value of compositionCommandes.
     */
    public void setCompositionCommandes(List<CompositionCommande> compositionCommandes) {
        this.compositionCommandes = compositionCommandes;
    }

    /**
     * Gets seuilQteMin.
     *
     * @return Value of seuilQteMin.
     */
    public float getSeuilQteMin() {
        return seuilQteMin;
    }

    /**
     * Sets new reception.
     *
     * @param reception New value of reception.
     */
    public void setReception(List<Reception> reception) {
        this.reception = reception;
    }

    /**
     * Sets new nom.
     *
     * @param nom New value of nom.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets quantiteStock.
     *
     * @return Value of quantiteStock.
     */
    public float getQuantiteStock() {
        return quantiteStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", reference='" + reference + '\'' +
                ", unite='" + unite + '\'' +
                ", quantiteStock=" + quantiteStock +
                ", seuilQteMin=" + seuilQteMin +
                ", seuilQteMax=" + seuilQteMax +
                ", qteMaxEmp=" + qteMaxEmp +
                ", prixUnitaire=" + prixUnitaire +
                ", couleur='" + couleur + '\'' +
                ", actif=" + actif +
                ", compositionCommandes=" + compositionCommandes +
                ", reception=" + reception +
                ", fabrication=" + fabrication +
                ", lot=" + lot +
                '}';
    }
}