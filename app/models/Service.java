package models;
/***********************************************************************
 * Module:  Service.java
 * Author:  antoi_000
 * Purpose: Defines the Class Service
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Service extends Model {
   private String libelle;

   @OneToMany
   private List<Salarie> salarie;

   @OneToMany
   private List<Alerte> alerte;

    public Service(String libelle, List<Salarie> salarie, List<Alerte> alerte) {
        this.libelle = libelle;
        this.salarie = salarie;
        this.alerte = alerte;
    }

    /**
     * Gets alerte.
     *
     * @return Value of alerte.
     */
    public List<Alerte> getAlerte() {
        return alerte;
    }

    /**
     * Sets new salarie.
     *
     * @param salarie New value of salarie.
     */
    public void setSalarie(List<Salarie> salarie) {
        this.salarie = salarie;
    }

    /**
     * Gets salarie.
     *
     * @return Value of salarie.
     */
    public List<Salarie> getSalarie() {
        return salarie;
    }

    /**
     * Gets libelle.
     *
     * @return Value of libelle.
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets new libelle.
     *
     * @param libelle New value of libelle.
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Sets new alerte.
     *
     * @param alerte New value of alerte.
     */
    public void setAlerte(List<Alerte> alerte) {
        this.alerte = alerte;
    }

    @Override
    public String toString() {
        return "Service{" +
                "libelle='" + libelle + '\'' +
                ", salarie=" + salarie +
                ", alerte=" + alerte +
                '}';
    }
}