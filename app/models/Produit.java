package models; /***********************************************************************
 * Module:  Produit.java
 * Author:  antoi_000
 * Purpose: Defines the Class Produit
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Produit extends Model{

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

    @ManyToMany
    private List<Commande> commandes;

    @OneToMany
    private List<Reception> reception;

    @OneToMany
    private List<Fabrication> fabrication;

    @OneToMany
    private List<Lot> lot;

    public Produit(String nom, String reference, String unite, float quantiteStock, float seuilQteMin,
                   float seuilQteMax, float qteMaxEmp, float prixUnitaire, String couleur,
                   boolean actif, List<Commande> commandes,
                   List<Reception> reception, List<Fabrication> fabrication, List<Lot> lot) {
        this.nom = nom;
        this.reference = reference;
        this.unite = unite;
        this.quantiteStock = quantiteStock;
        this.seuilQteMin = seuilQteMin;
        this.seuilQteMax = seuilQteMax;
        this.qteMaxEmp = qteMaxEmp;
        this.prixUnitaire = prixUnitaire;
        this.couleur = couleur;
        this.actif = actif;
        this.commandes = commandes;
        this.reception = reception;
        this.fabrication = fabrication;
        this.lot = lot;
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
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        return reference;
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
     * Gets couleur.
     *
     * @return Value of couleur.
     */
    public String getCouleur() {
        return couleur;
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
     * Gets seuilQteMax.
     *
     * @return Value of seuilQteMax.
     */
    public float getSeuilQteMax() {
        return seuilQteMax;
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
     * Gets commandes.
     *
     * @return Value of commandes.
     */
    public List<Commande> getCommandes() {
        return commandes;
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
     * Sets new prixUnitaire.
     *
     * @param prixUnitaire New value of prixUnitaire.
     */
    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
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
     * Sets new lot.
     *
     * @param lot New value of lot.
     */
    public void setLot(List<Lot> lot) {
        this.lot = lot;
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
     * Sets new reference.
     *
     * @param reference New value of reference.
     */
    public void setReference(String reference) {
        this.reference = reference;
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
     * Gets nom.
     *
     * @return Value of nom.
     */
    public String getNom() {
        return nom;
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
     * Sets new couleur.
     *
     * @param couleur New value of couleur.
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Sets new commandes.
     *
     * @param commandes New value of commandes.
     */
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
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
     * Sets new seuilQteMax.
     *
     * @param seuilQteMax New value of seuilQteMax.
     */
    public void setSeuilQteMax(float seuilQteMax) {
        this.seuilQteMax = seuilQteMax;
    }

    /**
     * Gets quantiteStock.
     *
     * @return Value of quantiteStock.
     */
    public float getQuantiteStock() {
        return quantiteStock;
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
     * Gets fabrication.
     *
     * @return Value of fabrication.
     */
    public List<Fabrication> getFabrication() {
        return fabrication;
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
     * Gets qteMaxEmp.
     *
     * @return Value of qteMaxEmp.
     */
    public float getQteMaxEmp() {
        return qteMaxEmp;
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
     * Sets new unite.
     *
     * @param unite New value of unite.
     */
    public void setUnite(String unite) {
        this.unite = unite;
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
                ", commandes=" + commandes +
                ", reception=" + reception +
                ", fabrication=" + fabrication +
                ", lot=" + lot +
                '}';
    }
}