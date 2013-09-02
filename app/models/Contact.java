package models; /***********************************************************************
 * Module:  Contact.java
 * Author:  antoine
 * Purpose: Defines the Class Contact
 ***********************************************************************/

import play.data.validation.Required;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Contact extends ModelCustom {

    @Required
    private String nom;
    @Required
    private String prenom;
    private String service;
    @Required
    private String reference;
    private String fonction;
    private String telPort;
    private String ligneFixe;
    private String fax;
    private String courriel;
    private boolean actif;

    @OneToOne
    private Partenaire partenaire;

    public Contact(long id, String nom, String prenom, String service, String reference, String fonction,
                   String telPort, String ligneFixe, String fax, String courriel,
                   boolean actif, Partenaire partenaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.service = service;
        this.reference = reference;
        this.fonction = fonction;
        this.telPort = telPort;
        this.ligneFixe = ligneFixe;
        this.fax = fax;
        this.courriel = courriel;
        this.actif = actif;
        this.partenaire = partenaire;
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
     * Sets new fax.
     *
     * @param fax New value of fax.
     */
    public void setFax(String fax) {
        this.fax = fax;
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
     * Gets fax.
     *
     * @return Value of fax.
     */
    public String getFax() {
        return fax;
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
     * Sets new service.
     *
     * @param service New value of service.
     */
    public void setService(String service) {
        this.service = service;
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
     * Sets new actif.
     *
     * @param actif New value of actif.
     */
    public void setActif(boolean actif) {
        this.actif = actif;
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
     * Gets service.
     *
     * @return Value of service.
     */
    public String getService() {
        return service;
    }

    /**
     * Gets telPort.
     *
     * @return Value of telPort.
     */
    public String getTelPort() {
        return telPort;
    }

    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        if (reference == null){
            Integer countContact = Integer.parseInt(Contact.count() + "") + 1;
            reference = "C000000".substring(0, "C000000".length() - countContact.toString().length()) + countContact;
        }
        return reference;
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
     * Gets prenom.
     *
     * @return Value of prenom.
     */
    public String getPrenom() {
        return prenom;
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
     * Sets new telPort.
     *
     * @param telPort New value of telPort.
     */
    public void setTelPort(String telPort) {
        this.telPort = telPort;
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
     * Sets new reference.
     *
     * @param reference New value of reference.
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
}