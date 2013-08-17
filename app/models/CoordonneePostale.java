package models; /***********************************************************************
 * Module:  CoordonneePostale.java
 * Author:  antoine
 * Purpose: Defines the Class CoordonneePostale
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class CoordonneePostale extends Model{

    public String adresse;
    public String cp;
    public String ville;
    public String pays;
    public String libelle;

   @OneToOne
   public Partenaire partenaire;


    /**
     * Sets new ville.
     *
     * @param ville New value of ville.
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Sets new pays.
     *
     * @param pays New value of pays.
     */
    public void setPays(String pays) {
        this.pays = pays;
    }

    /**
     * Sets new cp.
     *
     * @param cp New value of cp.
     */
    public void setCp(String cp) {
        this.cp = cp;
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
     * Gets pays.
     *
     * @return Value of pays.
     */
    public String getPays() {
        return pays;
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
     * Gets ville.
     *
     * @return Value of ville.
     */
    public String getVille() {
        return ville;
    }

    /**
     * Gets libelle.
     *
     * @return Value of libelle.
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Gets cp.
     *
     * @return Value of cp.
     */
    public String getCp() {
        return cp;
    }

    /**
     * Sets new adresse.
     *
     * @param adresse New value of adresse.
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Gets adresse.
     *
     * @return Value of adresse.
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Sets new libelle.
     *
     * @param libelle New value of libelle.
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "CoordonneePostale{" +
                "adresse='" + adresse + '\'' +
                ", cp='" + cp + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", libelle='" + libelle + '\'' +
                ", partenaire=" + partenaire +
                '}';
    }
}