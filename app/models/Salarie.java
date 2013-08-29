package models;
/***********************************************************************
 * Module:  Salarie.java
 * Author:  antoi_000
 * Purpose: Defines the Class Salarie
 ***********************************************************************/

import models.enums.RoleSalarie;
import play.data.validation.Password;

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
    private Service service;

    public static Salarie connect(String identifiant, String mdp) {
        return find("byIdentifiantAndMdp", identifiant, mdp).first();
    }


}