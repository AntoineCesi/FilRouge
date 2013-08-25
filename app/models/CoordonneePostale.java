package models; /***********************************************************************
 * Module:  CoordonneePostale.java
 * Author:  antoine
 * Purpose: Defines the Class CoordonneePostale
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CoordonneePostale extends Model{

    public String adresse;
    public String cp;
    public String ville;
    public String pays;
    public String libelle;

   @JoinColumn(name = "partenaire_id", referencedColumnName = "id")
   @ManyToOne
   public Partenaire partenaire;


}