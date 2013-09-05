package models;
/***********************************************************************
 * Module:  Commande.java
 * Author:  antoine
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import models.enums.Type;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.*;

@Entity
public class Commande extends ModelCustom{

    public String reference;

    @Enumerated(EnumType.STRING)
    public Type type;

   @OneToMany(mappedBy = "commande")
   public List<Reception> receptions;

   @OneToMany(mappedBy="commande",fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
   @Fetch(value = FetchMode.SUBSELECT)
   public List<CompositionCommande> compositionCommandes;

   @OneToOne
   public Partenaire partenaire;

   @OneToMany(mappedBy = "commande")
   public List<StatutCommande> statutCommandes;


    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        if (reference == null){
            Integer countReference = Integer.parseInt(Commande.count() +"") + 1;
            reference = "C000000".substring(0,7-countReference.toString().length())+countReference;
        }
        return reference;
    }

    /**
     * Gets statutCommandes.
     *
     * @return Value of statutCommandes.
     */
    public List<StatutCommande> getStatutCommandes() {
        return statutCommandes;
    }

    /**
     * Gets type.
     *
     * @return Value of type.
     */
    public Type getType() {
        return type;
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
     * Sets new reference.
     *
     * @param reference New value of reference.
     */
    public void setReference(String reference) {
        this.reference = reference;
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
     * Sets new statutCommandes.
     *
     * @param statutCommandes New value of statutCommandes.
     */
    public void setStatutCommandes(List<StatutCommande> statutCommandes) {
        this.statutCommandes = statutCommandes;
    }

    /**
     * Sets new compositionCommandes.
     *
     * @param compositionCommandes New value of compositionCommandes.
     */
    public void setCompositionCommandes(List<CompositionCommande> compositionCommandes) {
        getCompositionCommandes().clear();
        if (compositionCommandes != null) {
            compositionCommandes.removeAll(Collections.singleton(null));
            for (CompositionCommande compositionCommande : compositionCommandes) {
                compositionCommande.commande = this;
            }
            this.compositionCommandes.addAll(compositionCommandes);
        }
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(Type type) {
        this.type = type;
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
     * Sets new partenaire.
     *
     * @param partenaire New value of partenaire.
     */
    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }

    /**
     * Gets compositionCommandes.
     *
     * @return Value of compositionCommandes.
     */
    public List<CompositionCommande> getCompositionCommandes() {
        if (compositionCommandes == null) compositionCommandes = new ArrayList<>();
        return compositionCommandes;
    }

    @Override
    public String toString() {
        return reference;
    }
}