package models;
/***********************************************************************
 * Module:  Partenaire.java
 * Author:  antoine
 * Purpose: Defines the Class Partenaire
 ***********************************************************************/

import play.data.validation.Required;
import play.db.jpa.Model;
import models.enums.Type;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    public int capital;

    @OneToMany(mappedBy = "partenaire")
    public List<Commande> commandes;

    @OneToMany(mappedBy = "partenaire", cascade = CascadeType.ALL)
    public List<CoordonneePostale> coordonneePostales = new ArrayList<>();

    @OneToMany(mappedBy = "partenaire")
    public List<Contact> contacts;

}