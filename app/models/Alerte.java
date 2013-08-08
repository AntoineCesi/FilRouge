package models;
/***********************************************************************
 * Module:  Alerte.java
 * Author:  Antoine
 * Purpose: Defines the Class Alerte
 ***********************************************************************/

import java.util.*;

public class Alerte {
   private long id;
   private java.util.Date date;
   private boolean visible;
   private java.lang.String libelle;

    public Alerte(long id, Date date, boolean visible, String libelle) {
        this.id = id;
        this.date = date;
        this.visible = visible;
        this.libelle = libelle;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Alerte{" +
                "id=" + id +
                ", date=" + date +
                ", visible=" + visible +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}