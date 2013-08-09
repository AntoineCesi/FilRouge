package models;
/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  antoi_000
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Utilisateur extends Model{

    private String identifiant;
    private String mdp;

    public Utilisateur(String identifiant, String mdp) {
        this.identifiant = identifiant;
        this.mdp = mdp;
    }

    /**
     * Gets mdp.
     *
     * @return Value of mdp.
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * Sets new identifiant.
     *
     * @param identifiant New value of identifiant.
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    /**
     * Sets new mdp.
     *
     * @param mdp New value of mdp.
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * Gets identifiant.
     *
     * @return Value of identifiant.
     */
    public String getIdentifiant() {
        return identifiant;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "identifiant='" + identifiant + '\'' +
                ", mdp='" + mdp + '\'' +
                '}';
    }
}