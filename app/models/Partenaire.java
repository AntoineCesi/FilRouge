package models;
/***********************************************************************
 * Module:  Partenaire.java
 * Author:  antoine
 * Purpose: Defines the Class Partenaire
 ***********************************************************************/

import play.db.jpa.Model;
import models.enums.Type;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Partenaire extends Model{

    private String nom;
    private String noSIRET;
    private int capital;
    private boolean actif;
    private String reference;

    @Enumerated(EnumType.STRING)
    private Type type;

    @OneToMany(mappedBy = "partenaire")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "partenaire")
    private List<CoordonneePostale> coordonneePostales;

    @OneToMany(mappedBy = "partenaire")
    private List<Contact> contacts;

}