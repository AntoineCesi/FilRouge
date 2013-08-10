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

    private String identifiant;
    private String mdp;
    private String reference;
    private String nom;
    private String prenom;
    private String fonction;
    private String ligneFixe;
    private String courriel;
    private boolean actif;

    @OneToOne
    private Service service;


    /**
     * Gets courriel.
     *
     * @return Value of courriel.
     */
    public String getCourriel() {
        return courriel;
    }

    /**
     * Sets new identifiant.
     *
     * @param identifiant New value of identifiant.
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
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
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        return reference;
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
     * Gets nom.
     *
     * @return Value of nom.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets mdp.
     *
     * @return Value of mdp.
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * Sets new mdp.
     *
     * @param mdp New value of mdp.
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
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
     * Sets new actif.
     *
     * @param actif New value of actif.
     */
    public void setActif(boolean actif) {
        this.actif = actif;
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
     * Gets identifiant.
     *
     * @return Value of identifiant.
     */
    public String getIdentifiant() {
        return identifiant;
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
     * Gets prenom.
     *
     * @return Value of prenom.
     */
    public String getPrenom() {
        return prenom;
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
     * Sets new service.
     *
     * @param service New value of service.
     */
    public void setService(Service service) {
        this.service = service;
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
     * Sets new ligneFixe.
     *
     * @param ligneFixe New value of ligneFixe.
     */
    public void setLigneFixe(String ligneFixe) {
        this.ligneFixe = ligneFixe;
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "identifiant='" + identifiant + '\'' +
                ", mdp='" + mdp + '\'' +
                ", reference='" + reference + '\'' +
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