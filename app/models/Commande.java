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

    public Commande(long id, String reference, String type) {
        this.id = id;
        this.reference = reference;
        this.type = type;
    }

    public long getid() {
        return id;
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
                '}';
    }
}