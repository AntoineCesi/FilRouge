package models;
/***********************************************************************
 * Module:  Commande.java
 * Author:  antoine
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class Commande extends Model{

   private String reference;
   private String type;

   @OneToMany(mappedBy = "commande")
   private List<Reception> receptions;

   @OneToMany(mappedBy="commande")
   private List<CompositionCommande> compositionCommandes;

   @OneToOne
   private Partenaire partenaire;

   @OneToMany(mappedBy = "commande")
   private List<StatutCommande> statutCommandes;


    /**
     * Sets new compositionCommandes.
     *
     * @param compositionCommandes New value of compositionCommandes.
     */
    public void setCompositionCommandes(List<CompositionCommande> compositionCommandes) {
        this.compositionCommandes = compositionCommandes;
    }

    /**
     * Gets compositionCommandes.
     *
     * @return Value of compositionCommandes.
     */
    public List<CompositionCommande> getCompositionCommandes() {
        return compositionCommandes;
    }

    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets new receptions.
     *
     * @param receptions New value of receptions.
     */
    public void setReceptions(List<Reception> receptions) {
        this.receptions = receptions;
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
     * Sets new partenaire.
     *
     * @param partenaire New value of partenaire.
     */
    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }

    /**
     * Gets partenaire.
     *
     * @return Value of partenaire.
     */
    public Partenaire getPartenaire() {
        return partenaire;
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
     * Sets new reference.
     *
     * @param reference New value of reference.
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Gets commandeAvoirStatuts.
     *
     * @return Value of commandeAvoirStatuts.
     */
    public List<StatutCommande> getStatutCommandes() {
        return statutCommandes;
    }

    /**
     * Gets receptions.
     *
     * @return Value of receptions.
     */
    public List<Reception> getReceptions() {
        return receptions;
    }

    /**
     * Sets new commandeAvoirStatuts.
     *
     * @param statutCommandes New value of commandeAvoirStatuts.
     */
    public void setStatutCommandes(List<StatutCommande> statutCommandes) {
        this.statutCommandes = statutCommandes;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "reference='" + reference + '\'' +
                ", type='" + type + '\'' +
                ", receptions=" + receptions +
                ", compositionCommandes=" + compositionCommandes +
                ", partenaire=" + partenaire +
                ", commandeAvoirStatuts=" + statutCommandes +
                '}';
    }
}