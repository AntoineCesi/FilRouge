package models;
/***********************************************************************
 * Module:  Partenaire.java
 * Author:  antoi_000
 * Purpose: Defines the Class Partenaire
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Partenaire extends Model{

    private String nom;
    private String noSIRET;
    private int capital;
    private boolean actif;
    private String reference;
    private String type;

    @OneToMany
    private List<Commande> commande;

    @OneToMany
    private List<CoordonneePostale> coordonneePostale;

    @OneToMany
    private List<Contact> contact;

    public Partenaire(long id, String nom, String noSIRET, int capital, boolean actif, String reference, String type) {
        this.id = id;
        this.nom = nom;
        this.noSIRET = noSIRET;
        this.capital = capital;
        this.actif = actif;
        this.reference = reference;
        this.type = type;
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
     * Sets new capital.
     *
     * @param capital New value of capital.
     */
    public void setCapital(int capital) {
        this.capital = capital;
    }

    /**
     * Gets commande.
     *
     * @return Value of commande.
     */
    public List<Commande> getCommande() {
        return commande;
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
     * Gets noSIRET.
     *
     * @return Value of noSIRET.
     */
    public String getNoSIRET() {
        return noSIRET;
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
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        return reference;
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
     * Gets type.
     *
     * @return Value of type.
     */
    public String getType() {
        return type;
    }

    /**
     * Gets coordonneePostale.
     *
     * @return Value of coordonneePostale.
     */
    public List<CoordonneePostale> getCoordonneePostale() {
        return coordonneePostale;
    }

    /**
     * Sets new contact.
     *
     * @param contact New value of contact.
     */
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    /**
     * Gets capital.
     *
     * @return Value of capital.
     */
    public int getCapital() {
        return capital;
    }

    /**
     * Sets new commande.
     *
     * @param commande New value of commande.
     */
    public void setCommande(List<Commande> commande) {
        this.commande = commande;
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
     * Sets new noSIRET.
     *
     * @param noSIRET New value of noSIRET.
     */
    public void setNoSIRET(String noSIRET) {
        this.noSIRET = noSIRET;
    }

    /**
     * Sets new coordonneePostale.
     *
     * @param coordonneePostale New value of coordonneePostale.
     */
    public void setCoordonneePostale(List<CoordonneePostale> coordonneePostale) {
        this.coordonneePostale = coordonneePostale;
    }

    /**
     * Gets contact.
     *
     * @return Value of contact.
     */
    public List<Contact> getContact() {
        return contact;
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Partenaire{" +
                "nom='" + nom + '\'' +
                ", noSIRET='" + noSIRET + '\'' +
                ", capital=" + capital +
                ", actif=" + actif +
                ", reference='" + reference + '\'' +
                ", type='" + type + '\'' +
                ", commande=" + commande +
                ", coordonneePostale=" + coordonneePostale +
                ", contact=" + contact +
                '}';
    }
}