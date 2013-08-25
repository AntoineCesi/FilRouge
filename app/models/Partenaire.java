package models;
/***********************************************************************
 * Module:  Partenaire.java
 * Author:  antoine
 * Purpose: Defines the Class Partenaire
 ***********************************************************************/

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import play.data.validation.Required;
import play.db.jpa.Model;
import models.enums.Type;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Partenaire extends Model{

    @Enumerated(EnumType.STRING)
    public Type type;

    public String nom;
    public String noSIRET;

    @Required
    public String reference;

    public boolean actif;
    public Integer capital;

    @OneToMany(mappedBy = "partenaire")
    public List<Commande> commandes;

    @OneToMany(mappedBy = "partenaire", fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    @OnDelete(action = OnDeleteAction.CASCADE)
    public List<CoordonneePostale> coordonneePostales;

    @OneToMany(mappedBy = "partenaire")
    public List<Contact> contacts;


    /**
     * Gets coordonneePostales.
     *
     * @return Value of coordonneePostales.
     */
//    public List<CoordonneePostale> getCoordonneePostales() {
//        if (coordonneePostales == null) coordonneePostales = new ArrayList<CoordonneePostale>();
//        return coordonneePostales;
//    }

    /**
     * Sets new coordonneePostales.
     *
     * @param coordonneePostales New value of coordonneePostales.
     */
//    public void setCoordonneePostales(List<CoordonneePostale> coordonneePostales) {
//        getCoordonneePostales().clear();
//        if (coordonneePostales != null) {
//            coordonneePostales.removeAll(Collections.singleton(null));
//            for (CoordonneePostale coordonneePostale : coordonneePostales) {
//                coordonneePostale.partenaire = this;
//            }
//            this.coordonneePostales.addAll(coordonneePostales);
//        }
//    }
}