package models;
/***********************************************************************
 * Module:  CoordonneePostale.java
 * Author:  antoine
 * Purpose: Defines the Class CoordonneePostale
 ***********************************************************************/

import java.util.*;

public class CoordonneePostale {
   private long id;
   private java.lang.String adresse;
   private java.lang.String cp;
   private java.lang.String ville;
   private java.lang.String pays;
   private java.lang.String libelle;
   private long idPartenaire;

    public CoordonneePostale(long id, String adresse, String cp, String ville, String pays, String libelle, long idPartenaire) {
        this.id = id;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.libelle = libelle;
        this.idPartenaire = idPartenaire;
    }

    public long getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public long getIdPartenaire() {
        return idPartenaire;
    }

    @Override
    public String toString() {
        return "CoordonneePostale{" +
                "id=" + id +
                ", adresse='" + adresse + '\'' +
                ", cp='" + cp + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", libelle='" + libelle + '\'' +
                ", idPartenaire=" + idPartenaire +
                '}';
    }
}