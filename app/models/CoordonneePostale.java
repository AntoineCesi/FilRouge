package models; /***********************************************************************
 * Module:  CoordonneePostale.java
 * Author:  antoine
 * Purpose: Defines the Class CoordonneePostale
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CoordonneePostale extends ModelCustom{

    public String adresse;
    public String cp;
    public String ville;
    public String pays;
    public String libelle;

   @JoinColumn(name = "partenaire_id", referencedColumnName = "id")
   @ManyToOne
   public Partenaire partenaire;


}