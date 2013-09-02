package models;
/***********************************************************************
 * Module:  Salarie.java
 * Author:  antoi_000
 * Purpose: Defines the Class Salarie
 ***********************************************************************/

import models.enums.RoleSalarie;
import play.data.validation.Password;
import play.libs.Crypto;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
public class Salarie extends ModelCustom {

    public String identifiant;

    @Password
    public String mdp;
    public String reference;
    public String nom;
    public String prenom;
    public String fonction;
    public String ligneFixe;
    public String courriel;
    public boolean actif;

    @Enumerated(EnumType.STRING)
    public RoleSalarie roleSalarie;

    @OneToOne
    public Service service;

    public static Salarie connect(String identifiant, String mdp) {
        return find("byIdentifiantAndMdp", identifiant, mdp).first();
    }


    /**
     * Sets new mdp.
     *
     * @param mdp New value of mdp.
     */
    public void setMdp(String mdp) {
        this.mdp = Crypto.passwordHash(mdp);
    }
    public boolean hasMdp(String mdp) {
        return Crypto.passwordHash(mdp).equals(this.mdp);
    }

    /**
     * Gets reference.
     *
     * @return Value of reference.
     */
    public String getReference() {
        if (reference == null){
            Integer countSalarie = Integer.parseInt(Salarie.count() +"") + 1;
            reference = "S000000".substring(0,"S000000".length()-countSalarie.toString().length())+countSalarie;
        }
        return reference;
    }

    /**
     * Sets new reference.
     *
     * @param reference New value of reference.
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
}