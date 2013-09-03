package controllers;

import models.Produit;
import play.mvc.With;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 10/08/13
 */
@With(Secure.class)
public class Produits extends CRUD{

    public static void produits(){
        List<Produit> produits = Produit.findAll();
        List<ObjectSelect> objectSelects = new ArrayList<ObjectSelect>();
        for (Produit produit : produits) {
            ObjectSelect objectSelect = new ObjectSelect();
            objectSelect.value = produit.getId();
            objectSelect.text = produit.getReference();
            objectSelects.add(objectSelect);
        }
        renderJSON(objectSelects);
    }
}
