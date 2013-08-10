package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Date: 10/08/13
 */

@Entity
public class Nomenclature extends Model {

    @OneToOne
    private Produit produitCompose;

    @OneToOne
    private Produit produitComposant;

    private float quantiteComposant;


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
    public float getQuantiteComposant() {
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
    public void setQuantiteComposant(float quantiteComposant) {
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
