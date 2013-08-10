package models;
/***********************************************************************
 * Module:  Commande.java
 * Author:  antoine
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import models.enums.Type;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Commande extends Model{

   private String reference;

    @Enumerated(EnumType.STRING)
    private Type type;

   @OneToMany(mappedBy = "commande")
   private List<Reception> receptions;

   @OneToMany(mappedBy="commande")
   private List<CompositionCommande> compositionCommandes;

   @OneToOne
   private Partenaire partenaire;

   @OneToMany(mappedBy = "commande")
   private List<StatutCommande> statutCommandes;


}