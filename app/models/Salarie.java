package models;
/***********************************************************************
 * Module:  Salarie.java
 * Author:  antoi_000
 * Purpose: Defines the Class Salarie
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Salarie extends Model {

    private String reference;
    private String nom;
    private String prenom;
    private String fonction;
    private String ligneFixe;
    private String courriel;
    private boolean actif;

    @OneToOne
    private Service service;

    public Salarie(String reference, String nom, String prenom, String fonction, String ligneFixe, String courriel, boolean actif, Service service) {
        this.reference = reference;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.ligneFixe = ligneFixe;
        this.courriel = courriel;
        this.actif = actif;
        this.service = service;
    }

    /**
     * Gets service.
     *
     * @return Value of service.
     */
    public Service getService() {
        return service;
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
     * Gets ligneFixe.
     *
     * @return Value of ligneFixe.
     */
    public String getLigneFixe() {
        return ligneFixe;
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
     * Sets new courriel.
     *
     * @param courriel New value of courriel.
     */
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    /**
     * Gets fonction.
     *
     * @return Value of fonction.
     */
    public String getFonction() {
        return fonction;
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
     * Sets new prenom.
     *
     * @param prenom New value of prenom.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
     * Sets new fonction.
     *
     * @param fonction New value of fonction.
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
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
     * Gets courriel.
     *
     * @return Value of courriel.
     */
    public String getCourriel() {
        return courriel;
    }

    /**
     * Gets prenom.
     *
     * @return Value of prenom.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets new service.
     *
     * @param service New value of service.
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * Sets new ligneFixe.
     *
     * @param ligneFixe New value of ligneFixe.
     */
    public void setLigneFixe(String ligneFixe) {
        this.ligneFixe = ligneFixe;
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
        return "Salarie{" +
                "reference='" + reference + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fonction='" + fonction + '\'' +
                ", ligneFixe='" + ligneFixe + '\'' +
                ", courriel='" + courriel + '\'' +
                ", actif=" + actif +
                ", service=" + service +
                '}';
    }
}