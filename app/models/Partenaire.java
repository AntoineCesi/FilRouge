package models;

/***********************************************************************
 * Module:  Partenaire.java
 * Author:  antoine
 * Purpose: Defines the Class Partenaire
 ***********************************************************************/

import java.util.*;


public class Partenaire {
   private long id;
   private java.lang.String nom;
   private java.lang.String noSIRET;
   private int capital;
   private boolean actif;
   private java.lang.String reference;
   private java.lang.String type;

    public Partenaire(long id, String nom, String noSIRET, int capital, boolean actif, String reference, String type) {
        this.id = id;
        this.nom = nom;
        this.noSIRET = noSIRET;
        this.capital = capital;
        this.actif = actif;
        this.reference = reference;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNoSIRET() {
        return noSIRET;
    }

    public void setNoSIRET(String noSIRET) {
        this.noSIRET = noSIRET;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Partenaire{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", noSIRET='" + noSIRET + '\'' +
                ", capital=" + capital +
                ", actif=" + actif +
                ", reference='" + reference + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}