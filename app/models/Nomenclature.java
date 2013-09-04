package models;

import play.data.validation.Required;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Date: 10/08/13
 */

@Entity
public class Nomenclature extends ModelCustom {

    @OneToOne
    public Produit produitCompose;

    @OneToOne
    public Produit produitComposant;

    @Required
    public Float quantiteComposant;


    /**
     * Sets new produitComposant.
     *
     * @param produitComposant New value of produitComposant.
     */
    public void setProduitComposant(Produit produitComposant) {
        this.produitComposant = produitComposant;
    }

    /**
     * Gets quantiteComposant.
     *
     * @return Value of quantiteComposant.
     */
    public Float getQuantiteComposant() {
        return quantiteComposant;
    }

    /**
     * Gets produitCompose.
     *
     * @return Value of produitCompose.
     */
    public Produit getProduitCompose() {
        return produitCompose;
    }

    /**
     * Gets produitComposant.
     *
     * @return Value of produitComposant.
     */
    public Produit getProduitComposant() {
        return produitComposant;
    }

    /**
     * Sets new quantiteComposant.
     *
     * @param quantiteComposant New value of quantiteComposant.
     */
    public void setQuantiteComposant(Float quantiteComposant) {
        this.quantiteComposant = quantiteComposant;
    }

    /**
     * Sets new produitCompose.
     *
     * @param produitCompose New value of produitCompose.
     */
    public void setProduitCompose(Produit produitCompose) {
        this.produitCompose = produitCompose;
    }

    @Override
    public String toString() {
        return "Nomenclature{" +
                "produitCompose=" + produitCompose +
                ", produitComposant=" + produitComposant +
                ", quantiteComposant=" + quantiteComposant +
                '}';
    }
}
