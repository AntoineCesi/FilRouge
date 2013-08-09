package models;
/***********************************************************************
 * Module:  Contact.java
 * Author:  antoine
 * Purpose: Defines the Class Contact
 ***********************************************************************/

import java.util.*;

public class Contact {
   private long id;
   private java.lang.String nom;
   private java.lang.String prenom;
   private java.lang.String service;
   private java.lang.String reference;
   private java.lang.String fonction;
   private java.lang.String telPort;
   private java.lang.String ligneFixe;
   private java.lang.String fax;
   private java.lang.String courriel;
   private boolean actif;
   private long idPartenaire;

    public Contact(long id, String nom, String prenom, String service, String reference, String fonction, String telPort, String ligneFixe, String fax, String courriel, boolean actif, long idPartenaire) {
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
        this.idPartenaire = idPartenaire;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getLigneFixe() {
        return ligneFixe;
    }

    public void setLigneFixe(String ligneFixe) {
        this.ligneFixe = ligneFixe;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public long getIdPartenaire() {
        return idPartenaire;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", service='" + service + '\'' +
                ", reference='" + reference + '\'' +
                ", fonction='" + fonction + '\'' +
                ", telPort='" + telPort + '\'' +
                ", ligneFixe='" + ligneFixe + '\'' +
                ", fax='" + fax + '\'' +
                ", courriel='" + courriel + '\'' +
                ", actif=" + actif +
                ", idPartenaire=" + idPartenaire +
                '}';
    }
}