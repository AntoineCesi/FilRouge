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

    @OneToMany(mappedBy = "partenaire")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "partenaire")
    private List<CoordonneePostale> coordonneePostales;

    @OneToMany(mappedBy = "partenaire")
    private List<Contact> contacts;


    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Gets coordonneePostales.
     *
     * @return Value of coordonneePostales.
     */
    public List<CoordonneePostale> getCoordonneePostales() {
        return coordonneePostales;
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
     * Sets new commandes.
     *
     * @param commandes New value of commandes.
     */
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    /**
     * Sets new contacts.
     *
     * @param contacts New value of contacts.
     */
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
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
     * Gets actif.
     *
     * @return Value of actif.
     */
    public boolean isActif() {
        return actif;
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
     * Gets capital.
     *
     * @return Value of capital.
     */
    public int getCapital() {
        return capital;
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
     * Sets new noSIRET.
     *
     * @param noSIRET New value of noSIRET.
     */
    public void setNoSIRET(String noSIRET) {
        this.noSIRET = noSIRET;
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
     * Gets contacts.
     *
     * @return Value of contacts.
     */
    public List<Contact> getContacts() {
        return contacts;
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
     * Sets new coordonneePostales.
     *
     * @param coordonneePostales New value of coordonneePostales.
     */
    public void setCoordonneePostales(List<CoordonneePostale> coordonneePostales) {
        this.coordonneePostales = coordonneePostales;
    }

    /**
     * Gets noSIRET.
     *
     * @return Value of noSIRET.
     */
    public String getNoSIRET() {
        return noSIRET;
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
                ", commandes=" + commandes +
                ", coordonneePostales=" + coordonneePostales +
                ", contacts=" + contacts +
                '}';
    }
}