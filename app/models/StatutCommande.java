package models;
/***********************************************************************
 * Module:  CommandeAvoirStatut.java
 * Author:  antoi_000
 * Purpose: Defines the Class CommandeAvoirStatut
 ***********************************************************************/

import models.enums.Statut;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class StatutCommande extends ModelCustom{

   private Date statutDate;

   @OneToOne
   private Commande commande;


    @Enumerated(EnumType.STRING)
    private Statut statut;


    /**
     * Sets new statut.
     *
     * @param statut New value of statut.
     */
    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    /**
     * Gets statut.
     *
     * @return Value of statut.
     */
    public Statut getStatut() {
        return statut;
    }

    /**
     * Gets commande.
     *
     * @return Value of commande.
     */
    public Commande getCommande() {
        return commande;
    }

    /**
     * Sets new commande.
     *
     * @param commande New value of commande.
     */
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    /**
     * Gets statutDate.
     *
     * @return Value of statutDate.
     */
    public Date getStatutDate() {
        return statutDate;
    }

    /**
     * Sets new statutDate.
     *
     * @param statutDate New value of statutDate.
     */
    public void setStatutDate(Date statutDate) {
        this.statutDate = statutDate;
    }

    @Override
    public String toString() {
        return "StatutCommande{" +
                "statutDate=" + statutDate +
                ", commande=" + commande +
                ", statut=" + statut +
                '}';
    }
}