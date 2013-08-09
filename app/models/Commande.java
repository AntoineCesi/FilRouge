package models;
/***********************************************************************
 * Module:  Commande.java
 * Author:  antoine
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import java.util.*;

public class Commande {
   private long id;
   private java.lang.String reference;
   private java.lang.String type;
   private long idPartenaire;

    public Commande(long id, String reference, String type, long idPartenaire) {
        this.id = id;
        this.reference = reference;
        this.type = type;
        this.idPartenaire = idPartenaire;
    }

    public long getid() {
        return id;
    }

    public long getIdPartenaire() {
        return idPartenaire;
    }

    public String getreference() {
        return reference;
    }

    public void setreference(String reference) {
        this.reference = reference;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", type='" + type + '\'' +
                ", idPartenaire='" + idPartenaire + '\'' +
                '}';
    }
}