package models;

import play.db.jpa.GenericModel;
import play.db.jpa.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Date: 26/08/13
 */

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base class for JPA model objects
 * Automatically provide a Boolean deleted field
 */
@MappedSuperclass
public class ModelCustom extends Model {

    public boolean deleted = false;

    /**
     * Gets deleted.
     *
     * @return Value of deleted.
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets new deleted.
     *
     * @param deleted New value of deleted.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}

