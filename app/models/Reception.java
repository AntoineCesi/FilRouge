package models; /***********************************************************************
 * Module:  Reception.java
 * Author:  antoi_000
 * Purpose: Defines the Class Reception
 ***********************************************************************/

import play.db.jpa.Model;

import javax.persistence.Entity;
import java.util.*;

@Entity
public class Reception extends Model{

    private float recQuantite;
    private Date recDate;


    public Reception(Date recDate, float recQuantite) {
        this.recDate = recDate;
        this.recQuantite = recQuantite;
    }

    /**
     * Sets new recQuantite.
     *
     * @param recQuantite New value of recQuantite.
     */
    public void setRecQuantite(float recQuantite) {
        this.recQuantite = recQuantite;
    }

    /**
     * Gets recQuantite.
     *
     * @return Value of recQuantite.
     */
    public float getRecQuantite() {
        return recQuantite;
    }

    /**
     * Sets new recDate.
     *
     * @param recDate New value of recDate.
     */
    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    /**
     * Gets recDate.
     *
     * @return Value of recDate.
     */
    public Date getRecDate() {
        return recDate;
    }

    @Override
    public String toString() {
        return "Reception{" +
                "recQuantite=" + recQuantite +
                ", recDate=" + recDate +
                '}';
    }
}